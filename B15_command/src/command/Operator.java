package command;

import java.util.LinkedList;
import java.util.Queue;

public class Operator {
    private Queue<Comanda> comenzi = new LinkedList<>();

    public void preiaComanda(Comanda comanda) {
        comenzi.add(comanda);
    }

    public void executaComenzi() {
        while (!comenzi.isEmpty()) {
            comenzi.poll().executa();
        }
    }
}