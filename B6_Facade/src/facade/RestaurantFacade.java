package facade;

public class RestaurantFacade {
    private MeseDisponibile meseDisponibile;
    private MasaDebarasata masaDebarasata;
    private ServetelePeMasa servetelePeMasa;

    public RestaurantFacade() {
        this.meseDisponibile = new MeseDisponibile();
        this.masaDebarasata = new MasaDebarasata();
        this.servetelePeMasa = new ServetelePeMasa();
    }

    public boolean poateAsezaClient(int idMasa, int numarPersoane) {
        return meseDisponibile.areMasaLibera(numarPersoane)
                && masaDebarasata.esteDebarasata(idMasa)
                && servetelePeMasa.areServetele(idMasa);
    }
}