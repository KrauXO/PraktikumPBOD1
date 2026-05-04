class Seminar {
    /* ATRIBUT */
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    /* METHOD */
    public Seminar() {
        this.pesertas = new Civitasakademika[100];
        this.banyakpeserta = 0;
    }

    public void registrasi(Civitasakademika peserta) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
        } else {
            System.out.println("Maaf, kapasitas seminar penuh!");
        }
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void tampilPeserta() {
        System.out.println("--- Daftar Peserta Seminar ---");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println("ID: " + pesertas[i].getNomor() + " | Nama: " + pesertas[i].Nama);
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}