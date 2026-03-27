/* Nama File    : Lingkaran.java */
/* Deskripsi    : Berisi atribut dan method dalam subclass Lingkaran */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 10 Maret 2026*/

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(){
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2;
        this.warna = warna;
        this.border = border;
    }

    public Lingkaran(double jari) {
        this.jari = jari;
        setJmlSisi(0);
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

     @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    public void zoom(int percent) {
        jari = jari * percent / 100;
    }

}
