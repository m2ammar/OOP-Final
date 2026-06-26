package SportsClub;

import java.util.Random;

public class ShootingMember extends ClubMember{

    public static int totalMembers=0;
    private static int nextId = 1001;
    private  double average;
    Random random;

    public ShootingMember(String name){
        super(name);
        totalMembers++;
        memberId=nextId++;
        random = new Random();
    }


    public void shootRounds(){
        round1=random.nextInt(10) + 1;
        round2=random.nextInt(10)+ 1;
        round3=random.nextInt(10)+ 1;
    }

    public double calculateAverage(){

        average=(round1 + round2 + round3) / 3.0;
        return average;
    }

    public String getRating(){
        String rating="";

        if(average ==0){
            calculateAverage();
        }

        if(average>= 8){
            rating= "Elite";
        }else if(average >= 5){
            rating ="Competitive";
        }else {
            rating = "Beginner";
        }

        return rating;
    }
}
