/* Nama File    : MPegawai.java */
/* Deskripsi    : Berisi main driver class Pegawai */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 15 Maret 2026*/
import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        /***************** DOSEN TETAP *****************/
        // Dosen 1
        DosenTetap DosenTe1 = new DosenTetap();
        System.out.println("======================== DOSEN TETAP 1 ========================");

        // Construct
        DosenTe1.setNip("9575795766");
        DosenTe1.setNama("Rivaldi");
        DosenTe1.setTanggalLahir(LocalDate.of(1985, 9, 5));
        DosenTe1.setTmt(LocalDate.of(2010, 1, 1));
        DosenTe1.setGajiPokok(5200000);
        DosenTe1.setFakultas("Fakultas Sains dan Matematika");
        DosenTe1.setNidn("68294775");

        // Select
        System.out.println("NIP Dosen Tetap 1 : " + DosenTe1.getNip());
        System.out.println("Nama Dosen Tetap 1 : " + DosenTe1.getNama());
        System.out.println("Tanggal lahir Dosen Tetap 1 : " + DosenTe1.getTanggalLahir());
        System.out.println("Masa kerja Dosen Tetap 1 : " + DosenTe1.getTmt());

        // Operate
        System.out.println("Masa kerja Dosen Tetap 1 : " + DosenTe1.hitungMasaKerjaDetail());
        System.out.println("Masa kerja Tahun Dosen Tetap 1 : " + DosenTe1.hitungMasaKerjaTahun());


        // Dosen 2
        DosenTetap DosenTe2 = new DosenTetap(
                "6578747958",
                "Umar",
                LocalDate.of(1990, 5, 5),
                LocalDate.of(2015, 1, 1),
                5000000,
                "Fakultas Sains dan Matematika",
                "68302334"
        );
        System.out.println("======================== DOSEN TETAP 2 ========================");

        DosenTe2.printInfo();
        /***************** DOSEN TAMU ******************/
        DosenTamu DosenTa = new DosenTamu(
                "1234567890",
                "Adit",
                LocalDate.of(1987, 2, 15),
                LocalDate.of(2022, 6, 1),
                3800000,
                "Fakultas Hukum",
                "78574794",
                LocalDate.of(2027, 12, 31)
        );
        System.out.println("======================== DOSEN TAMU 1 =========================");
        DosenTa.printInfo();

        /******************** TENDIK *******************/
        System.out.println("========================= DOSEN TETAP =========================");
        Tendik Tend = new Tendik(
                "2233445566",
                "Sandi",
                LocalDate.of(1995, 3, 21),
                LocalDate.of(2020, 6, 10),
                3100000,
                "Akademik"
        );
        Tend.printInfo();
    }
}