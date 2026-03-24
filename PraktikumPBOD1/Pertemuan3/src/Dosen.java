/* Nama File    : Dosen.java */
/* Deskripsi    : Berisi atribut dan method dalam class Dosen */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 3 Maret 2026*/
public class Dosen {
    /******************** ATRIBUT ********************/
    private String nip;
    private String nama;
    private String prodi;

    /******************** METHOD ********************/
    // Konstruktor tanpa parameter 
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // Konstruktor dengan parameter 
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor (Getter) 
    public String getNip(){ 
        return this.nip; 
    }
    public String getNama(){ 
        return this.nama; 
    }
    public String getProdi(){ 
        return this.prodi; 
    }

    // Mutator (Setter) 
    public void setNip(String nip){ 
        this.nip = nip; 
    }
    public void setNama(String nama){ 
        this.nama = nama; 
    }
    public void setProdi(String prodi){ 
        this.prodi = prodi; 
    }
}