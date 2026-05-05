/*  NAMA FILE       : Anabul.java
    DESKRIPSI FILE  : Berisi atribut dan method superclass Anabul untuk realisasi polimorfisme Universal Inclusion
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 27 April 2026
*/
public abstract class Anabul {
    /* ATRIBUT */
    protected String Nama;

    /* METHOD */
    // Konstruktor
    public Anabul(String nama){
        this.Nama = nama;
    }
    
    // Abstract method
    public abstract String Gerak();
    public abstract String Bersuara();
    
    // Mutator
    public void setNama(String nama){
        Nama = nama;
    }

    // Selektor
    public String getNama(){
        return Nama;
    }

    public void printInfo(){
        System.out.println("Nama     : " + this.getNama());
    }
}
