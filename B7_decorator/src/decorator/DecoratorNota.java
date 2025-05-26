package decorator;

public abstract class DecoratorNota implements NotaDePlata {
    private NotaDePlata nota;

    public DecoratorNota(NotaDePlata nota) {
        this.nota = nota;
    }

    @Override
    public void printeazaNota() {
        nota.printeazaNota();
        adaugaFelicitare();
    }

    protected abstract void adaugaFelicitare();
}