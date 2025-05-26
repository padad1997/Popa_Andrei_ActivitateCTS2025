package flyweight;

public class Rezervare {
    private Client client; // Flyweight
    private int numarMasa;
    private int numarPersoane;
    private String ora;

    public Rezervare(Client client, int numarMasa, int numarPersoane, String ora) {
        this.client = client;
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.ora = ora;
    }

    public void afiseaza() {
        System.out.println("Rezervare: " + client +
                ", Masa: " + numarMasa +
                ", Persoane: " + numarPersoane +
                ", Ora: " + ora);
    }
}