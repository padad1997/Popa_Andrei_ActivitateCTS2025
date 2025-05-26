package prototype;

public class Main {
    public static void main(String[] args) {
        Client clientOriginal = new Client("Ion Popescu", "ion.popescu@email.com", "07234456789", "Str. Libertatii 10");

        Client clientNou = clientOriginal.clone();

        System.out.println("Client original: " + clientOriginal);
        System.out.println("Client clonat: " + clientNou);
    }
}