/* Nama File    : Pengusaha.java */
/* Deskripsi    : Berisi atribut dan method dalam subclass Pengusaha */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 17 Maret 2026*/

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    /* Atribut */
    private String npwp;
    private static int counterPengusaha;

    /* Method */
    // Konstruktor tanpa parameter
    public Pengusaha(){
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    // Konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tmk, String alamat, double pendapatan, String npwp) {
        super(nama, tmk, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selektor dan Mutator npwp
    public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    // Selektor static counterPengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }
    
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + getNpwp());
    }

    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(getTanggal_mulai_kerja(), LocalDate.now()).getYears() + 9;
    }
}
