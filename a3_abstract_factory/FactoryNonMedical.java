
package a3_abstract_factory;

public class FactoryNonMedical implements PersonalFactory {
    @Override
    public PersonalSpital CreazaPersonal(String Tip) {
        switch (Tip.toLowerCase()) {
            case "secretar":
                return new Secretar();
            case "registrator":
                return new Registrator();
            default:
                throw new IllegalArgumentException("Tip invalid pentru personal non-medical: " + Tip);
        }
    }
}
