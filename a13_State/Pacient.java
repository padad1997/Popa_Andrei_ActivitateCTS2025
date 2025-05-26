package state;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internat();
        this.stare.aplicaStare(this);
    }

    public String getNume() {
        return nume;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void schimbaStare(Stare stareNoua) {
        stareNoua.aplicaStare(this);
    }
}