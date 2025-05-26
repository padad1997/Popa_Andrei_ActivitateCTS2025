package A6_composite;

import java.util.ArrayList;
import java.util.List;

public class DepartamentComplex implements Departament {
    private String nume;
    private List<Departament> subdepartamente = new ArrayList<>();

    public DepartamentComplex(String nume) {
        this.nume = nume;
    }

    public void adauga(Departament d) {
        subdepartamente.add(d);
    }

    public void afiseaza(String indentare) {
        System.out.println(indentare + "+ Departament: " + nume);
        for (Departament d : subdepartamente) {
            d.afiseaza(indentare + "  ");
        }
    }
}