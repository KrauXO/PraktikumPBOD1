/* Nama File    : DosenTetap.java */
/* Deskripsi    : Berisi atribut dan method dalam subclass DosenTetap */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 15 Maret 2026*/

import java.time.LocalDate;
import java.time.Period;
class DosenTetap extends Dosen {
    //Atribut
    private String nidn;
    private static final int BUP = 65;

    //Method

    //Konstruktor
    public DosenTetap(){
        super();
        this.nidn = "";
    }

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    //Selektor
    public String getNidn(){ 
        return nidn; 
    }

    //Mutator
    public void setNidn(String nidn){ 
        this.nidn = nidn; 
    }

    private String formatMasaKerja(){
        Period p = hitungMasaKerjaDetail();
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    @Override
    public double hitungTunjangan(){
        return 0.02 * hitungMasaKerjaTahun() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP \t\t: " + getNip());
        System.out.println("NIDN \t\t: " + this.nidn);
        System.out.println("Nama \t\t: " + getNama());
        System.out.println("Tanggal Lahir \t: " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT \t\t: " + formatTanggal(getTmt()));
        System.out.println("Jabatan \t: Dosen Tetap");
        System.out.println("Fakultas \t: " + getFakultas());
        System.out.println("Masa Kerja \t: " + formatMasaKerja());
        System.out.println("Tanggal Pensiun\t: " + formatTanggal(hitungTanggalPensiun(BUP)));
        System.out.println("Gaji Pokok \t: " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan \t: " + formatRupiah(hitungTunjangan()));
    }
}