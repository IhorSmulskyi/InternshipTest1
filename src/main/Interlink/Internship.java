package main.Interlink;

import main.model.University;
import main.decider.Decider;
import main.model.Student;

import java.util.LinkedList;
import java.util.List;

public class Internship {
    private String name;
    private Decider decider;

    public Internship(String name, Decider decider) {
        this.name = name;
        this.decider = decider;
    }

    public List<Student> selectStudents(University university) {
        List<Student> result = new LinkedList<>();

        for (Student student : university.getStudents()) {
            if (decider.decide(student)) {
                result.add(student);
            }
        }
        return result;
    }

    public String getName() {
        return this.name;
    }
}
