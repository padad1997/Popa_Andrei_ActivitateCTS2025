package strategy;

public class PlataCard implements Plata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul: " + suma + " RON.");
    }
}