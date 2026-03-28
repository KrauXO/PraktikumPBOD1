/* Nama File    : Petani.java */
/* Deskripsi    : Berisi atribut dan method dalam subclass Petani */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 17 Maret 2026*/

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    /* Atribut */
    private String asal_kota;
    private static int counterPetani;

    /* Method */
    // Konstruktor tanpa parameter
    public Petani(){
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    // Konstruktor dengan parameter
    public Petani(String nama, LocalDate tmk, String alamat, double pendapatan, String asal_kota) {
        super(nama, tmk, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor dan Mutator asal_kota
    public String getAsal_kota(){
        return asal_kota;
    }

    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    // Selektor static counterPetani
    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + getAsal_kota());
    }
    
    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(getTanggal_mulai_kerja(), LocalDate.now()).getYears() + 1;
    }
}
