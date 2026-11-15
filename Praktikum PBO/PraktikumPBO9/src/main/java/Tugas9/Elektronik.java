/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Elektronik implements Pembayaran {

    private static final double PAJAK = 0.10;

    @Override
    public double hitungPajak(double harga) {
        return harga * PAJAK;
    }
}
