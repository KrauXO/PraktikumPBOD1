/* Nama File    : Persegi.java */
/* Deskripsi    : Berisi atribut dan method dalam subclass Persegi */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 10 Maret 2026*/

public class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return this.sisi * 4;
    }

    public double getDiagonal(){
        return this.sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // @Override
    // public void printCounterBangunDatar(){
    //     super.printCounterBangunDatar();
    // }
}
