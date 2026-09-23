/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul5;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Kucing extends Hewan {
    protected String jenisCat;
    public int umur;
    
    @Override
    public void tampilkanInfo() {
       System.out.println("Nama hewan: " + Nama);
       System.out.println("Jenis kucing: " + jenisCat);
       System.out.println("Umur Kucing: " + umur);
    }
}
