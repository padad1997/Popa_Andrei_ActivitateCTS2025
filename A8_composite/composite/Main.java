package composite;

public class Main {
    public static void main(String[] args) {
        Departament spital = new Departament("Spital Central");

        Departament chirurgie = new Departament("Chirurgie");
        chirurgie.adauga(new Sectie("Ortopedie"));
        chirurgie.adauga(new Sectie("Neurochirurgie"));

        Departament medicina = new Departament("Medicină Internă");
        medicina.adauga(new Sectie("Cardiologie"));
        medicina.adauga(new Sectie("Gastroenterologie"));

        spital.adauga(chirurgie);
        spital.adauga(medicina);

        spital.afiseazaStructura("");
    }
}