package factory;

public class Main {
    public static void main(String[] args) {
        Supa supa1 = FactorySupa.creazaSupa(TipSupa.LEGUME);
        Supa supa2 = FactorySupa.creazaSupa(TipSupa.CIUPERCI);
        Supa supa3 = FactorySupa.creazaSupa(TipSupa.VITA);

        supa1.serveste();
        supa2.serveste();
        supa3.serveste();
    }
}