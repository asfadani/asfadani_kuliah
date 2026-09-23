/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul6;

/**
 *
 * @author Asus VivoBook Go 14
 */

class Produk {
    public String nama;
    protected long harga;
    
    public Produk(String nama, long harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public void hitungDiskon(double diskon) {
        this.harga = (long) (this.harga - (this.harga * diskon));
    }
    
    public long getHarga() {
        return this.harga;
    }
}

class Buku extends Produk {
    public Buku(String nama, long harga) {
        super(nama, harga);
    }
   
   @Override
   public void hitungDiskon(double diskon) {
       this.harga = (long) (this.harga - (this.harga * diskon));
   }
}

class Elektronik extends Produk {
    public Elektronik(String nama, long harga) {
        super(nama, harga);
    }
    
   @Override
   public void hitungDiskon(double diskon) {
       long hargaPromo = (long) (this.harga - (this.harga * diskon));
       this.harga = hargaPromo - 50000;
   }    
}

class Pakaian extends Produk {
    public Pakaian(String nama, long harga) {
        super(nama, harga);
    }
    
    @Override
    public void hitungDiskon(double diskon) {
       long hargaPromo = (long) (this.harga - (this.harga * diskon));
       this.harga = hargaPromo - 10000;
   } 
}

class Keranjang {
    private Produk[] daftarBelanja = new Produk[100];
    
    private int jumlahBarang = 0;
    
    public void tambahKeranjang(Produk produkBaru) {
        if (jumlahBarang < daftarBelanja.length) {
            daftarBelanja[jumlahBarang] = produkBaru;
            jumlahBarang++;
        } else{
            System.out.println("Keranjang penuh");
        }
    }
    
    public long totalHarga() {
        long total = 0;
        for  (int i = 0; i < jumlahBarang; i++) {
            total += daftarBelanja[i].getHarga();
        }
        return total;      
    }
    
    public void isiKeranjang() {
        System.out.println("isi keranjang : ");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("- "+ daftarBelanja[i].nama + " : Rp" + daftarBelanja[i].getHarga());
        }
    }
}

public class Main {
    
}
