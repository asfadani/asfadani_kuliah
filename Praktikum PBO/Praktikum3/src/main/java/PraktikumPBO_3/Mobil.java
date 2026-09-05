/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO_3;

/**
 *
 * @author Asus VivoBook Go 14
 */

enum Model{
        SUV("Avanza"),
        Hatchback("Mazda 3 HB"),
        Sedan("Civic"),
        Construction("L300"),
        City_car("Brio");
        
        private final String Model;
        
        Model(String Model) {
            this.Model = Model;
        }
        
        public String getModel() {
            return Model;
        }
    }

public class Mobil {
    private String Merek;
    private Model model;
    private int Tahun;
    
    public Mobil(String Merek, Model model, int Tahun) {
        this.Merek = Merek;
        this.model = model;
        this.Tahun = Tahun;
    }
    
    public String getMerek() {
        return Merek;
    }
    
    public void setMerek(String merek) {
        this.Merek = merek;
    }
    
    public int getTahun() {
        return Tahun;
    }
    
    public void setTahun(int tahun) {
        this.Tahun = tahun;
    }
    
    void displayInfo() {
        System.out.println("Model mobil : " + getMerek()
        + "\n" +
        "Model mobil : " + model.getModel() + " " + model
        + "\n" +
        "Tahun keluar : " + getTahun());
    }
}
