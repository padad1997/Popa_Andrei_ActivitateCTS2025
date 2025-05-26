
package a2_factory;

public class Main {
    public static void main(String[] args) {
        PersonalSpital p1 = PersonalSpitalFactory.CreazaPersonal(TipPersonalSpital.Medic);
        PersonalSpital p2 = PersonalSpitalFactory.CreazaPersonal(TipPersonalSpital.Brancardier);

        p1.Descriere();
        p2.Descriere();
    }
}