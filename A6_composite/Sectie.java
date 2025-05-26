package A6_composite;

public class Sectie implements Departament {
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    public void afiseaza(String indentare) {
        System.out.println(indentare + "- Sectie: " + nume);
    }
}