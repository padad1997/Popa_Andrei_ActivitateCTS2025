package command;

public class ComandaTratare implements Comanda {
    private Medic medic;
    private String numePacient;

    public ComandaTratare(Medic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void executa() {
        medic.trateazaPacient(numePacient);
    }
}