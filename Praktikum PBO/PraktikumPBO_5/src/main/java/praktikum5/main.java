/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Membuat objek mobil");
        kendaraan jazz;
        jazz = new mobil();
        jazz.Nama = "Honda Jazz";
        jazz.topSpeed = 200;
        jazz.jumlahPintu = 4;
        jazz.tampilkanInfo();
        
        System.out.println("\nMembuat objek sepeda motor");
        motor vario = new motor();
        vario.Nama = "Honda Vario";
        vario.cc = 250;
        vario.topSpeed = 180;
        vario.tampilkanInfo();
    }
}
