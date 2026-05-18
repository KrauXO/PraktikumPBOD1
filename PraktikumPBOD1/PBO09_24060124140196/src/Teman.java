/*  NAMA FILE       : Teman.java
    DESKRIPSI FILE  : Berisi atribut dan method subclass Teman
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 5 Mei 2026
*/

import java.util.ArrayList;
import java.util.List;

public class Teman {
    /* ATRIBUT */
    private int nbelm;
    private List<String> Lnama;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm(){
        return nbelm;
    }

    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama){
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama){
        Lnama.add(nama);
        this.nbelm++;
    }

    public void delNama(String nama){
        if (Lnama.remove(nama)){
            this.nbelm--;
        }
    }

    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru){
    int indeksDitemukan = Lnama.indexOf(nama);
    
    if (indeksDitemukan != -1){
        Lnama.set(indeksDitemukan, namabaru); 
    }
}

    public int countNama(String nama){
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) count++;
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman : " + Lnama.toString());
        System.out.println("Banyak Teman : " + this.nbelm);
    }
}

