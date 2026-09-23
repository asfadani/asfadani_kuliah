/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul5;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Objek Hewan ===");
        Hewan hewanUmum = new Hewan();
        hewanUmum.Nama = "Burung Hantu";
        hewanUmum.Jenis = "Aves";
        hewanUmum.tampilkanInfo();
        
        System.out.println("\n=== Objek Anjing ===");
        Anjing anjingSaya = new Anjing();
        anjingSaya.Nama = "Heli";         // Mewarisi dari Hewan
        anjingSaya.jenisAnj = "Golden Retriever";
        anjingSaya.suara = "Guk guk!";
        anjingSaya.tampilkanInfo();
        
        System.out.println("\n=== Objek Kucing ===");
        Kucing kucingSaya = new Kucing();
        kucingSaya.Nama = "Milo";         // Mewarisi dari Hewan
        kucingSaya.jenisCat = "Persia";
        kucingSaya.umur = 24;
        kucingSaya.tampilkanInfo();
        
        System.out.println("\n=== Objek Kitten ===");
        Kitten anakKucing = new Kitten();
        anakKucing.namaKitten = "Leo";
        anakKucing.jenisCat = "Anggora";  // Mewarisi dari Kucing
        anakKucing.tampilkanInfo();
    }
}
