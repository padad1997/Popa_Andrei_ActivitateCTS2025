package chain;

public abstract class Notificator {
    protected Notificator urmatorul;

    public void setUrmatorul(Notificator urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void notifica(Client client, String mesaj);
}