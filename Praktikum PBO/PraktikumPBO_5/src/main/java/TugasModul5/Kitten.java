/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul5;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Kitten extends Kucing {
    String namaKitten;
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama kitten: " + namaKitten);
        System.out.println("Jenis kucing: "+ jenisCat);
    }
}
