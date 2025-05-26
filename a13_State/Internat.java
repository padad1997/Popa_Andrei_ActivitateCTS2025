package state;

public class Internat implements Stare {
    @Override
    public void aplicaStare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat.");
        pacient.setStare(this);
    }
}