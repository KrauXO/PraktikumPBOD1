/* Nama File    : Tendik.java */
/* Deskripsi    : Berisi atribut dan method dalam subclass Tendik */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 15 Maret 2026*/

import java.time.LocalDate;
import java.time.Period;

class Tendik extends Pegawai {
    //Atribut
    private String bidang;
    private static final int BUP = 55;

    //Method

    //Konstruktor
    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }
    //Selektor
    public String getBidang(){ 
        return bidang;
    }

    //Mutator
    public void setBidang(String bidang){ this.bidang = bidang; }

    private String formatMasaKerja() {
        Period p = hitungMasaKerjaDetail();
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    @Override
    public double hitungTunjangan(){
        return 0.01 * hitungMasaKerjaTahun() * getGajiPokok();
    }

    @Override
    public void printInfo(){
        System.out.println("NIP \t\t: " + getNip());
        System.out.println("Nama \t\t: " + getNama());
        System.out.println("Jabatan\t\t: Tendik");
        System.out.println("Bidang \t\t: " + this.bidang);
        System.out.println("Masa Kerja \t: " + formatMasaKerja());
        System.out.println("Tanggal Pensiun\t: " + formatTanggal(hitungTanggalPensiun(BUP)));
        System.out.println("Gaji Pokok \t: " + formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan \t: Rp" + formatRupiah(hitungTunjangan()));
    }
}