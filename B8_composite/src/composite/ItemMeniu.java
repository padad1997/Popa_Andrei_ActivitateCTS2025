package composite;

public class ItemMeniu implements MeniuComponent {
    private String nume;

    public ItemMeniu(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "- " + nume);
    }
}