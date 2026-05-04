public class Kucing extends Anabul {
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor
    Kucing(String nama){
        super(nama);
    }
    @Override
    public String Gerak(){
        return "Melata";
    }

    @Override
    public String Bersuara(){
        return "Meong";
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Gerak    : " + this.Gerak());
        System.out.println("Bersuara : " + this.Bersuara());
    }
}