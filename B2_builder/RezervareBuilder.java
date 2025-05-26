package builder;

public class RezervareBuilder {
    private boolean asezareLaGeam = false;
    private boolean scauneErgonomice = false;
    private boolean decorMasa = false;
    private boolean muzicaAmbientala = false;
    private String genMuzica = "fara";

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareBuilder setDecorMasa(boolean decorMasa) {
        this.decorMasa = decorMasa;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    public Rezervare build() {
        return new Rezervare(asezareLaGeam, scauneErgonomice, decorMasa, muzicaAmbientala, genMuzica);
    }
}