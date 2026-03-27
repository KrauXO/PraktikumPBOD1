/* Nama File    : MBangunDatar.java */
/* Deskripsi    : Berisi atribut dan method dalam class BangunDatar */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 17 Maret 2026*/

public class MBangunDatar {
    public static void main(String[] args) {
        // BAGIAN 1

        // LANGKAH 3
        // ----------- EROR -----------
        // BangunDatar B1 = new BangunDatar(); 
        // ----------------------------
        BangunDatar P1 = new Persegi(10);
        BangunDatar L1 = new Lingkaran(7);
        Persegi P2 = new Persegi(5);
        Lingkaran L2 = new Lingkaran (14);
        //Question  : Apakah ada kode yang masalah?
        //Answer    : Method BangunDatar ada di kelas abstrak, sehingga tidak bisa di instansiasi.
        // ************************************PERSEGI************************************
        System.out.println("===================PERSEGI===================");
        System.out.println("Info P1: ");
        P1.printInfo();

        // ----------- EROR -----------
        // System.out.println("Sisi P1: " + P1.getSisi());
        // P1.setSisi(6);
        // System.out.println("Sisi P1: " + P1.getSisi());
        
        // System.out.println("Luas P2: " + P1.getLuas());
        // System.out.println("Keliling P2: " + P1.getKeliling());
        // System.out.println("Diagonal P2: " + P1.getDiagonal());
        // ----------------------------

        System.out.println("Info P2: ");
        P2.printInfo();
        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Keliling P2: " + P2.getKeliling());
        System.out.println("Diagonal P2: " + P2.getDiagonal());

        //************************************LINGKARAN************************************
        System.out.println("==================Lingkaran==================");
        System.out.println("Info L1 :");
        L1.printInfo();
        System.out.println("Info Lingkaran2 :");
        L2.printInfo();
        System.out.println("Jari L2 :" + L2.getJari());
        L2.setjari(21);
        System.out.println("Jari L2 :" + L2.getJari());
        System.out.println("Luas L2 :" + L2.getLuas());
        System.out.println("Keliling L2 :" + L2.getKeliling());


        // LANGKAH 5 : UJI COBA PERBANDINGAN
        System.out.println("=================Perbandingan================");
        System.out.println("Apakah Keliling L1 sama dengan L2? : " + L1.isEqualKeliling(L2));
        System.out.println("Apakah Luas L1 sama dengan L2? : " + L1.isEqualLuas(L2));

        System.out.println("Apakah Keliling L1 sama dengan P1? : " + L1.isEqualKeliling(P1));
        System.out.println("Apakah Luas L1 sama dengan P1? : " + L1.isEqualLuas(P1));

        System.out.println("Apakah Keliling P1 sama dengan P2? : " + P1.isEqualKeliling(P2));
        System.out.println("Apakah Keliling P1 sama dengan P2? : " + P1.isEqualLuas(P2));

        //============================================================================================================================
        //Question  : Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek bangun datar berbeda?
        //Answer    : Bisa, terbukti dengan berhasilnya pemanggilan method isEqualKeliling dan isEqualLuas
        //            yang membandingkan tipe persegi dengan lingkaran.
        //============================================================================================================================
        //Question  : Apakah tetap bisa membuat method isEqualKeliling() dan isEqualLuas() di class BangunDatar
        //            jika class BangunDatar bukan class abstract?
        //Answer    : Bisa, tetapi tidak efektif dan kurang tepat. Karena jika class BangunDatar bukan class abstract,
        //            kedua method tersebut perlu dibuat implementasinya di dalam class BangunDatar. Tetapi sebuah
        //            bangun datar tidak memiliki rumus luas atau keliling yang pasti karena berbeda untuk setiap jenisnya,
        //            sehingga dibuat method getLuas() dan getKeliling() di setiap sub class bangun datar. Oleh karena itu,
        //            jika kedua isEqual diimplementasi di superclass, tidak bisa karena butuh selektor yang ada di subclass.
        //============================================================================================================================
        //Question  : Apa kelebihan BangunDatar jadi abstract dibandingkan jadi non-abstract?\
        //Answer    : Memungkinkan kita membuat method umum di superclass (seperti isEqualLuas) yang bisa bekerja 
        //            untuk berbagai jenis objek anak tanpa harus tahu detail implementasi rumusnya di superclass.

        // BAGIAN 2
        System.out.println("==================Interface==================");
        System.out.println("===================Persegi===================");
        System.out.println("Sisi awal P2: " + P2.getSisi());
        P2.zoomIn(); 
        System.out.println("Sisi P2 setelah zoomIn (110%): " + P2.getSisi());
        System.out.println("Luas P2 sekarang: " + P2.getLuas());
        P2.zoom(200); 
        System.out.println("Sisi P2 setelah zoom 200%: " + P2.getSisi());
        P2.zoomOut();
        System.out.println("Sisi P2 setelah zoomOut (90%): " + P2.getSisi());
        System.out.println("Luas P2 sekarang: " + P2.getLuas());
        System.out.println("==================lingkaran==================");
        System.out.println("Jari-jari awal P2: " + L2.getJari());
        L2.zoomIn(); 
        System.out.println("Jari-jari L2 setelah zoomIn (110%): " + L2.getJari());
        System.out.println("Luas L2 sekarang: " + L2.getLuas());
        L2.zoom(200); 
        System.out.println("Jari-jari L2 setelah zoom 200%: " + L2.getJari());
        L2.zoomOut();
        System.out.println("Jari-jari L2 setelah zoomOut (90%): " + L2.getJari());
        System.out.println("Luas L2 sekarang: " + L2.getLuas());

    }
}
