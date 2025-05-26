package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerRezultate {
    private final List<RezultatMemento> istoric = new ArrayList<>();

    public void adaugaMemento(RezultatMemento memento) {
        istoric.add(memento);
    }

    public RezultatMemento getUltimulMemento() {
        if (!istoric.isEmpty()) {
            return istoric.get(istoric.size() - 1);
        }
        return null;
    }
}