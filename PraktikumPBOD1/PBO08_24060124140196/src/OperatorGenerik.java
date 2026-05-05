/*  NAMA FILE       : OperatorGenerik.java
    DESKRIPSI FILE  : Berisi atribut dan method class OperatorGenerik
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 3 Mei 2026
*/

public class OperatorGenerik {
    /* ATRIBUT */

    /* METHOD */
    public static <T> void Tukar(Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing> double Bobot2(T K1, T K2){
        return K1.getBobot() + K2.getBobot();
    }
}
