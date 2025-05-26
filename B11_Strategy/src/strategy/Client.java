package strategy;

public class Client {
    private String nume;
    private Plata metodaPlata;

    public Client(String nume) {
        this.nume = nume;
    }

    public void setMetodaPlata(Plata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteNota(double suma) {
        if (metodaPlata != null) {
            System.out.print("Clientul " + nume + " -> ");
            metodaPlata.plateste(suma);
        } else {
            System.out.println("Clientul " + nume + " nu a ales metoda de plată.");
        }
    }
}