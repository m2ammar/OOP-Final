package BankAccountSystem;

public abstract class Sports {

    private String teamName;
    private int teamId;

    public Sports(String teamName, int teamId){

        this.teamName=teamName;
        this.teamId=teamId;
    }

    public abstract void calcPoints();
}
