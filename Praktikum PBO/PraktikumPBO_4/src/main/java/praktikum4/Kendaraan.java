/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Kendaraan {
//    private String merek;
//    private String model;
//    private int tahun;
    private String nama;            // Hanya bisa diakses di dalam kelas ini
    protected int kecepatanMaks;    // Bisa diakses di package yang sama dan subclass
    public String jenisMesin;       // Bisa diakses dimana saja
    
    // Constructor
//    public Kendaraan (String merek, String model, int tahun) {
//        this.merek = merek;
//        this.model = model;
//        this.tahun = tahun;
//    }
    public Kendaraan (String Nama, int Kecepatan, String Mesin) {
        this.nama = Nama;
        this.kecepatanMaks = Kecepatan;
        this.jenisMesin = Mesin;
    }    
    
    // Getter dan Setter utk private nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String Nama) {
        this.nama = Nama;
    }
    
    // Method public utk menampilkan informasi kendaraan
    public void displayInfo() {
       System.out.println("Nama Kendaraan: " + nama);
       System.out.println("Kecepatan Max : " + kecepatanMaks+"km/h");
       System.out.println("Jenis mesin\t: " + jenisMesin);
    }
        
    
//    // Getter dan setter model
//    public String getModel() {
//        return model;
//    }
//    
//    public void setModel(String Model) {
//        this.model = Model;
//    }
//    
//    // Getter dan setter tahun
//    public int getTahun() {
//        return tahun;
//    }
//    
//    public void setTahun(int Tahun) {
//        this.tahun = Tahun;
//    }
}
