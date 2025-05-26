package chain;

public class NotificatorManager extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Avertizare către manager: Nu se poate trimite notificare clientului " + client.getNume() + ".");
    }
}