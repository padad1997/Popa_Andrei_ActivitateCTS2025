package composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements UnitateSpital {
    private String nume;
    private List<UnitateSpital> subunitati;

    public Departament(String nume) {
        this.nume = nume;
        this.subunitati = new ArrayList<>();
    }

    public void adauga(UnitateSpital unitate) {
        subunitati.add(unitate);
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare + "+ Departament: " + nume);
        for (UnitateSpital u : subunitati) {
            u.afiseazaStructura(indentare + "  ");
        }
    }
}