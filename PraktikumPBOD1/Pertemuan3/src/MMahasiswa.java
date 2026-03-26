/* Nama File    : MMahasiswa.java */
/* Deskripsi    : Berisi main driver class Mahasiswa */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 3 Maret 2026*/

public class MMahasiswa {
    public static void main(String[] args) {
        /******************** DOSEN ********************/
        System.out.println("================DOSEN================ ");
        Dosen D1 = new Dosen();
        D1.setNip("456");
        D1.setNama("Rivaldi");
        D1.setProdi("Informatika");
        System.out.println("NIP Dosen D1 \t: " + D1.getNip());
        System.out.println("Nama Dosen D1 \t: " + D1.getNama());
        System.out.println("Prodi Dosen D1 \t: " + D1.getProdi());
        
        Dosen D2 = new Dosen("123", "Umar", "Informatika");
        System.out.println("NIP Dosen D2 \t: " + D2.getNip());
        System.out.println("Nama Dosen D2 \t: " + D2.getNama());
        System.out.println("Prodi Dosen D2 \t: " + D2.getProdi());

        /***************** Mata Kuliah *****************/
        System.out.println("=============Mata Kuliah============= ");
        MataKuliah PBO = new MataKuliah();
        PBO.setIdMatKul("PBO");
        PBO.setNama("Pemrograman Berorientasi Objek");
        PBO.setSks(3);
        System.out.println("IdMatkul PBO \t: " + PBO.getIdMatKul());
        System.out.println("Nama PBO \t: " + PBO.getNama());
        System.out.println("SKS PBO \t: " + PBO.getSks());

        MataKuliah ASA = new MataKuliah("ASA", "Analisa dan Strategi Algoritma", 3);
        System.out.println("IdMatkul ASA \t: " + ASA.getIdMatKul());
        System.out.println("Nama ASA \t: " + ASA.getNama());
        System.out.println("SKS ASA \t: " + ASA.getSks());

        /****************** Kendaraan ******************/
        System.out.println("==============Kendaraan============== ");
        Kendaraan K1 = new Kendaraan();
        K1.setNoPlat("B1630SS");
        K1.setJenis("Mobil");
        System.out.println("Nomor Kendaraan K1 \t: " + K1.getNoPlat());
        System.out.println("Jenis Kendaraan K1 \t: " + K1.getJenis());

        Kendaraan K2 = new Kendaraan("B1544DU", "Motor");
        System.out.println("Nomor Kendaraan K1 \t: " + K2.getNoPlat());
        System.out.println("Jenis Kendaraan K1 \t: " + K2.getJenis());

        /****************** Mahasiswa ******************/
        System.out.println("=============Mahasiswa M1============ ");
        Mahasiswa M1 = new Mahasiswa();
        M1.setNim("40200");
        M1.setNama("Adam");
        M1.setProdi("Informatika");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(ASA);
        M1.addMatKul(PBO);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah \t: " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah \t: " + M1.getJumlahSKS());


        System.out.println("=============Mahasiswa M2============ ");
        Mahasiswa M2 = new Mahasiswa("20101", "Adete", "Informatika");
        M2.setDosenWali(D2);
        M2.setKendaraan(K2);
        M2.addMatKul(ASA);
        M2.addMatKul(PBO);
        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah \t: " + M2.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah \t: " + M2.getJumlahSKS());
    }
}
