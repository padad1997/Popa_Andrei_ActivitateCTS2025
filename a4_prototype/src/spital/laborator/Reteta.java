package spital.laborator;

import java.util.HashMap;
import java.util.Map;

public class Reteta {
    private String nume;
    private Map<String, Double> ingrediente;

    public Reteta(String nume, Map<String, Double> ingrediente) {
        this.nume = nume;
        this.ingrediente = new HashMap<>(ingrediente);
    }

    public String getNume() {
        return nume;
    }

    public Map<String, Double> getIngrediente() {
        return new HashMap<>(ingrediente);
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", ingrediente=" + ingrediente +
                '}';
    }
}