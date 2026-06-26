package ScholarshipLottery;
import java.util.Random;

public abstract class Student {
    protected String name;
    protected int roll1;
    protected int roll2;

    public Student(String name) {
        this.name = name;

    }

    public abstract void rollDice();
    public abstract int calculateScore();
    public abstract String getScholarship();
}