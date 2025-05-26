package state;

public class Externat implements Stare {
    @Override
    public void aplicaStare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost externat.");
        pacient.setStare(this);
    }
}