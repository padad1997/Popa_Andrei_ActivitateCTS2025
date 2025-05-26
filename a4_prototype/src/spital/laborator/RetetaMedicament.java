package spital.laborator;

import java.util.Map;

public class RetetaMedicament extends Reteta implements RetetaPrototype {

    public RetetaMedicament(String nume, Map<String, Double> ingrediente) {
        super(nume, ingrediente);
    }

    @Override
    public RetetaPrototype duplicare() {
        return new RetetaMedicament(this.getNume(), this.getIngrediente());
    }
}