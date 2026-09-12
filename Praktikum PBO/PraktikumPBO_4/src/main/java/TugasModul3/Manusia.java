/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul3;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Manusia {
    private String Nama;
    protected int Usia;
    public String Pekerjaan;
    
    // constructor
    public Manusia (String nama, int usia, String pekerjaan) {
        this.Nama = nama;
        this.Usia = usia;
        this.Pekerjaan = pekerjaan;
    }
    
    // method setter dan getter nama
    public String getNama() {
        return Nama;
    }
    
    public void setNama(String nama) {
        this.Nama = nama;
    }
    
}
