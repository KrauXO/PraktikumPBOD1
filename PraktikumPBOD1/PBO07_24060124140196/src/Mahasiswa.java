/*  NAMA FILE       : Mahasiswa.java
    DESKRIPSI FILE  : Berisi atribut dan method subclass Mahasiswa untuk realisasi polimorfisme ad hoc overloading
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 27 April 2026
*/

public class Mahasiswa {
    /* ATRIBUT */
    public String NIM;
    public String Nama;
    public String Programstudi;

    /* METHOD */
    // Konstruktor tanpa parameter
    Mahasiswa(){
        NIM = "-999";
        Nama = "n/a";
        Programstudi = "n/a";
    }

    // Konstruktor dengan parameter
    Mahasiswa(String NIM, String Nama, String Programstudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // Mutator program studi
    public void setProgramStudi(){
        this.Programstudi = "Kosong";
    }
    public void setProgramStudi(String programStudi){
        this.Programstudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa mhsLain){
        this.Programstudi = mhsLain.Programstudi;
    }

    // Selektor programstudi
    public String getProgramstudi(){
        return Programstudi;
    }

    // Mutator nim
    public void setNIM(String nim){
        NIM = nim;
    }

    // Selektor nim
    public String getNIM(){
        return NIM;
    }

    // Mutator nama
    public void setNama(String nama){
        Nama = nama;
    }

    // Selektor nama
    public String getNama(){
        return Nama;
    }

    public void printInfo(){
        System.out.println("NIM: " + this.getNIM());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Program Studi: " + this.getProgramstudi());
    }
}