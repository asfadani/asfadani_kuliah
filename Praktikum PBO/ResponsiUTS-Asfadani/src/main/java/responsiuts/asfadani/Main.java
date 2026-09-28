/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.asfadani;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Main {
    public void main(String[] args) {
        System.out.println("Objek dari kelas Produk dan turunannya");
        Produk hp = new produkElektronik("Samsung", 15000000, 5);
        hp.tampilkanInfo();
        
        Produk ciki = new produkMakanan("Lays", 10000, "2026-12-01");
        ciki.tampilkanInfo();
        
        System.out.println("\nObjek dari kelas Pegawai dan turunannya");
        Pegawai fulltime = new PegawaiTetap("Andi", 5000000, 3000000);
        fulltime.tampilkanInfo();
        
        Pegawai parttime = new PegawaiKontrak("Budi", 3000000, 3);
        parttime.tampilkanInfo();
    }
}
