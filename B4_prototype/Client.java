package prototype;

public class Client implements Cloneable {
    private String nume;
    private String email;
    private String telefon;
    private String adresa;

    public Client(String nume, String email, String telefon, String adresa) {
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    @Override
    public Client clone() {
        try {
            return (Client) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clonare nereușită", e);
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + "" +
                ", email='" + email + "" +
                ", telefon='" + telefon + "" +
                ", adresa='" + adresa + "" +
                '}';
    }
}