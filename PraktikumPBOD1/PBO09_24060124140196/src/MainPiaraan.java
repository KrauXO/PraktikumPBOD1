/*  NAMA FILE       : MainPiaraan.java
    DESKRIPSI FILE  : Berisi main driver class Piaraan
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 5 Mei 2026
*/

public class MainPiaraan {
    public static void main(String[] args) {

        Piaraan pet = new Piaraan();

        Kucing k1 = new Kucing("Lupis", 4.5);
        Kucing k2 = new Kucing("Brownis", 3.2);
        Anjing a1 = new Anjing("Snowy", 8.0);
        Burung b1 = new Burung("Rio", 1.1);

        pet.enqueueAnabul(k1);
        pet.enqueueAnabul(k2);
        pet.enqueueAnabul(a1);
        pet.enqueueAnabul(b1);

        pet.showAnabul();

        System.out.println();
        pet.showJenisAnabul();

        System.out.println();
        System.out.println("Jumlah kucing : " + pet.countKucing());
        System.out.println("Total bobot kucing : " + pet.bobotKucing());

        System.out.println();
        System.out.println("Anabul pertama : " + pet.getAnabul().getNama());

        pet.dequeueAnabul();

        System.out.println();
        System.out.println("Setelah dequeue:");
        pet.showAnabul();
    }
}