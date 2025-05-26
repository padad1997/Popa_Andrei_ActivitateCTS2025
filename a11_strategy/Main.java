package strategy;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Andrei Ionescu");
        Pacient pacient2 = new Pacient("Elena Popa");

        pacient1.setStrategiePlata(new PlataCard());
        pacient2.setStrategiePlata(new PlataCash());

        pacient1.efectueazaPlata(200.0);
        pacient2.efectueazaPlata(150.0);
    }
}