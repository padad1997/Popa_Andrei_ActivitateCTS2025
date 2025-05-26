package prototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii = new HashMap<>();
        solutii.put("SolutieA", 10.5);
        solutii.put("SolutieB", 5.0);

        RetetaMedicament original = new RetetaMedicament("Reteta1", solutii);
        RetetaMedicament copie = (RetetaMedicament) original.duplicare();

        System.out.println("Original: " + original);
        System.out.println("Copie: " + copie);
    }
}