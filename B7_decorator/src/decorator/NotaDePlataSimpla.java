package decorator;

public class NotaDePlataSimpla implements NotaDePlata {
    private double suma;

    public NotaDePlataSimpla(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota de plată: " + suma + " RON");
    }
}