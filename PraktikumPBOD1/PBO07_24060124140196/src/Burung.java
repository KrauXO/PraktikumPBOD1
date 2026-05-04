public class Burung extends Anabul{
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor
    Burung(String Nama){
        super(Nama);
    }

    @Override
    public String Gerak(){
        return "Terbang";
    }

    @Override
    public String Bersuara(){
        return "cuit";
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Gerak    : " + this.Gerak());
        System.out.println("Bersuara : " + this.Bersuara());
    }
}