package template;

public class InternareUrgenta extends InternareTemplate {
    @Override
    protected void analizeazaStarea() {
        System.out.println("Analiza de urgență a stării pacientului.");
    }

    @Override
    protected void verificaDisponibilitateSalon() {
        System.out.println("Verificare rapidă a unui salon disponibil.");
    }

    @Override
    protected void emiteFisaInternare() {
        System.out.println("Emitere fișă de internare pentru caz de urgență.");
    }
}