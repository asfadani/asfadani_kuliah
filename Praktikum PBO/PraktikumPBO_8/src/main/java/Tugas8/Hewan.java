/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8;

/**
 *
 * @author Asus VivoBook Go 14
 */
abstract class Hewan {
    abstract void bersuara();
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Kucing mengeluarkan suara: Meong meong");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Anjing mengeluarkan suara: Guk guk");
    }
}

