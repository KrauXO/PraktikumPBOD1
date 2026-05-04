/*  NAMA FILE       : Dosen.java
    DESKRIPSI FILE  : Berisi atribut dan method subclass Dosen untuk realisasi polimorfisme Universal Inclusion
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 27 April 2026
*/
class Dosen extends Civitasakademika {
    /* ATRIBUT */
    private String NIP;

    /* METHOD */
    // Konstruktor
    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return this.NIP;
    }
}