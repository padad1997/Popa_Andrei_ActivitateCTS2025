package state;

public class Masa {
    private int numar;
    private Stare stare;

    public Masa(int numar) {
        this.numar = numar;
        this.stare = new Libera();
        this.stare.ocupa(this);
    }

    public int getNumar() {
        return numar;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void schimbaStare(Stare nouaStare) {
        nouaStare.ocupa(this);
    }
}