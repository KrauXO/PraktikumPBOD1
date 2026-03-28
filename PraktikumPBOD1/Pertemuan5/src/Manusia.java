/* Nama File    : Manusia.java */
/* Deskripsi    : Berisi atribut dan method dalam superclass Manusia */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 17 Maret 2026*/

import java.time.LocalDate;

public abstract class Manusia {
    /* Atribut */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    /* Method */
    // Konstruktor tanpa parameter
    public Manusia(){
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }

    // Konstruktor dengan parameter
    public Manusia(String nama, LocalDate tmk, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tmk;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selektor dan Mutator nama
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    // Selektor dan Mutator alamat
    public LocalDate getTanggal_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    public void setTanggal_mulai_kerja(LocalDate tmk){
        this.tgl_mulai_kerja = tmk;
    }

    // Selektor dan Mutator alamat
    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    // Selektor dan Mutator pendapatan
    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    // Abstract Method
    public abstract int hitungMasaKerja();
}
