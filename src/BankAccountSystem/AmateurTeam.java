package BankAccountSystem;

public class AmateurTeam extends Sports {

    private int wins;
    private int draw;
    private int forfeits;

    public AmateurTeam(String teamName, int teamId, int wins, int draw, int forfeits) {
        super(teamName, teamId);
        this.wins = wins;
        this.draw = draw;
        this.forfeits = forfeits;
    }

    @Override
    public void calcPoints() {
        double points = 0;

        points = (wins * 3) + (draw * 1) - (forfeits * 2);
        System.out.println("Points: " + points);
    }
}
