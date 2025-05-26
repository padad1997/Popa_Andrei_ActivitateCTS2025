package abstractfactory;

public class MeniuModernFactory implements MeniuFactory {
    @Override
    public Supa creeazaSupa() {
        return new SupaDeLegume();
    }

    @Override
    public Desert creeazaDesert() {
        return new Cheesecake();
    }
}