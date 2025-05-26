package builder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new RezervareBuilder()
                .setAsezareLaGeam(true)
                .setMuzicaAmbientala(true)
                .setGenMuzica("Jazz")
                .build();

        Rezervare rezervare2 = new RezervareBuilder()
                .setScauneErgonomice(true)
                .build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}