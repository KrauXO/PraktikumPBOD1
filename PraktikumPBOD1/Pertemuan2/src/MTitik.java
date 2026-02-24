/* Nama File    : MTitik.java */
/* Deskripsi    : Berisi atribut dan method dalam class Titik */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 24 Februari 2026*/
public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(3); // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // Mencetak koordinat T1 ke layar
        T1.geser(3, 4); // Menggeser T1 sejauh (3,4)
        T1.printTitik(); // Menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(3, 5);

        System.out.println("================= counterTitik ================" );
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T3.getCounterTitik());

        System.out.println("=================== Kuadran ===================" );
        System.out.println("Titik T1 : ");
        T1.printTitik(); 
        System.out.println("Titik T3 : ");
        T3.printTitik();
        System.out.println("Kuadran titik T1 = " + T1.getKuadran());

        System.out.println("==================== Jarak ====================" );
        System.out.println("Jarak titik T1 ke titik Pusat = " + T1.getJarakPusat());
        System.out.println("Jarak titik T1 ke titik T2 = " + T1.getJarak(T3));

        System.out.println("=================== refleksi ==================" );
        T3.refleksiX();
        System.out.println("Titik T3 setelah refleksiX : " );
        T3.printTitik();

        T3.refleksiY();
        System.out.println("Titik T3 setelah refleksiY : " );
        T3.printTitik();

        System.out.println("================= getRefleksi =================" );
        System.out.println("Titik T1 : " );
        T1.printTitik();
        Titik T4 = T1.getRefleksiX();
        Titik T5 = T1.getRefleksiY();
        System.out.println("Titik T4 : " );
        T4.printTitik();
        System.out.println("Titik T5 : " );
        T5.printTitik();


    }
}
