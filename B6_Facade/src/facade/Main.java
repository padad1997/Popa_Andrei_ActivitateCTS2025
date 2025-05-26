package facade;

public class Main {
    public static void main(String[] args) {
        RestaurantFacade facade = new RestaurantFacade();

        if (facade.poateAsezaClient(12, 4)) {
            System.out.println("Clientul poate fi asezat la masa.");
        } else {
            System.out.println("Clientul nu poate fi asezat la masa.");
        }
    }
}