package abstractfactory;

public class Main {
    public static void main(String[] args) {
        MeniuFactory meniuTraditional = new MeniuTraditionalFactory();
        Supa supaTrad = meniuTraditional.creeazaSupa();
        Desert desertTrad = meniuTraditional.creeazaDesert();
        supaTrad.serveste();
        desertTrad.serveste();

        System.out.println();

        MeniuFactory meniuModern = new MeniuModernFactory();
        Supa supaMod = meniuModern.creeazaSupa();
        Desert desertMod = meniuModern.creeazaDesert();
        supaMod.serveste();
        desertMod.serveste();
    }
}