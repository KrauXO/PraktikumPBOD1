/* Nama File    : Lingkaran.java */
/* Deskripsi    : Berisi atribut dan method dalam subclass Lingkaran */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 10 Maret 2026*/

public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2;
        this.warna = warna;
        this.border = border;
    }
    
    public double getJari(){
        return this.jari;
    }

    public void setjari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * this.jari * this.jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * this.jari;
    }

}
