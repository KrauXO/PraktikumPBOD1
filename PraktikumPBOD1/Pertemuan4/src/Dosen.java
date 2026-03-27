/* Nama File    : Dosen.java */
/* Deskripsi    : Berisi atribut dan method dalam subclass Dosen */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 15 Maret 2026*/

import java.time.LocalDate;

class Dosen extends Pegawai {
    //Atribut
    private String fakultas;

    //Method

    //Konstruktor
    public Dosen() {
        super();
        this.fakultas = "";
    }
    
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    //Selektor
    public String getFakultas() { 
        return fakultas; 
    }

    //Mutator
    public void setFakultas(String fakultas) { 
        this.fakultas = fakultas; 
    }
}