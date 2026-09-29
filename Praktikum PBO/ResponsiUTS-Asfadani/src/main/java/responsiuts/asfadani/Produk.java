/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsiuts.asfadani;

/**
 *
 * @author Asus VivoBook Go 14
 */

import java.time.LocalDate;

public class Produk {
    private String namaProduk;
    private long Harga;

    // Enkapsulasi    
    public Produk(String nama, long harga) {
        this.namaProduk = nama;
        this.Harga = harga;
    }
    
    // Setter dan getter namaProduk
    public void setNamaProduk(String nama) {
        this.namaProduk = nama;
    }
    public String getNamaProduk() {
        return this.namaProduk;
    }
    
    // Setter dan getter harga
    public void setHarga(long harga) {
        this.Harga = harga;
    }
    public long getHarga() {
        return this.Harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga\t: "+ Harga);
    }
}


// Subclass produkElektronik
class produkElektronik extends Produk {
    int Garansi;
    
    public produkElektronik(String nama, long harga, int garansi) {
        super(nama, harga);
        this.Garansi = garansi;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + Garansi + " tahun");
    }
}


// Subclass produkMakanan
class produkMakanan extends Produk {
    LocalDate tanggalExp;
    
    public produkMakanan(String nama, long harga, String tanggal) {
        super(nama, harga);
        this.tanggalExp = LocalDate.parse(tanggal);
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalExp);
    }
}
