/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class mobil extends Kendaraan {
    private int jumlahPintu; // Atribut tambahan khusus mobil
    
    // Constructor
    public mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); // Memanggil constructor dari root class
        this.jumlahPintu = jumlahPintu;
    }
    
    public void infoMobil() {
        // Atribut kecepatan dapat daiakses karena protected
        System.out.println("Kecepatan maks : " + kecepatanMaks+"km/h");
        System.out.println("Jumlah pintu\t: " + jumlahPintu);
    }  
}
