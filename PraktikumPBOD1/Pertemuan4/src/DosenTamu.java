/* Nama File    : DosenTamu.java */
/* Deskripsi    : Berisi atribut dan method dalam subclass DosenTamu */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 15 Maret 2026*/
import java.time.LocalDate;
class DosenTamu extends Dosen {
    //Atribut
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    //Method

    //Konstruktor
    public DosenTamu() {
        super();
        this.nidk = "";
        this.tanggalAkhirKontrak = null;
    }
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    //Selektor
    public String getNidk() { 
        return nidk; 
    }
    
    public LocalDate getTanggalAkhirKontrak() { 
        return tanggalAkhirKontrak; 
    }

    //Mutator
    public void setNidk(String nidk) { 
        this.nidk = nidk; 

    }
    public void setTanggalAkhirKontrak(LocalDate tanggalAkhirKontrak) {
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    private long hitungSisaKontrakBulan(){
        if (tanggalAkhirKontrak == null) return 0;
        return java.time.temporal.ChronoUnit.MONTHS.between(
            LocalDate.now(), 
            this.tanggalAkhirKontrak
    );
}

    @Override
    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP \t\t: " + getNip());
        System.out.println("NIDK \t\t: " + this.nidk);
        System.out.println("Nama \t\t: " + getNama());
        System.out.println("Jabatan\t\t: Dosen Tamu");
        System.out.println("Fakultas\t: " + getFakultas());
        System.out.println("Gaji Pokok\t: " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan\t: " + formatRupiah(hitungTunjangan()));
        System.out.println("Akhir Kontrak\t: " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Sisa Kontrak\t: " + hitungSisaKontrakBulan() + " bulan");
    }
}
