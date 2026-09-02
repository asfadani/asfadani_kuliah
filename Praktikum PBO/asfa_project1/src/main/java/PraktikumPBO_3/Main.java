/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO_3;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Mobil kuning");
        Mobil kuning = new Mobil("Toyota", Model.Construction, 2015);
        kuning.displayInfo();
        
        System.out.println("\nMobil merah");
        Mobil merah = new Mobil("Honda", Model.City_car, 2019);
        merah.displayInfo();
    }
}
