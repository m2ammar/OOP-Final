package BankAccountSystem;

public class YouthTeam extends Sports {

    private int wins;
    private int draw;
    private int goals;

    public YouthTeam(String teamName, int teamId, int wins,int draw, int goals) {
        super(teamName, teamId);
        this.wins = wins;
        this.draw=draw;
        this.goals = goals;
    }

    @Override
    public void calcPoints() {
        double points = 0;

        points = (wins * 2) + (draw * 1) + (goals * 0.5);
        System.out.println("Points: " + points);
    }
}

