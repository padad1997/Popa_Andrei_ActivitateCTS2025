package template;

public class InternareStandard extends InternareTemplate {
    @Override
    protected void analizeazaStarea() {
        System.out.println("Analiza standard a stării pacientului.");
    }

    @Override
    protected void verificaDisponibilitateSalon() {
        System.out.println("Verificare detaliată a disponibilității în saloane.");
    }

    @Override
    protected void emiteFisaInternare() {
        System.out.println("Emitere fișă de internare pentru caz standard.");
    }
}