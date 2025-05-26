package observer;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Client client1 = new Client("Ion Popescu");
        Client client2 = new Client("Maria Ionescu");

        restaurant.aboneaza(client1);
        restaurant.aboneaza(client2);

        restaurant.trimiteNotificare("Noua ofertă: 20% reducere la meniurile de prânz!");

        restaurant.dezaboneaza(client1);

        restaurant.trimiteNotificare("Meniu nou: Burger vegetarian disponibil acum!");
    }
}