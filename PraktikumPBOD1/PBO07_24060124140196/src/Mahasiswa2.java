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
