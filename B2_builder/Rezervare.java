package builder;

public class Rezervare {
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorMasa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorMasa, boolean muzicaAmbientala, String genMuzica) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorMasa = decorMasa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "asezareLaGeam=" + asezareLaGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorMasa=" + decorMasa +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + "" +
                '}';
    }
}