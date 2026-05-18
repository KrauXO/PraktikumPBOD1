/*  NAMA FILE       : Burung.java
    DESKRIPSI FILE  : Berisi atribut dan method subclass Burung untuk realisasi polimorfisme Universal Inclusion
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 27 April 2026
*/
public class Burung extends Anabul{
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor
    public Burung(String Nama, double bobot){
        super(Nama, bobot);
    }

    @Override
    public String Gerak(){
        return "Terbang";
    }

    @Override
    public String Bersuara(){
        return "cuit";
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Gerak    : " + this.Gerak());
        System.out.println("Bersuara : " + this.Bersuara());
    }
}