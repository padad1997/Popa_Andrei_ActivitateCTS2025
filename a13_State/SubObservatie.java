package state;

public class SubObservatie implements Stare {
    @Override
    public void aplicaStare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este sub observatie.");
        pacient.setStare(this);
    }
}