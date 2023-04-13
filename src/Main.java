public class Main {


    public static void main(String[] args) {

        Student student = new Student();// ------>Student@1d251891

        student.ime = "Pera";
        student.prezime = "Peric";
        student.godine = 20;

        student.ispis();

        Student student1 = new Student();
        student1.ime = "Marko";
        student1.prezime = "Markovic";
        student1.godine = 19;

        student1.ispis();


        Student student2 = new Student("John", "Smith", 25);

        Student student3 = new Student(25, "Djura", "Djuric");

        student3.godine = 18;
        student3.ispis();


        Student studenti[] = new Student[]{student, student1};


        for (int i = 0; i < studenti.length; i++) {
            studenti[i].ispis();
        }


        Adresa adresa = new Adresa();
        adresa.ulica  = "Prva";
        adresa.grad = "Miami";


        Student student4 = new Student("John", "Smith", 25, adresa);

        student4.ispis();

        System.out.println(student4);


        String ispis = student4.ispis2();







    }


}
