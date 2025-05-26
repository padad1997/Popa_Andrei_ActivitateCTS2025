package composite;

public class Sectie implements UnitateSpital {
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare + "- Sectie: " + nume);
    }
}