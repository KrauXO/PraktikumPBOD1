/* Nama File    : PNS.java */
/* Deskripsi    : Berisi atribut dan method dalam subclass PNS */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 17 Maret 2026*/

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    /* Atribut */
    private String nip;
    private static int counterPNS;

    /* Method */
    // Konstruktor tanpa parameter
    public PNS(){
        super();
        this.nip = "";
        counterPNS++;
    }

    // Konstruktor dengan parameter
    public PNS(String nama, LocalDate tmk, String alamat, double pendapatan, String nip) {
        super(nama, tmk, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor dan Mutator NIP
    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + getNip());
    }

    @Override 
    public double hitungPajak(){
        return 0.1 * getPendapatan();
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(getTanggal_mulai_kerja(), LocalDate.now()).getYears() + 6;
    }
}
