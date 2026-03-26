/* Nama File    : Kendaran.java */
/* Deskripsi    : Berisi atribut dan method dalam class Kendaraan */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 3 Maret 2026*/

public class Kendaraan {
    /******************** ATRIBUT ********************/
    private String noPlat;
    private String jenis; // motor atau mobil 

    /******************** METHOD ********************/
    // Konstruktor Kendaraan tanpa kendaraan
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor kendaraan tanpa parameter dengan jenis antara mobil atau motor
    public Kendaraan(String nomor, String Jenis){
        this.noPlat = nomor;
        this.jenis = Jenis;
    }

    // Selektor untuk mengembalikan nomor plat
    public String getNoPlat(){ 
        return this.noPlat; 

    }

    // Selektor untuk mengembalikan jenis kendaraan
    public String getJenis(){ 
        return this.jenis; 
    }

    // Mutator untuk mengubah nomor plat
    public void setNoPlat(String nomor){ 
        this.noPlat = nomor; 
    }

     //Mutator untuk mengubah jenis kendaraan
    public void setJenis(String Jenis){ 
        this.jenis = Jenis; 
    }
}