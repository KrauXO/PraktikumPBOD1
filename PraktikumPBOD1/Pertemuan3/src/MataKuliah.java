/* Nama File    : MataKuliah.java */
/* Deskripsi    : Berisi atribut dan method dalam class MataKuliah */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 3 Maret 2026*/

public class MataKuliah {
    /******************** ATRIBUT ********************/
    private String idMatKul;
    private String nama;
    private int sks;

    /******************** METHOD ********************/
    // Konstruktor matkul tanpa parameter
    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    // Konstruktor matkul dengan parameter idMatkul, nama, sks
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selektor untuk mengembalikan idMatkul
    public String getIdMatKul(){ 
        return this.idMatKul; 
    }

    // Selektor untuk mengembalikan nama
    public String getNama(){ 
        return this.nama; 
    }

    // Selektor untuk mengembalikan sks
    public int getSks(){ 
        return this.sks; 
    }

    // Mutator untuk mengubah idMatkul
    public void setIdMatKul(String idMatKul){ 
        this.idMatKul = idMatKul; 
    }

    // Mutator untuk mengubah nama matkul
    public void setNama(String nama){ 
        this.nama = nama; 
    }

    // Mutator untuk mengubah sks
    public void setSks(int sks){ 
        this.sks = sks; 
    }
}