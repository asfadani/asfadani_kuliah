"""
GENERATOR DATA PROYEK AKHIR PRAKTIKUM BIG DATA
Universitas Tidar - Program Studi Teknologi Informasi

CARA PAKAI:
1. Isi variabel NPM di bawah dengan NPM anda sendiri (string angka).
2. Jalankan:  python generator_data_proyek.py
3. Jangan mengubah isi fungsi apa pun selain variabel NPM.

Output (dibuat di folder ./data_proyek/):
  - transaksi/transaksi_part1.csv ... part4.csv  (total 2.000.000 baris, data utama)
  - pelanggan.json                                (JSON Lines, 50.000 pelanggan)
  - produk.json                                   (JSON Lines, 5.000 produk, atribut bervariasi)
  - stream_input/stream_01.csv ... stream_20.csv  (20 berkas micro-batch untuk simulasi streaming)

  """
import os
import json
import numpy as np
import pandas as pd

# ====== ISI DENGAN NPM ANDA (STRING) ======
NPM = "2505060011"
# =============================================

SEED = int(NPM) % 1_000_000
VARIAN = int(NPM[-1]) % 3          # 0, 1, atau 2 -> menentukan Pertanyaan Bisnis Khusus
rng = np.random.default_rng(SEED)

OUT = "data_proyek"
N_TRX_PER_FILE = 500_000
N_FILE = 4
N_PELANGGAN = 50_000
N_PRODUK = 5_000

KOTA = ["Magelang", "Yogyakarta", "Semarang", "Solo", "Purworejo", "Kebumen", "Temanggung", "Wonosobo"]
JARAK_KOTA = np.array([60, 120, 90, 110, 80, 130, 50, 70])  # jarak rata-rata (km) dari gudang pusat
KATEGORI = ["Elektronik", "Fashion", "Makanan", "Rumah Tangga", "Kesehatan", "Olahraga", "Buku", "Otomotif"]
METODE = ["Transfer Bank", "E-Wallet", "COD", "Kartu Kredit"]

os.makedirs(f"{OUT}/transaksi", exist_ok=True)
os.makedirs(f"{OUT}/stream_input", exist_ok=True)

# ---------------- PRODUK (JSON Lines, skema bervariasi) ----------------
harga_produk = np.zeros(N_PRODUK + 1, dtype=np.int64)
kategori_produk = rng.integers(0, len(KATEGORI), N_PRODUK + 1)
berat_produk = np.round(rng.uniform(0.1, 15, N_PRODUK + 1), 2)
with open(f"{OUT}/produk.json", "w") as f:
    for pid in range(1, N_PRODUK + 1):
        kat = KATEGORI[kategori_produk[pid]]
        harga = int(rng.choice([15000, 25000, 40000, 60000, 85000, 120000, 200000, 350000, 750000, 1500000]))
        harga_produk[pid] = harga
        doc = {"produk_id": pid, "nama_produk": f"{kat}-{pid}", "kategori": kat, "harga_dasar": harga,
               "berat_kg": float(berat_produk[pid])}
        if kat == "Elektronik":
            doc["garansi_bulan"] = int(rng.choice([6, 12, 24]))
            doc["voltase"] = int(rng.choice([110, 220]))
        elif kat == "Fashion":
            doc["ukuran"] = str(rng.choice(["S", "M", "L", "XL"]))
            doc["bahan"] = str(rng.choice(["katun", "poliester", "denim"]))
        elif kat == "Makanan":
            doc["kadaluarsa_hari"] = int(rng.choice([7, 30, 90, 365]))
        elif kat == "Buku":
            doc["penerbit"] = str(rng.choice(["Gramedia", "Erlangga", "Andi"]))
        if rng.random() < 0.3:
            doc["tags"] = [str(t) for t in rng.choice(["promo", "baru", "terlaris", "impor", "lokal"], size=int(rng.integers(1, 4)), replace=False)]
        f.write(json.dumps(doc) + "\n")

# ---------------- PELANGGAN (JSON Lines) ----------------
bobot = rng.lognormal(0, 1.2, N_PELANGGAN)       # pelanggan berbeda frekuensi belanjanya
cum_bobot = np.cumsum(bobot) / bobot.sum()
with open(f"{OUT}/pelanggan.json", "w") as f:
    for cid in range(1, N_PELANGGAN + 1):
        f.write(json.dumps({
            "pelanggan_id": cid, "nama": f"Pelanggan-{cid}",
            "kota": str(rng.choice(KOTA)),
            "tanggal_daftar": str(pd.Timestamp("2024-01-01") + pd.Timedelta(days=int(rng.integers(0, 900)))).split(" ")[0],
            "membership": str(rng.choice(["Silver", "Gold", "Platinum"], p=[0.6, 0.3, 0.1])),
        }) + "\n")


def buat_chunk(n, id_awal, tgl_awal, rentang_detik):
    pid = rng.integers(1, N_PRODUK + 1, n)
    kota_idx = rng.integers(0, len(KOTA), n)
    metode = rng.choice(METODE, n, p=[0.35, 0.30, 0.20, 0.15])
    qty = rng.integers(1, 8, n).astype(float)
    diskon = rng.choice([0, 0, 5, 10, 15, 20], n)
    jarak = np.clip(JARAK_KOTA[kota_idx] + rng.normal(0, 15, n), 5, None)
    berat = berat_produk[pid] * qty
    lama_kirim = np.clip(np.round(1 + jarak / 60 + berat / 25 + rng.normal(0, 0.6, n)), 1, None)
    z = -1.2 + 0.25 * lama_kirim - 0.04 * diskon + 0.8 * (metode == "COD")
    p_batal = 1 / (1 + np.exp(-z))
    u = rng.random(n)
    status = np.where(u < p_batal * 0.5, "Dibatalkan", np.where(u > 0.97, "Dikembalikan", "Selesai"))
    waktu = pd.to_datetime(tgl_awal) + pd.to_timedelta(rng.integers(0, rentang_detik, n), unit="s")
    pel = np.searchsorted(cum_bobot, rng.random(n)) + 1
    kota_txt = np.array(KOTA)[kota_idx].astype(object)
    # masalah kualitas data (veracity)
    mask_case = rng.random(n) < 0.05
    kota_txt[mask_case] = np.array([k.upper() if rng.random() < 0.5 else k.lower() for k in kota_txt[mask_case]])
    harga = harga_produk[pid].astype(float)
    qty[rng.random(n) < 0.003] = np.nan
    harga[rng.random(n) < 0.003] = np.nan
    harga[rng.random(n) < 0.001] *= -1
    qty[rng.random(n) < 0.0005] = 999
    df = pd.DataFrame({
        "order_id": [f"ORD{id_awal + i}" for i in range(n)],
        "tanggal": waktu.strftime("%Y-%m-%d %H:%M:%S"),
        "pelanggan_id": pel, "produk_id": pid, "qty": qty, "harga_satuan": harga,
        "diskon_persen": diskon, "metode_pembayaran": metode, "kota": kota_txt,
        "berat_kg": np.round(berat, 2), "jarak_km": np.round(jarak, 1),
        "lama_kirim_hari": lama_kirim.astype(int), "status_pesanan": status,
    })
    dup = df.sample(frac=0.005, random_state=int(rng.integers(0, 10_000)))
    return pd.concat([df, dup], ignore_index=True)


# ---------------- TRANSAKSI (CSV, 4 berkas) ----------------
total = 0
for k in range(1, N_FILE + 1):
    df = buat_chunk(N_TRX_PER_FILE, 1_000_000 * k, "2026-01-01", 181 * 24 * 3600)
    df.to_csv(f"{OUT}/transaksi/transaksi_part{k}.csv", index=False)
    total += len(df)

# ---------------- STREAM INPUT (20 micro-batch) ----------------
for s in range(1, 21):
    df = buat_chunk(5_000, 9_000_000 + s * 10_000, "2026-07-01", 24 * 3600)
    df.to_csv(f"{OUT}/stream_input/stream_{s:02d}.csv", index=False)

print(f"NPM {NPM} | SEED {SEED} | VARIAN pertanyaan bisnis = {VARIAN}")
print(f"Transaksi (batch) : {total:,} baris di {N_FILE} berkas")
print("Pelanggan          : 50.000 | Produk: 5.000 | Stream: 20 berkas x 5.000 baris")
