/* Nama File    : MGaris.java */
/* Deskripsi    : Berisi atribut dan method dalam class Garis */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 2 Maret 2026*/
public class MGaris {
    public static void main(String[] args) {
        System.out.println("=========================BUAT TITIK=========================");
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);
        Titik T3 = new Titik(2, 1);
        Titik T4 = new Titik(3, 6);

        System.out.println("T1 : ");
        T1.printTitik();
        System.out.println("T2 : ");
        T2.printTitik();
        System.out.println("T3 : ");
        T3.printTitik();
        System.out.println("T4 : ");
        T4.printTitik();

        System.out.println("=========================BUAT GARIS=========================");
        Garis G1 = new Garis(T1, T2);
        Garis G2 = new Garis(T3, T4);

        System.out.println("titikAwal G1: ");
        G1.getTitikAwal().printTitik();
        System.out.println("titikAkhir G1: ");
        G1.getTitikAkhir().printTitik();
        System.out.println("titikAwal G2: ");
        G2.getTitikAwal().printTitik();
        System.out.println("titikAkhir G2: ");
        G2.getTitikAkhir().printTitik();

        System.out.println("Total garis: " + Garis.getCounterGaris());
        System.out.println("Panjang garis G1: " + G2.panjangGaris());
        System.out.println("Panjang garis G2: " + G2.panjangGaris());

        System.out.println("Titik Tengah G1: ");
        G1.titikTengah().printTitik();
        System.out.println("Titik Tengah G2: ");
        G2.titikTengah().printTitik();

        System.out.println("===========================PREDIKAT=========================");
        System.out.println("Apakah G1 sejajar dengan G2?");
        System.out.println(G1.isGarisSejajar(G2));
        System.out.println("Apakah G1 tegak lurus dengan G2?");
        System.out.println(G1.isGarisTegakL(G2));

        System.out.println("=========================PRINT TITIK========================");
        G1.printTawalTakhir();
        G2.printTawalTakhir();

        System.out.println("=======================PERSAMAAN GARIS======================");
        System.out.println("Persamaan Garis G1 : ");
        System.out.println(G1.persamaanGaris());
        System.out.println("Persamaan Garis G2 : ");
        System.out.println(G2.persamaanGaris());
    }
}
