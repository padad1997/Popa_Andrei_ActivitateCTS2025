package factory;

public class FactorySupa {
    public static Supa creazaSupa(TipSupa tip) {
        switch (tip) {
            case LEGUME:
                return new SupaDeLegume();
            case CIUPERCI:
                return new SupaDeCiuperci();
            case VITA:
                return new SupaDeVita();
            default:
                throw new IllegalArgumentException("Tip necunoscut de supă.");
        }
    }
}