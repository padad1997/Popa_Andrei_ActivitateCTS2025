package observer;

public class Main {
    public static void main(String[] args) {
        Spital spital = new Spital();

        Pacient pacient1 = new Pacient("Ana Marin");
        Pacient pacient2 = new Pacient("George Radu");

        spital.aboneaza(pacient1);
        spital.aboneaza(pacient2);

        spital.trimiteNotificare("Alertă: virus gripal confirmat în oraș!");

        spital.dezaboneaza(pacient1);

        spital.trimiteNotificare("Actualizare: purtarea măștii devine obligatorie!");
    }
}