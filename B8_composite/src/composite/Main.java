package composite;

public class Main {
    public static void main(String[] args) {
        SectiuneMeniu meniuPrincipal = new SectiuneMeniu("Meniu Restaurant");

        SectiuneMeniu startere = new SectiuneMeniu("Startere");
        startere.adauga(new ItemMeniu("Bruschete"));
        startere.adauga(new ItemMeniu("Salată Caprese"));

        SectiuneMeniu bauturi = new SectiuneMeniu("Băuturi");
        SectiuneMeniu sucuri = new SectiuneMeniu("Sucuri");
        sucuri.adauga(new ItemMeniu("Cola"));
        sucuri.adauga(new ItemMeniu("Fanta"));
        SectiuneMeniu cafea = new SectiuneMeniu("Cafea");
        cafea.adauga(new ItemMeniu("Espresso"));
        cafea.adauga(new ItemMeniu("Cappuccino"));
        bauturi.adauga(sucuri);
        bauturi.adauga(cafea);

        SectiuneMeniu desert = new SectiuneMeniu("Desert");
        desert.adauga(new ItemMeniu("Papanași"));
        desert.adauga(new ItemMeniu("Cheesecake"));

        meniuPrincipal.adauga(startere);
        meniuPrincipal.adauga(bauturi);
        meniuPrincipal.adauga(desert);

        meniuPrincipal.afiseaza("");
    }
}