package main;

import main.Interlink.Internship;
import main.model.University;
import main.decider.LevelDecider;
import main.model.Student;
import main.model.Knowledge;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static main.model.Student.stringValue;

public class Application {

    // todo: should be moved to the right place (or separate file)
    public interface Source {
        List<Student> getStudents();
    }

    private static class DBSource implements Source {
        @Override
        public List<Student> getStudents() {
            // todo: implement me!
            return null;
        }
    }
    // todo: implement me
    private static class FileSource implements Source {
        @Override
        public List<Student> getStudents() {
            return null;
        }
    }

    private static class MockedSource implements Source {

        @Override
        public List<Student> getStudents() {
            List<Student> students = new LinkedList<>();
            students.add(new Student("Andrew Kostenko", new Knowledge(51)));
            students.add(new Student("Julia Veselkina", new Knowledge(30)));
            students.add(new Student("Maria Perechrest", new Knowledge(92)));

            return students;
        }
    }


    public static void main(String[] args) {
        University university = new University("CH.U.I.", new MockedSource());

        System.out.println("Input university:");
        System.out.println(university);

        Internship internship = new Internship("Interlink", new LevelDecider());
        System.out.println("Result students list:");
        System.out.println("Internship - " + internship.getName());

        System.out.println(stringValue(internship.selectStudents(university)));
    }


}
