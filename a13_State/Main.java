package state;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Mihai Enache");

        pacient.schimbaStare(new SubObservatie());
        pacient.schimbaStare(new Externat());
    }
}