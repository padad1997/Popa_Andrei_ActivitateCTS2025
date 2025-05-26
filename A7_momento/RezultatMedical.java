package memento;

public class RezultatMedical {
    private String continut;

    public RezultatMedical(String continut) {
        this.continut = continut;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }

    public String getContinut() {
        return continut;
    }

    public RezultatMemento salveaza() {
        return new RezultatMemento(continut);
    }

    public void restaureaza(RezultatMemento memento) {
        this.continut = memento.getStare();
    }

    @Override
    public String toString() {
        return "RezultatMedical{" +
                "continut='" + continut +" "+
                '}';
    }
}