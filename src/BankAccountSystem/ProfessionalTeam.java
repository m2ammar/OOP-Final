package BankAccountSystem;

public class ProfessionalTeam extends Sports {

    private int wins;
    private int draw;

    public ProfessionalTeam(String teamName, int teamId, int  wins, int draw){
        super(teamName,teamId);
        this.wins=wins;
        this.draw=draw;
    }

    @Override
    public void calcPoints(){
        double points=0;

        points= (wins * 3) + (draw * 1);
        System.out.println("Points: "+points);
    }
}
