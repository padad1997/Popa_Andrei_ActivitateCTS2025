package state;

public class Rezervata implements Stare {
    @Override
    public void ocupa(Masa masa) {
        System.out.println("Masa " + masa.getNumar() + " a fost rezervată.");
        masa.setStare(this);
    }
}