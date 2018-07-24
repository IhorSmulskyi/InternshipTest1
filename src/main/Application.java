package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import java.io.*;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));
        System.out.println("Результат операции: ");

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());

    }
    public static void newFile(int k1, int k2) throws Exception {
        FileWriter nFile = new FileWriter("file1.txt");

        for(int i = k1; i <= k2; i++) {

            nFile.write(i);

        }

        nFile.close();
    }
