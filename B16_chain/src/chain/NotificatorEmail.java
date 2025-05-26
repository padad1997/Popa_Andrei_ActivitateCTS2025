package chain;

public class NotificatorEmail extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getEmail() != null && !client.getEmail().isEmpty()) {
            System.out.println("Email către " + client.getNume() + ": " + mesaj);
        } else if (urmatorul != null) {
            urmatorul.notifica(client, mesaj);
        }
    }
}