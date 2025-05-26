package state;

public class Libera implements Stare {
    @Override
    public void ocupa(Masa masa) {
        System.out.println("Masa " + masa.getNumar() + " este liberă.");
        masa.setStare(this);
    }
}