/* Nama File    : BangunDatar.java */
/* Deskripsi    : Berisi atribut dan method dalam superclass BangunDatar */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 17 Maret 2026*/

abstract public class BangunDatar {
    // Atribut
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    // Konstruktor tanpa Parameter
    public BangunDatar(){
        counterBangunDatar++;
    }

    // Konstruktor dengan Parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    // Selektor dan Mutator JmlSisi
    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
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
        this.border = border;
    }

    
    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar x) {
        return this.getLuas() == x.getLuas(); 
    }

    public boolean isEqualKeliling(BangunDatar x) {
        return this.getKeliling() == x.getKeliling();
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

