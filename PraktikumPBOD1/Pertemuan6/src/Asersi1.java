/* Nama File    : Asersi1.java */
/* Deskripsi    : Berisi asersi 1 */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 27 Maret 2026*/

public class Asersi1 {
    public static void main(String[]args){
        int x = 0;
        if (x>0){
            System.out.println("x bilangan positif");
        }
        else {
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
