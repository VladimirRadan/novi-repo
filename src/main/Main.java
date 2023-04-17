package main;

import objekti.Adresa;
import objekti.Profesor;
import objekti.Student;
import utils.Constants;
import utils.Utils;

import java.util.Scanner;

public class Main {


    static final int A = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Adresa adresa = new Adresa("Prva", "Bgd");

        Object object = "";

        String a = (String)object;

        Student student = new Student("Pera", "Peric", 20, adresa, "213213/2023");
        student.setBrIndexa("44324234/2022");
        System.out.println(student);

        Profesor profesor = new Profesor("Marko", "Peric", 60, adresa);



    }


}
