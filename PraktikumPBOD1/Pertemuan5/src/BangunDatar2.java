/* Nama File    : BangunDatar.java */
/* Deskripsi    : Berisi atribut dan method dalam superclass BangunDatar */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 17 Maret 2026*/
public abstract class BangunDatar2 {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;


    public BangunDatar2 () {
        counterBangunDatar++;
    }

    public BangunDatar2 (int Jmlsisi, String warna, String border) {
        this.jmlSisi = Jmlsisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi () {
        return jmlSisi;
    }

    public void setJmlSisi (int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna () {
        return warna;
    }

    public void setWarna (String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String Border) {
        this.border = Border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar2 X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar2 X){
        return this.getKeliling() == X.getKeliling();
    }
}