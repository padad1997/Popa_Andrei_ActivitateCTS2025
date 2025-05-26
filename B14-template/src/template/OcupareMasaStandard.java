package template;

public class OcupareMasaStandard extends OcupareMasaTemplate {
    @Override
    protected void curataMasa() {
        System.out.println("Se curăță masa standard.");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Se așază șervețele standard.");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Se așază tacâmuri standard.");
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Sunt invitate persoanele să se așeze la masa standard.");
    }
}