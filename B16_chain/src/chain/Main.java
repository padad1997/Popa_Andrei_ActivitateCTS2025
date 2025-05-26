package chain;

public class Main {
    public static void main(String[] args) {
        Notificator sms = new NotificatorSMS();
        Notificator email = new NotificatorEmail();
        Notificator manager = new NotificatorManager();

        sms.setUrmatorul(email);
        email.setUrmatorul(manager);

        Client client1 = new Client("Ana", "07123445678", "ana@email.com");
        Client client2 = new Client("Vlad", "", "vlad@email.com");
        Client client3 = new Client("Ioana", "", "");

        sms.notifica(client1, "Avem o nouă ofertă pentru tine!");
        sms.notifica(client2, "Reduceri de weekend!");
        sms.notifica(client3, "Oferte disponibile!");
    }
}