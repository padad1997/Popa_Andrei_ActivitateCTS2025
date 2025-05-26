package flyweight;

public class Main {
    public static void main(String[] args) {
        FabricaClienti fabrica = new FabricaClienti();

        Client client1 = fabrica.getClient("Ana Popescu", "07123345678", "ana@email.com");
        Client client2 = fabrica.getClient("Ana Popescu", "07123345678", "ana@email.com");

        Rezervare r1 = new Rezervare(client1, 5, 4, "18:00");
        Rezervare r2 = new Rezervare(client2, 7, 2, "20:00");

        r1.afiseaza();
        r2.afiseaza();
    }
}