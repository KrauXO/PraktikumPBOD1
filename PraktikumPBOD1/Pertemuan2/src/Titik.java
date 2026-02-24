/* Nama File    : Titik.java */
/* Deskripsi    : Berisi atribut dan method dalam class Titik */
/* Pembuat      : Saburo Rafqi Hidayat - 24060124140196 */
/* Tanggal      : 24 Februari 2026*/
public class Titik {
    /*******************ATRIBUT******************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*******************METHOD******************/
    //konstruktor untuk membuat titik(0,0)
    Titik(){
        this(0,0);
    }

    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //Mengembalikan nilia counter titik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset absis titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    } 
    
    int getKuadran(){
        if (this.getAbsis() > 0 && this.getOrdinat() > 0){
            return 1;
        }
        else if (this.getAbsis() < 0 && this.getOrdinat() > 0){
            return 2;
        }
        else if (this.getAbsis() < 0 && this.getOrdinat() < 0){
            return 3;
        }
        else if (this.getAbsis() > 0 && this.getOrdinat() < 0){
            return 4;
        } 
        else {
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(Math.pow(this.getAbsis(), 2) + Math.pow(this.ordinat, 2));
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.getAbsis() - T.getAbsis(), 2) + Math.pow(this.getOrdinat() - T.getOrdinat(), 2));
    }

    void refleksiX(){
        this.ordinat = -this.getOrdinat();
    }
    void refleksiY(){
        this.absis = -this.getAbsis();
    }

    Titik getRefleksiX(){
        Titik T = new Titik(this.getAbsis(), - this.getOrdinat());
        return T;
    }

    Titik getRefleksiY(){
        Titik T = new Titik(- this.getAbsis(), this.getOrdinat());
        return T;
    }

}