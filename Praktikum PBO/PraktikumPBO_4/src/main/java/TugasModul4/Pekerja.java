/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul4;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Pekerja extends Manusia {
   private long Gaji;
   
   public Pekerja (String Nama, int Usia, String Pekerjaan, long Gaji) {
       super(Nama, Usia, Pekerjaan);
       this.Gaji = Gaji;
   }
   
   // getter dan setter atribut gaji
   public long getGaji() {
       return Gaji;
   }
   
   public void setGaji(long gaji) {
       this.Gaji = gaji;
   }
   
   public void infoPekerja() {
       System.out.println("Nama \t: " + getNama() );
       System.out.println("Usia \t: " + Usia + "tahun");
       System.out.println("Pekerjaan : " + Pekerjaan);
       System.out.println("Gaji \t:" + getGaji() + "Rupiah");
   }
}
