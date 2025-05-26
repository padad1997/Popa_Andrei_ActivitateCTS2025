package template;

public class Main {
    public static void main(String[] args) {
        InternareTemplate internare1 = new InternareUrgenta();
        InternareTemplate internare2 = new InternareStandard();

        System.out.println("== Internare Urgenta ==");
        internare1.interneazaPacient();

        System.out.println("\n== Internare Standard ==");
        internare2.interneazaPacient();
    }
}