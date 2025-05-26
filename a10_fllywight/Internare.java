package flyweight;

public class Internare {
    private final Pacient pacient; // Flyweight
    private final int numarSalon;
    private final int numarPat;
    private final int zileSpitalizare;

    public Internare(Pacient pacient, int numarSalon, int numarPat, int zileSpitalizare) {
        this.pacient = pacient;
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.zileSpitalizare = zileSpitalizare;
    }

    public void afiseazaInternare() {
        System.out.println("Internare: " + pacient +
                ", Salon: " + numarSalon +
                ", Pat: " + numarPat +
                ", Zile: " + zileSpitalizare);
    }
}