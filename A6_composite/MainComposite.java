package A6_composite;

public class MainComposite {
    public static void main(String[] args) {
        DepartamentComplex spital = new DepartamentComplex("Spital Central");
        DepartamentComplex chirurgie = new DepartamentComplex("Chirurgie");
        Sectie ortopedie = new Sectie("Ortopedie");
        Sectie neurochirurgie = new Sectie("Neurochirurgie");
        chirurgie.adauga(ortopedie);
        chirurgie.adauga(neurochirurgie);
        spital.adauga(chirurgie);
        spital.afiseaza("");
    }
}