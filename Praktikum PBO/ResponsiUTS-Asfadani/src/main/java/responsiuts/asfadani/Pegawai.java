/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.asfadani;

/**
 *
 * @author Asus VivoBook Go 14
 */
public class Pegawai {
    protected String namaPegawai;
    private long Gaji;
    
    // Enkapsulasi dan akses modifier    
    public Pegawai(String nama, long gaji) {
        this.namaPegawai = nama;
        this.Gaji = gaji;
    }
    
    // Setter dan getter nama
    public void setNama(String nama) {
        this.namaPegawai = nama;
    }
    public String getNama() {
        return this.namaPegawai;
    }
    
    // Setter dan getter gaji
    public void setGaji(long gaji) {
        this.Gaji = gaji;
    }
    public long getGaji() {
        return this.Gaji;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + Gaji);
    }
}

// subclass PegawaiTetap
class PegawaiTetap extends Pegawai {
    long Tunjangan;
    
    public PegawaiTetap(String nama, long gaji, long tunjangan) {
        super(nama, gaji);
        this.Tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + Tunjangan);
    }
}

// subclass Pegawaitetap
class PegawaiKontrak extends Pegawai {
    int lamaKontrak;
    
    public PegawaiKontrak(String nama, long gaji, int kontrak) {
        super(nama, gaji);
        this.lamaKontrak = kontrak;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}

