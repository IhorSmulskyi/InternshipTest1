package main.model;

import com.sun.istack.internal.NotNull;
import main.Application;

import java.util.List;

import static main.model.Student.stringValue;

public class University {
    private String name;
    private List<Student> students;

    public University(@NotNull String name, Application.Source source) {
        this.name = name;
        this.students = source.getStudents();
    }

    public String getName() {
        return this.name;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    @Override
    public String toString() {
        return ("University " + getName()) + "\n" + stringValue(getStudents());
    }
}
