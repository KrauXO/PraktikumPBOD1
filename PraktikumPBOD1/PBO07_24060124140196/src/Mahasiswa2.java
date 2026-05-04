/*  NAMA FILE       : Mahasiswa2.java
    DESKRIPSI FILE  : Berisi atribut dan method class Mahasiswa2 untuk realisasi polimorfisme Universal Inclusion
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 27 April 2026
*/

class Mahasiswa2 extends Civitasakademika {
    /* ATRIBUT */
    private String NIM;
    private Dosen dosenwali;

    /* METHOD */
    // Konstruktor
    public Mahasiswa2(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
    }

    @Override
    public String getNomor() {
        return this.NIM;
    }

    public void setWali(Dosen wali) {
        this.dosenwali = wali;
    }

    public void tampilDataMahasiswa() {
        String namaWali = (dosenwali != null) ? dosenwali.Nama : "Belum ada";
        System.out.println("NIM        : " + NIM);
        System.out.println("Nama       : " + Nama);
        System.out.println("Dosen Wali : " + namaWali);
    }
}
