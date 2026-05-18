/*  NAMA FILE       : Piaraan.java
    DESKRIPSI FILE  : Berisi atribut dan method class Piaraan
    NAMA / NIM      : Saburo Rafqi Hidayat / 24060124140196
    Tanggal         : 5 Mei 2026
*/

public class Piaraan {
    /* ATRIBUT */
    private int nbelm;
    private Anabul[] Lanabul;

    /* METHOD */
    public Piaraan(){
        this.Lanabul = new Anabul[10]; 
    }

    public int getNbelm(){
        return nbelm;
    }
    
    public void enqueueAnabul(Anabul anabul){
        if (nbelm < 10) {
            Lanabul[nbelm] = anabul;
            nbelm++;
        } else {
            System.out.println("Antrean penuh! Tidak dapat menambahkan " + anabul.getNama());
        }
    }

    public boolean isMember(Anabul anabul){
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i] != null && Lanabul[i].equals(anabul)) {
                return true;
            }
        }
        return false;
    }

    public Anabul getAnabul() {
        if (nbelm > 0) {
            return Lanabul[0];
        }
        return null;
    }

    public Anabul dequeueAnabul() {
        if (nbelm > 0) {
            Anabul first = Lanabul[0];
            for (int i = 0; i < nbelm - 1; i++) {
                Lanabul[i] = Lanabul[i + 1];
            }
            Lanabul[nbelm - 1] = null; 
            nbelm--;
            return first;
        }
        System.out.println("Antrean kosong!");
        return null;
    }

    public void showAnabul() {
        System.out.print("Daftar Panggilan Anabul di Antrean: ");
        for (int i = 0; i < nbelm; i++) {
            System.out.print(Lanabul[i].getNama() + " ");
        }
        System.out.println();
    }

    public int countKucing() {
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i].getClass().getSimpleName().toLowerCase().contains("kucing")) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[i].getClass().getSimpleName().toLowerCase().contains("kucing")) {
                totalBobot += Lanabul[i].getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("--- Daftar Jenis Anabul dalam Antrean ---");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Nama: " + Lanabul[i].getNama() + 
                               " | Jenis Kelas: " + Lanabul[i].getClass().getName());
        }
    }
}