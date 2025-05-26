package command;

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic("Dr. Ionescu");
        OperatorTriaj operator = new OperatorTriaj();

        operator.preiaComanda(new ComandaInternare(medic, "Andrei Popescu"));
        operator.preiaComanda(new ComandaTratare(medic, "Maria Iliescu"));
        operator.preiaComanda(new ComandaInternare(medic, "Cristina Pavel"));

        operator.trimiteComenzi();
    }
}