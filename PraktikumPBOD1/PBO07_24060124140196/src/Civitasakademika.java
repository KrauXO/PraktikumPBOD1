/*  NAMA FILE       : Civitasadakemika.java
    DESKRIPSI FILE  : Berisi atribut dan method super class Civitasakademika untuk realisasi polimorfisme Universal Inclusion
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 27 April 2026
*/public abstract class Civitasakademika {
    /* ATRIBUT */
    protected String Nama;

    /* METHOD */
    // Konstruktor
    public Civitasakademika(String nama) {
        this.Nama = nama;
    }

    public abstract String getNomor();
}