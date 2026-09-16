/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class motor extends kendaraan {
   int cc;
   
   @Override
   public void tampilkanInfo() {
       super.tampilkanInfo();
       System.out.println("CC : " + cc);
   }
}
