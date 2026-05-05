/*  NAMA FILE       : Datum.java
    DESKRIPSI FILE  : Berisi atribut dan method class Datum
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 3 Mei 2026
*/

public class Datum<T> {
    /* ATRIBUT */
    private T isi;

    /* METHOD */
    public void setIsi(T isibaru){
        this.isi = isibaru;
    }

    public T getIsi(){
        return this.isi;
    }
}