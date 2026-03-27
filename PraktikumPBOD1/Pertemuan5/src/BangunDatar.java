/* Nama File    : BangunDatar.java */
/* Deskripsi    : Berisi atribut dan Method dalam superclass Bangun Datar */
/* Nama Pembuat : Saburo Rafqi Hidayat 24060124140196 */
/* Tanggal      : 27 Maret 2026 */

public abstract class BangunDatar {
    /* Atribut */
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar;

    /* Method */
    // Konstruktor tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Selektor dan Mutator jmlSisi
    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int Sisi){
        this.jmlSisi = Sisi;
    }

    // Selektor dan Mutator warna
    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    // Selektor dan Mutator border
    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = warna;
    }

    // Abstract Method
    // Selektor
    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
    }

}
