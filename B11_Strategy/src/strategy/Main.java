package strategy;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Andrei Ionescu");
        Client client2 = new Client("Elena Popa");

        client1.setMetodaPlata(new PlataCard());
        client2.setMetodaPlata(new PlataCash());

        client1.platesteNota(100.0);
        client2.platesteNota(75.5);
    }
}