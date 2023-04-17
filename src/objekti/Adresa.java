package objekti;

public class Adresa {


    String ulica;
    String grad;

    public Adresa(String ulica, String grad) {
        this.ulica = ulica;
        this.grad = grad;
    }

    @Override
    public String toString() {
        return "objekti.Adresa{" +
                "ulica='" + ulica + '\'' +
                ", grad='" + grad + '\'' +
                '}';
    }
}
