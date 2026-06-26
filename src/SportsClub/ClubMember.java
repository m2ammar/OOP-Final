package SportsClub;
import java.util.Random;

public abstract class ClubMember {
    protected String name;
    protected int memberId;
    protected int round1, round2, round3;

    public ClubMember(String name) {
        this.name = name;
    }

    public abstract void shootRounds();
    public abstract double calculateAverage();
    public abstract String getRating();
}