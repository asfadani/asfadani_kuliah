/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul4;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Membuat objek dari kelas pekerja");
        Pekerja corporate = new Pekerja("Asfa", 27, "Data Scientist", 15000000);
        corporate.infoPekerja();
        
        // Mengubah nama pekerja
        corporate.setNama("Asfadani");
        System.out.println("\ninfo setelah nama diubah");
        corporate.infoPekerja();
    }
}
