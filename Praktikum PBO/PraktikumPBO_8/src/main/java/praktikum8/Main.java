/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum8;

/**
 *
 * @author Asus VivoBook Go 14
 */
abstract class Kendaraan {
    //Metode abstrak
    abstract void berjalan();
    
    //Metode dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan");
    }
}

class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan");
    }
}

class Pesawat extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Pesawat terbang");
    }
}

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        System.out.println("\nObjek lain");
        Kendaraan pesawat = new Pesawat();
        pesawat.berjalan();
        pesawat.info();
    }
}