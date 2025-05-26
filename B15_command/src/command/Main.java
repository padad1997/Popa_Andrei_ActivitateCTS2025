package command;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(5);
        Masa masa2 = new Masa(10);

        Operator operator = new Operator();

        operator.preiaComanda(new ComandaRezervare(masa1));
        operator.preiaComanda(new ComandaOcupare(masa2));
        operator.preiaComanda(new ComandaOcupare(masa1));

        operator.executaComenzi();
    }
}