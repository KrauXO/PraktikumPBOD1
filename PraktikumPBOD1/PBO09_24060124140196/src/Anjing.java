/*  NAMA FILE       : Anjing.java
    DESKRIPSI FILE  : Berisi atribut dan method subclass Anjing untuk realisasi polimorfisme Universal Inclusion
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 27 April 2026
*/
public class Anjing extends Anabul {
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor
    public Anjing(String nama, double bobot){
        super(nama,bobot);
    }

    @Override
    public String Gerak(){
        return "Melata";
    }

    @Override
    public String Bersuara(){
        return "guk-guk";
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Gerak    : " + this.Gerak());
        System.out.println("Bersuara : " + this.Bersuara());
    }
}