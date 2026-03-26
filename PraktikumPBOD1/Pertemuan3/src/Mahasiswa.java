/* Nama File    : Mahasiswa.java */
/* Deskripsi    : Berisi atribut dan method dalam class Mahasiswa */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 3 Maret 2026*/

public class Mahasiswa {
    /******************** ATRIBUT ********************/
    private String nim; 
    private String nama; 
    private String prodi; 
    private MataKuliah[] listMatKul; 
    private int jumlahMatKul; 
    private Dosen dosenWali; 
    private Kendaraan kendaraan;

    /******************** METHOD ********************/
    // Konstruktor mahasiswa tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
    }

    // Konstruktor mahasiswa menggunakan parameter nim, nama, dan prodi
    public Mahasiswa(String NIM, String NAMA, String PRODI){
        this.nim = NIM; 
        this.nama = NAMA;
        this.prodi = PRODI;
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
    }

    // Selektor untuk mengembalikan nim mahasiswa
    public String getNim(){ 
        return nim; 
    }

    // Selektor untuk mengembalikan nama mahasiswa
    public String getNama(){ 
        return nama; 
    }

    // Selektor untuk mengembalikan prodi mahasiswa
    public String getProdi(){ 
        return prodi; 
    }

    // Selektor untuk mengembalikan dosen wali mahasiswa
    public Dosen getDosenWali(){ 
        return dosenWali; 
    }

    // Selektor untuk mengembalikan kendaraan mahasiswa
    public Kendaraan getKendaraan(){ 
        return kendaraan; 
    }

    // Mutator untuk mengubah nama mahasiswa
    public void setNim(String nim){
        this.nim = nim; 
    }
    
    // Mutator untuk mengubah nama mahasiswa
    public void setNama(String nama){ 
        this.nama = nama; 
    }
    
    // Mutator untuk mengubah prodi mahasiswa
    public void setProdi(String prodi){ 
        this.prodi = prodi; 
    }
    
    // Mutator untuk mengubah dosen wali mahasiswa
    public void setDosenWali(Dosen dosenWali){ 
        this.dosenWali = dosenWali; 
    }

    // Mutator untuk mengubah kendaraan mahasiswa
    public void setKendaraan(Kendaraan kendaraan){ 
        this.kendaraan = kendaraan; 
    }

    public void addMatKul(MataKuliah newMatKul) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = newMatKul;
            jumlahMatKul++;
        } else {
            System.out.println("Daftar mata kuliah sudah penuh!");
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            totalSKS += listMatKul[i].getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    public void printMhs() {
        System.out.println("NIM\t: " + nim); 
        System.out.println("Nama\t: " + nama); 
        System.out.println("Prodi\t: " + prodi);
    }
    
    public void printDetailMhs() {
        printMhs();
        System.out.println("Daftar Mata Kuliah yang diambil\t: "); 
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama());
        }
        
        if (dosenWali != null) {
            System.out.println("Dosen Wali\t: " + dosenWali.getNama());
        }
        
        if (kendaraan != null) {
            System.out.println("Kendaraan\t: " + kendaraan.getNoPlat() + " (" + kendaraan.getJenis() + ")");
        }
    }
}