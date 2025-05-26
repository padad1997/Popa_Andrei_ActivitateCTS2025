package proxy;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new ProxyRezervare(new RezervareRestaurant());

        rezervare.realizeaza(2);
        rezervare.realizeaza(4);
        rezervare.realizeaza(6);
    }
}