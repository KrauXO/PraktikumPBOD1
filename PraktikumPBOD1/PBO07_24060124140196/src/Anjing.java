public class Anjing extends Anabul {
    /* ATRIBUT */

    /* METHOD */
    // Konstruktor
    public Anjing(String nama){
        super(nama);
    }

    @Override
    public String Gerak(){
        return "Melata";
    }

    @Override
    public String Bersuara(){
        return "guk-guk";
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Gerak    : " + this.Gerak());
        System.out.println("Bersuara : " + this.Bersuara());
    }
}