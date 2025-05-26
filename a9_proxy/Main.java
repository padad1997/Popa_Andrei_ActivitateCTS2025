package proxy;

public class Main {
    public static void main(String[] args) {
        Spital spital = new Spital();
        ProxyInternare proxy = new ProxyInternare(spital);

        Pacient pacient1 = new Pacient("Ion Popescu", true);
        Pacient pacient2 = new Pacient("Maria Ionescu", false);

        proxy.interneaza(pacient1);
        proxy.interneaza(pacient2);
    }
}