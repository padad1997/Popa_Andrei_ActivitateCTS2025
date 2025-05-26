package chain;

public class NotificatorSMS extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getTelefon() != null && !client.getTelefon().isEmpty()) {
            System.out.println("SMS către " + client.getNume() + ": " + mesaj);
        } else if (urmatorul != null) {
            urmatorul.notifica(client, mesaj);
        }
    }
}