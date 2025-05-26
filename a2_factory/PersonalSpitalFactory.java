
package a2_factory;

public class PersonalSpitalFactory {
    public static PersonalSpital CreazaPersonal(TipPersonalSpital Tip) {
        return switch (Tip) {
            case Brancardier -> new Brancardier();
            case Asistent -> new Asistent();
            case Medic -> new Medic();
        };
    }
}
