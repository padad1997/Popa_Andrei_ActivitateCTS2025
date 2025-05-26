
package a3_abstract_factory;

public class FactoryMedical implements PersonalFactory {
    @Override
    public PersonalSpital CreazaPersonal(String Tip) {
        switch (Tip.toLowerCase()) {
            case "medic":
                return new Medic();
            case "asistent":
                return new Asistent();
            default:
                throw new IllegalArgumentException("Tip invalid pentru personal medical: " + Tip);
        }
    }
}
