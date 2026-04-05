/* Nama File    : Asersi2.java */
/* Deskripsi    : Berisi Asersi2 */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 27 Maret 2026*/


class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[]args){
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol!!!";
        Lingkaran L1 = new Lingkaran(jariJari);
        double kelilingLingkaran = L1.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}