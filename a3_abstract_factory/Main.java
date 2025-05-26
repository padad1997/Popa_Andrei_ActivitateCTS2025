
package a3_abstract_factory;

public class Main {
    public static void main(String[] args) {
        PersonalFactory factoryMedical = new FactoryMedical();
        PersonalFactory factoryNonMedical = new FactoryNonMedical();

        PersonalSpital medic = factoryMedical.CreazaPersonal("medic");
        PersonalSpital secretar = factoryNonMedical.CreazaPersonal("secretar");

        medic.Descriere();
        secretar.Descriere();
    }
}