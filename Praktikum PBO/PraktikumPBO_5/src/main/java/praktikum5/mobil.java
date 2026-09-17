/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class mobil extends kendaraan {
   public int jumlahPintu;
   
   @Override
   public void tampilkanInfo() {
       super.tampilkanInfo();
       System.out.println("Jumlah pintu\t: " + jumlahPintu);
   }
}
