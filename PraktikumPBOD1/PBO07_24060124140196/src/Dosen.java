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