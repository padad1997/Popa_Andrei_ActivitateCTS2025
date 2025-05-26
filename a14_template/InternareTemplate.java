package template;

public abstract class InternareTemplate {
    public final void interneazaPacient() {
        analizeazaStarea();
        verificaDisponibilitateSalon();
        emiteFisaInternare();
    }

    protected abstract void analizeazaStarea();
    protected abstract void verificaDisponibilitateSalon();
    protected abstract void emiteFisaInternare();
}