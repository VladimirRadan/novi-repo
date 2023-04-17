package objekti;

public class Person {

    protected String ime;
    protected String prezime;
    protected int godine;
    protected Adresa adresa;

    public Person(String ime, String prezime, int godine, Adresa adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.adresa = adresa;
    }

}
