/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum9;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Main {
    public static void main(String[] args) {
        // Objek penjumlahan
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " + 
        penjumlahan.hitung(10, 5)); // Output: 15
        
        // Objek pengurangan
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan: " + 
        pengurangan.hitung(10, 5)); // Output: 5
    }
}

