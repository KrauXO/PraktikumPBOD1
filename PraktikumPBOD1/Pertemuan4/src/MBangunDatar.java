/* Nama File    : MBangunDatar.java */
/* Deskripsi    : Berisi atribut dan method dalam class BangunDatar */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 10 Maret 2026*/

public class MBangunDatar {
    public static void main(String[] args) {
        // Bagian 1
        // ************************************PERSEGI************************************
        System.out.println("===================PERSEGI===================");
        Persegi Persegi1 = new Persegi();
        Persegi Persegi2 = new Persegi(4, "Merah", "Hitam");
        System.out.println("Info Persegi1: ");
        Persegi1.printInfo();
        System.out.println("Info Persegi2: ");
        Persegi2.printInfo();
        // Question : Apakah konstruktor berparameter bisa direalisasikan dengan keyword this?
        // Answer   : Tidak bisa
        System.out.println("Sisi Persegi1: " + Persegi1.getSisi());
        Persegi1.setSisi(6);
        System.out.println("Sisi Persegi1: " + Persegi1.getSisi());
        
        System.out.println("Luas Persegi2: " + Persegi2.getLuas());
        System.out.println("Keliling Persegi2: " + Persegi2.getKeliling());
        System.out.println("Diagonal Persegi2: " + Persegi2.getDiagonal());

        //************************************LINGKARAN************************************
        System.out.println("==================Lingkaran==================");
        Lingkaran Lingkaran1 = new Lingkaran();
        Lingkaran Lingkaran2 = new Lingkaran(14, "Biru", "Putih");
        System.out.println("Info Lingkaran1: ");
        Lingkaran1.printInfo();
        System.out.println("Info Lingkaran2: ");
        Lingkaran2.printInfo();
        System.out.println("Jari Lingkaran2" + Lingkaran2.getJari());
        Lingkaran2.setjari(21);
        System.out.println("Jari Lingkaran2" + Lingkaran2.getJari());
        System.out.println("Luas Lingkaran2" + Lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran2" + Lingkaran2.getKeliling());
        //Bagian 2 - Keyword Super

        //Bagian 3 - Overriding
        //Question  : Bagaimana hasil overriding pada method printCounterBangunDatar()?
        //Answer    : Overriding tidak berhasil dikarenakan method printCounterBangunDatar adalah static

        //Bagian 4 - Access Modifier Protected
        //Question  : Apakah konstruktor berparameter dengan keyword this pada class Persegi bisa direalisasikan 
        //            setelah mengubah atribut class BangunDatar dengan access modifier Protected?
        //Answer    : Bisa, karena access modifer diubah menjadi protected yang memungkinkan pewarisan

        //Bagian 5 - Keyword Final
        //Question 1: Pengaruh menambahkan keyword Final pada kelas BangunDatar terhadap kelas Persegi dan Lingkaran
        //Answer    : Terjadi error kompilasi karena kelas BangunDatar jadi tidak bisa diturunkan lagi

        //Question 2: Pengaruh menambahkan keyword Final pada method printInfo()
        //Answer    : method printInfo() di override di class Persegi. 
        //            Setelah keyword final ditambahkan, Muncul error saat program dijalankan atau dikompilasi karena 
        //            kelas Persegi mencoba menulis ulang (override) method printInfo() yang statusnya sudah terkunci di kelas induk.
    }
}
