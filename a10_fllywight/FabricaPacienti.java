package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaPacienti {
    private final Map<String, Pacient> pacienti = new HashMap<>();

    public Pacient getPacient(String nume, String telefon, String adresa) {
        if (!pacienti.containsKey(nume)) {
            pacienti.put(nume, new Pacient(nume, telefon, adresa));
        }
        return pacienti.get(nume);
    }
}