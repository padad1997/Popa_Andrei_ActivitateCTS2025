package strategy;

public class PlataCash implements Plata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cash: " + suma + " RON.");
    }
}