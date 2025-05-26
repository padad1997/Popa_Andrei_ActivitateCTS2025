package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaClienti {
    private Map<String, Client> clienti = new HashMap<>();

    public Client getClient(String nume, String telefon, String email) {
        if (!clienti.containsKey(nume)) {
            clienti.put(nume, new Client(nume, telefon, email));
        }
        return clienti.get(nume);
    }
}