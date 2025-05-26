package flyweight;

public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabrica = new FabricaPacienti();

        Pacient pacient1 = fabrica.getPacient("Ion Popescu", "0723456789", "Str. Libertatii 10");
        Pacient pacient2 = fabrica.getPacient("Ion Popescu", "0723456789", "Str. Libertatii 10"); // reutilizat

        Internare i1 = new Internare(pacient1, 3, 15, 5);
        Internare i2 = new Internare(pacient2, 5, 8, 3); // pacient reutilizat

        i1.afiseazaInternare();
        i2.afiseazaInternare();
    }
}