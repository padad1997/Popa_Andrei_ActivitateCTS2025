package state;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(10);

        masa1.schimbaStare(new Rezervata());
        masa1.schimbaStare(new Ocupata());
        masa1.schimbaStare(new Libera());
    }
}