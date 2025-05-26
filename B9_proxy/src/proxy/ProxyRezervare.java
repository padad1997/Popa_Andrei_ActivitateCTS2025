package proxy;

public class ProxyRezervare implements Rezervare {
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeaza(int numarPersoane) {
        if (numarPersoane >= 4) {
            rezervare.realizeaza(numarPersoane);
        } else {
            System.out.println("Pentru mai puțin de 4 persoane, vă rugăm să veniți direct la restaurant.");
        }
    }
}