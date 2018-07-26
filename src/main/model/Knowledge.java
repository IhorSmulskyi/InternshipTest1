package main.model;

public class Knowledge {
    public static int MAX_LEVEL = 100;

    private int level;

    public Knowledge(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return String.valueOf(getLevel());
    }
}
