package main.decider;

import main.model.Student;
import main.model.Knowledge;

public class LevelDecider implements Decider {
    @Override
    public boolean decide(Student student) {
        return student.getKnowledge().getLevel() > (Knowledge.MAX_LEVEL / 2);
    }
}
