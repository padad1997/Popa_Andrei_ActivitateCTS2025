package proxy;

public class RezervareRestaurant implements Rezervare {
    @Override
    public void realizeaza(int numarPersoane) {
        System.out.println("Rezervare realizată pentru " + numarPersoane + " persoane.");
    }
}