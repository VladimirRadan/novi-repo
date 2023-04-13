public class Student {

    //polja - ono sto opisuje objekat
    String ime;
    String prezime;
    int godine;
    Adresa adresa;

    //konstruktor - mehanizam za kreiranje objekta

    public Student(){}

    public Student(String ime, String prezime, int godine) {
        System.out.println("Poziv konstruktora sa 3 parametra");
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public Student(int godine, String prezime, String ime) {
        System.out.println("Poziv konstruktora sa 3 parametra");
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public Student(String ime, String prezime) {
        System.out.println("Poziv konstruktora sa 2 parametra");
        this.ime = ime;
        this.prezime = prezime;
    }

    public Student(String ime, String prezime, int godine, Adresa adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.adresa = adresa;
    }

    //metode - ono sto objekat radi
     void ispis(){
        System.out.println("Ime: " + ime + " prezime: " + prezime + " broj godina: " + godine);
    }

     String ispis2(){
        return "Test ispis";
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                ", adresa=" + adresa +
                '}';
    }


}
