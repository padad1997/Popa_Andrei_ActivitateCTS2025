package observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Observer> abonati = new ArrayList<>();

    public void aboneaza(Observer observer) {
        abonati.add(observer);
    }

    public void dezaboneaza(Observer observer) {
        abonati.remove(observer);
    }

    public void trimiteNotificare(String mesaj) {
        for (Observer observer : abonati) {
            observer.primesteNotificare(mesaj);
        }
    }
}