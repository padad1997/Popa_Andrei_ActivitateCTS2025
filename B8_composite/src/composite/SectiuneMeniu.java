package composite;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements MeniuComponent {
    private String nume;
    private List<MeniuComponent> componente = new ArrayList<>();

    public SectiuneMeniu(String nume) {
        this.nume = nume;
    }

    public void adauga(MeniuComponent componenta) {
        componente.add(componenta);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "+ " + nume);
        for (MeniuComponent c : componente) {
            c.afiseaza(indentare + "  ");
        }
    }
}