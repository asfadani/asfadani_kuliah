/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Asus VivoBook Go 14
 */
// Interface
public interface OperasiHitung {
    int hitung(int a, int b);
}

// Kelas penjumlahan
class Penjumlahan implements OperasiHitung {
    @Override
    public int hitung(int a, int b) {
        return a + b;
    }
}
// Kelas pengurangan
class Pengurangan implements OperasiHitung {
    @Override
    public int hitung(int a, int b) {
        return a - b;
    }
}
