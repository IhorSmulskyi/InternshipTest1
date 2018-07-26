package main.model;

import com.sun.istack.internal.NotNull;

import java.util.List;

public class Student {
    private String name;
    private Knowledge knowledge;

    public Student(@NotNull String name, @NotNull Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return this.knowledge;
    }

    private String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Student [name: " + getName() + " kn: " + getKnowledge() + "]";
    }

    public static String stringValue(List<Student> students) {
        StringBuilder builder = new StringBuilder();
        for (Student student : students) {
            builder.append(student).append("\n");
        }

        return builder.toString();
    }
}
