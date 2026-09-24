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
       this.harga = hargaPromo - 100000;
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
    public static void main(String[] args) {
        // Membuat objek produk produknya
        long hargaUmum = 250000;
        long hargaNovel = 150000;
        long hargaHP = 20000000;
        long hargaHoodie = 5000000;
        
        System.out.println("Membuat objek dari Produk produk");
        Produk umum = new Produk("Sepatu", hargaUmum);
        Buku novel = new Buku("Harry Potter", hargaNovel);
        Elektronik hp = new Elektronik("samsung flip", hargaHP);
        Pakaian hoodie = new Pakaian("Balenciaga", hargaHoodie);
        
        //Menghitung diskonnya
        double diskonUmum = 0.3;
        double diskonNovel = 0.15;
        double diskonHp = 0.2;
        double diskonHoodie = 0.25;
        
        umum.hitungDiskon(diskonUmum);
        novel.hitungDiskon(diskonNovel);
        hp.hitungDiskon(diskonHp);
        hoodie.hitungDiskon(diskonHoodie);
        
        // Memasukkan Keranjang
        Keranjang keranjangBelanja = new Keranjang();
        keranjangBelanja.tambahKeranjang(umum);
        keranjangBelanja.tambahKeranjang(novel);
        keranjangBelanja.tambahKeranjang(hp);
        keranjangBelanja.tambahKeranjang(hoodie);
        
        //Info produk    
        System.out.println("\nproduk sepatu, harga awal: " + hargaUmum + ", diskon: " + (diskonUmum * 100) + "%");
        System.out.println("produk novel: " + novel.nama + ", harga awal: " + hargaNovel + ", diskon: " + (diskonNovel * 100) + "%");
        System.out.println("produk elektronik: " + hp.nama + ", harga awal: " + hargaHP + ", diskon: " + (diskonHp * 100) + "% + potongan Rp 50.000");
        System.out.println("produk elektronik: " + hoodie.nama + ", harga awal: " + hargaHoodie + ", diskon: " + (diskonHoodie * 100) + "% + potongan Rp 100.000");
    
    
        System.out.println("\nIsi Keranjang dan total harga");
        keranjangBelanja.isiKeranjang();
        System.out.println("Total harga setelah diskon: " + keranjangBelanja.totalHarga());
    }
}
