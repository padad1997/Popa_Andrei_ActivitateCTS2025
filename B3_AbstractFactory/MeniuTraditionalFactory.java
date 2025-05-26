package abstractfactory;

public class MeniuTraditionalFactory implements MeniuFactory {
    @Override
    public Supa creeazaSupa() {
        return new SupaDeVita();
    }

    @Override
    public Desert creeazaDesert() {
        return new Papanasi();
    }
}