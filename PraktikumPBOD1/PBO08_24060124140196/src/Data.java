/*  NAMA FILE       : Data.java
    DESKRIPSI FILE  : Berisi atribut dan method class Data
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 3 Mei 2026
*/

public class Data<T> {
    /* ATRIBUT */
    private T[] ruang;
    private int banyak;

    /* METHOD */
    @SuppressWarnings("unchecked")
    public Data(){
        this.ruang = (T[]) new Object[100]; // Array statis 100
        this.banyak = 0;
    }

    public void setIsi(int posisi, T objek){
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = objek;
            if (posisi > banyak) banyak = posisi;
        }
    }

    public T getIsi(int posisi){
        return (posisi >= 1 && posisi <= 100) ? ruang[posisi - 1] : null;
    }

    public int getSize(){
        return banyak;
    }
}