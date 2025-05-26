package strategy;

public class Pacient {
    private String nume;
    private Plata strategiePlata;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void setStrategiePlata(Plata strategiePlata) {
        this.strategiePlata = strategiePlata;
    }

    public void efectueazaPlata(double suma) {
        if (strategiePlata != null) {
            System.out.print("Pacientul " + nume + " -> ");
            strategiePlata.plateste(suma);
        } else {
            System.out.println("Pacientul " + nume + " nu a ales o metodă de plată.");
        }
    }
}