/*  NAMA FILE       : Anabul.java
    DESKRIPSI FILE  : Berisi atribut dan method superclass Anabul untuk realisasi polimorfisme Universal Inclusion
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 27 April 2026
*/
public abstract class Anabul {
    /* ATRIBUT */
    protected String Nama;
    protected String panggilan;
    protected double bobot;

    /* METHOD */
    // Konstruktor
    public Anabul(String nama, double bobot){
        this.Nama = nama;
        this.bobot = bobot;
    }
    
    // Abstract method
    public abstract String Gerak();
    public abstract String Bersuara();
    
    // Mutator
    public void setNama(String nama){
        Nama = nama;
    }

    public void setNamaPanggilan(String nama){
        panggilan = nama;
    }

    public void setBobot(double bobot){
        this.bobot = bobot;
    }

    // Selektor
    public String getNama(){
        return Nama;
    }

    public String getNamaPanggilan(){
        return panggilan;
    }

    public double getBobot(){
        return bobot;
    }

    public void printInfo(){
        System.out.println("Nama     : " + this.getNama());
    }
}
