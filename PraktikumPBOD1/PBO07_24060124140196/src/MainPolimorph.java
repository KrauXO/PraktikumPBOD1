/*  NAMA FILE       : MainPolymorph.java
    DESKRIPSI FILE  : Berisi class untuk realisasi polimorfisme ad hoc coersion
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 27 April 2026
*/

public class MainPolimorph {
    public static void main(String[] args) throws Exception {
        System.out.println("==========SIMULASI NO 1===========");
        Integer I = 65; 
        double B = (double) I; 
        Integer C = (int) B; 
        
        System.out.println("Integer I                       : " + I);
        System.out.println("Convert I menjadi real          : " + B);
        System.out.println("Convert kembali menjadi Integer : " + C);

        String X = "1234"; 
        String Y = "5678"; 
        String S = X + Y; 
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("String X : " + X);
        System.out.println("String Y : " + Y);
        System.out.println("Hasil Penggabungan  : " + S);
        System.out.println("Hasil Penjumlahan   : " + Z);
        
        String P = "12.34"; 
        String Q = "56.78"; 
        String R = P + Q; 
        double D = Double.parseDouble(P) + Double.parseDouble(Q); 
        
        System.out.println("String P : " + P);
        System.out.println("String Q : " + Q);
        System.out.println("Hasil Penggabungan : " + R);
        System.out.println("Hasil Penjumlahan  : " + D);

        Integer A = Integer.valueOf(S); 
        System.out.println("Objek Integer A (hasil konversi S) : " + A);
 
        String T = A.toString(); 
        System.out.println("Objek String T (hasil konversi A)  : " + T);

        System.out.println("==========SIMULASI NO 2===========");
        Mahasiswa M1 = new Mahasiswa();
        Mahasiswa M2 = new Mahasiswa("123456789", "Syuraih", "Informatika");

        System.out.println("================M1================");
        M1.printInfo();
        System.out.println("================M2================");
        M2.printInfo();
        
        System.out.println("========setprogramstudi M2========");
        M1.setProgramStudi(M2);
        System.out.println("================M1================");
        M1.printInfo();

        System.out.println("==========SIMULASI NO 3===========");
        System.out.println("=============ANJING===============");
        Anjing A1 = new Anjing("Snowy");
        
        A1.printInfo();
        
        System.out.println("=============KUCING===============");
        Kucing K1 = new Kucing("Lupis");

        K1.printInfo();

        System.out.println("=============BURUNG===============");
        Burung B1 = new Burung("Rio");

        B1.printInfo();

        System.out.println("==========SIMULASI NO 4===========");
        Dosen d1 = new Dosen("Dr. Rivaldi", "19800101");
        Dosen d2 = new Dosen("Dr. Devano", "19850202");

        Mahasiswa2 m1 = new Mahasiswa2("Saburo", "240601221");
        Mahasiswa2 m2 = new Mahasiswa2("Umar", "240601222");
        Mahasiswa2 m3 = new Mahasiswa2("Adit", "240601223");
        Mahasiswa2 m4 = new Mahasiswa2("Hasta", "240601224");
        Mahasiswa2 m5 = new Mahasiswa2("Faiq", "240601225");

        Seminar seminarPBO = new Seminar();
        seminarPBO.registrasi(d1);
        seminarPBO.registrasi(d2);
        seminarPBO.registrasi(m1);
        seminarPBO.registrasi(m2);
        seminarPBO.registrasi(m3);
        seminarPBO.registrasi(m4);
        seminarPBO.registrasi(m5);

        seminarPBO.tampilPeserta();
        System.out.println("Total Peserta: " + seminarPBO.countPeserta());
        System.out.println("Total Mahasiswa: " + seminarPBO.countMahasiswa());

        System.out.println("--- Update Data Mahasiswa ---");
        m1.setWali(d1);
        m1.tampilDataMahasiswa();
    }
} 