package objekti;

public class Student extends Person{


    private String brIndexa;

    public Student(String ime, String prezime, int godine, Adresa adresa, String brIndexa) {
        super(ime, prezime, godine, adresa);
        this.brIndexa = brIndexa;
    }

    public String getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(String brIndexa) {
        this.brIndexa = brIndexa;
    }


    @Override
    public String toString() {
        return "Student{" +
                "brIndexa='" + brIndexa + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                ", adresa=" + adresa +
                '}';
    }


}
