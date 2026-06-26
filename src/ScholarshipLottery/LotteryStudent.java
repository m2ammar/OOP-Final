package ScholarshipLottery;

import java.util.Random;

public class LotteryStudent extends Student{
    private int score;
    Random random;
    protected static int totalStudents=0;


    public LotteryStudent(String name){
        super(name);
        random= new Random();
        totalStudents++;
    }

    public void rollDice(){

        roll1=random.nextInt(6)+1;
        roll2=random.nextInt(6)+1;
    }

    public int calculateScore(){

        score= (roll1 * roll2) + (roll1 + roll2);
        return score;
    }

    public String getScholarship(){
        String scholarship="";
        if(score == 0){
            calculateScore();
        }

        if(score > 20){
            scholarship="Gold scholarship";
        }else if(score >=10 && score <=20){
            scholarship= "Silver scholarship";
        }else {
            scholarship="No scholarship";
        }

        return scholarship;
    }
}
