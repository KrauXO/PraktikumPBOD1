/*  NAMA FILE       : Main.java
    DESKRIPSI FILE  : Berisi realisasi main driver dari class-class pertemuan 8
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 3 Mei 2026
*/

public class Main {
    public static void main(String[] args) {
        /* KAMUS */

        /* ALGORITMA */
        // Uji Datum dengan Anabul
        System.out.println("===============UJI DATUM===============");
        Datum<Anabul> kotakAnabul = new Datum<>();
        Kucing lupis = new Kucing("Lupis", 4.5);
        kotakAnabul.setIsi(lupis);
        System.out.println("Isi Datum: " + kotakAnabul.getIsi().getNama());

        // Uji Tukar
        System.out.println("===============UJI TUKAR===============");
        Datum<Integer> a = new Datum<>(); a.setIsi(3);
        Datum<Integer> b = new Datum<>(); b.setIsi(6);
        System.out.println("Sebelum Tukar :");
        System.out.println("a = " + a.getIsi());
        System.out.println("b = " + b.getIsi());
        OperatorGenerik.Tukar(a, b);
        System.out.println("Setelah Tukar :");
        System.out.println("a = " + a.getIsi());
        System.out.println("b = " + b.getIsi());

        // Uji Bobot2
        System.out.println("===============UJI BOBOT2==============");
        Anggora Kucing1 = new Anggora("Abuu", 5.0);
        Kembangtelon Kucing2 = new Kembangtelon("Cimeng", 3.0);
        System.out.println("Bobot Kucing 1 : " + Kucing1.getBobot());
        System.out.println("Bobot Kucing 2 : " + Kucing2.getBobot());
        System.out.println("Total Bobot    : " + OperatorGenerik.Bobot2(Kucing1, Kucing2));

        // Uji Array Generik
        System.out.println("===============UJI ARRAY===============");
        Data<Anabul> listAnabul = new Data<>();
        listAnabul.setIsi(1, new Anjing("Snowy"));
        listAnabul.setIsi(2, lupis);
        System.out.println("Anabul 1      : " + listAnabul.getIsi(1).getNama());
        System.out.println("Anabul 2      : " + listAnabul.getIsi(2).getNama());
        System.out.println("Banyak Anabul : " + listAnabul.getSize());
    }
}
