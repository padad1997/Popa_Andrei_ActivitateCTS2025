package decorator;

public class DecoratorLaMultiAni extends DecoratorNota {
    public DecoratorLaMultiAni(NotaDePlata nota) {
        super(nota);
    }

    @Override
    protected void adaugaFelicitare() {
        System.out.println("Felicitare: La Mulți Ani și un An Nou Fericit!");
    }
}