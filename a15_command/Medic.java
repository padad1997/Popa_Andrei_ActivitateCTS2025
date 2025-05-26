package command;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void internarePacient(String pacient) {
        System.out.println("Medic " + nume + " a internat pacientul: " + pacient);
    }

    public void trateazaPacient(String pacient) {
        System.out.println("Medic " + nume + " tratează pacientul: " + pacient);
    }
}