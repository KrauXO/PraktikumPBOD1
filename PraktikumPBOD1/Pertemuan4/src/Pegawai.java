/* Nama File    : Tendik.java */
/* Deskripsi    : Berisi atribut dan method dalam superclass Pegawai */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 15 Maret 2026*/
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Pegawai {
    //Atribut
    private String nip; 
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;

    //Method

    // Konstruktor Pegawai tanpa parameter
    public Pegawai(){
        this.nip = "";
        this.nama = "";
        this.tanggalLahir = null;
        this.tmt = null;
        this.gajiPokok = 0;
    }

    // Konstruktor Pegawai dengan Parameter
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    //Selektor
    public String getNip(){ 
        return nip; 
    }
    
    public String getNama(){ 
        return nama; 
    }
    
    public LocalDate getTanggalLahir(){ 
        return tanggalLahir; 
    }
    
    public LocalDate getTmt(){ 
        return tmt; 
    }

    public double getGajiPokok(){ 
        return gajiPokok; 
    }
    
    //Mutator
    public void setNip(String nip){ 
        this.nip = nip; 
    }

    public void setNama(String nama){ 
        this.nama = nama; 
    }

    public void setTanggalLahir(LocalDate tanggalLahir){ 
        this.tanggalLahir = tanggalLahir; 
    }

    public void setTmt(LocalDate tmt){ 
        this.tmt = tmt; 
    }

    public void setGajiPokok(double gajiPokok){ 
        this.gajiPokok = gajiPokok; 
    }

    public Period hitungMasaKerjaDetail(){
        return Period.between(tmt, LocalDate.now());
    }

    protected String formatRupiah(double nominal){
    return String.format("Rp %,.2f", nominal).replace(',', 'x').replace('.', ',').replace('x', '.');
}
    protected String formatTanggal(LocalDate tanggal){
        if (tanggal == null) return "-";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(fmt);
    }

    public int hitungMasaKerjaTahun(){
        return hitungMasaKerjaDetail().getYears();
    }

    public LocalDate hitungTanggalPensiun(int bup){
        return tanggalLahir.plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan(){
        return 0;
    }

    public void printInfo(){
        System.out.println("Data Pegawai");
    }
}