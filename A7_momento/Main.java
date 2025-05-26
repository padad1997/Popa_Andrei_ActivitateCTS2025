package memento;

public class Main {
    public static void main(String[] args) {
        RezultatMedical rezultat = new RezultatMedical("Rezultat printat pe hârtie");
        ManagerRezultate manager = new ManagerRezultate();

        manager.adaugaMemento(rezultat.salveaza());
        System.out.println("Stare inițială: " + rezultat);

        rezultat.setContinut("Rezultat online prin platformă");
        System.out.println("Stare modificată: " + rezultat);

        rezultat.restaureaza(manager.getUltimulMemento());
        System.out.println("Stare restaurată: " + rezultat);
    }
}