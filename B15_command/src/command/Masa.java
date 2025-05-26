package command;

public class Masa {
    private int numar;

    public Masa(int numar) {
        this.numar = numar;
    }

    public void rezerva() {
        System.out.println("Masa " + numar + " a fost rezervată.");
    }

    public void ocupa() {
        System.out.println("Masa " + numar + " este acum ocupată.");
    }
}