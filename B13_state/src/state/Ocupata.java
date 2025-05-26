package state;

public class Ocupata implements Stare {
    @Override
    public void ocupa(Masa masa) {
        System.out.println("Masa " + masa.getNumar() + " este ocupată.");
        masa.setStare(this);
    }
}