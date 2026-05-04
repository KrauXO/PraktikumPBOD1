/*  NAMA FILE       : Kucing.java
    DESKRIPSI FILE  : Berisi atribut dan method subclass Kucing untuk realisasi polimorfisme Universal Inclusion
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 27 April 2026
*/
public class Kucing extends Anabul {
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor
    Kucing(String nama){
        super(nama);
    }
    @Override
    public String Gerak(){
        return "Melata";
    }

    @Override
    public String Bersuara(){
        return "Meong";
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Gerak    : " + this.Gerak());
        System.out.println("Bersuara : " + this.Bersuara());
    }
}