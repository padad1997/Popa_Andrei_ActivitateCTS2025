package Adapter;

public class AdapterFacturaBar implements SoftFacturaVechi {
    private SoftBarNou softBarNou;

    public AdapterFacturaBar(SoftBarNou softBarNou) {
        this.softBarNou = softBarNou;
    }

    @Override
    public void printeazaFactura(String produs, double pret) {
        softBarNou.genereazaFacturaBautura(produs, pret);
    }
}