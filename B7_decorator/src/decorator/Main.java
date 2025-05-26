package decorator;

public class Main {
    public static void main(String[] args) {
        NotaDePlata nota = new NotaDePlataSimpla(120.0);
        nota.printeazaNota();

        System.out.println();

        NotaDePlata notaCuFelicitare = new DecoratorLaMultiAni(nota);
        notaCuFelicitare.printeazaNota();
    }
}