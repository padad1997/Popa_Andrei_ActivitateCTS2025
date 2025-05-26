package Adapter;

public class Main {
    public static void main(String[] args) {
        SoftFacturaVechi sistemFactura = new AdapterFacturaBar(new SoftBarNou());

        sistemFactura.printeazaFactura("Cocktail Mojito", 25.5);
        sistemFactura.printeazaFactura("Cafea Espresso", 12.0);
    }
}