/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author Asus VivoBook Go 14
 */
class Kendaraan {
    public void melaju() {
        System.out.println("Kendaraan melaju");
    }
    
    public void melaju(int Kecepatan) {
        System.out.println("Kendaraan melaju dengan kecepatan: " + Kecepatan + "km/j");
    }
}

class Mobil extends Kendaraan {
    int roda;
    
    @Override
    public void melaju() {
        System.out.println("Mobil melaju dengan :" + roda + " roda");
    }
}

class SepedaMotor extends Kendaraan {
    String kondisi;
    
    @Override
    public void melaju(int Kecepatan) {
        System.out.println("Sepeda motor melaju dengan kecepatan: " + Kecepatan + " km/j,dan dengan kondisi:" + kondisi);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Memanggil kedua method di kelas kendaraan");
        Kendaraan mobil = new Kendaraan();
        
        // Memanggil method melaju tanpa parameter
        System.out.println("Method melaju tanpa parameter");
        mobil.melaju();
        
        // Memanggil method melaju dengan parameter
        System.out.println("\nMethod melaju dengan parameter");
        mobil.melaju(200);
        
        // Memanggil method dari kelas turunan (Mobil)
        System.out.println("\nMethod dari kelas turuan mobil");
        Mobil jazz = new Mobil();
        jazz.roda = 4;
        jazz.melaju();
        
        // Memanggil method dari kelas turunan (Sepeda motor)
        System.out.println("\nMethod dari kelas turuan Sepeda motor");
        SepedaMotor suprax = new SepedaMotor();
        suprax.kondisi = "Jumping";
        suprax.melaju(150);
    }
}
