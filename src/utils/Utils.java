package utils;

import objekti.Student;

public class Utils {

    private Utils(){}

    public static String getRandomEmail(){
//        Student student = new Student();
//        student.ime = "Pera";
//        student.prezime = "Peric";
//        student.brIndexa = "2132/2023";

        //student.ispis();
        return System.currentTimeMillis() + "@gmail.com";
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int varibleNumberOfArgs(int...args){
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }


}
