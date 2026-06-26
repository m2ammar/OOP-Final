package SnakesNLadder;

import java.util.Random;

public class SnakesAndLadders extends BoardGame {

    private int dice;
    Random random;

    public SnakesAndLadders(String gameName, int numberOfPlayers) {
        super(gameName , numberOfPlayers);
        random= new Random();
    }

    public int rollDice(){
        dice=random.nextInt(6)+1;
        return dice;
    }

    public int applySnakeOrLadder(int position){

        if(position == 16 || position == 47 || position == 49 ){
            dice -= 10;
        }else if( position == 4 || position == 9 || position == 20){
            dice +=10;
        }

        return dice;
    }

    public int takeTurn(int currentPosition){

        rollDice();
        int roll = dice;
        int positionAfterRoll = currentPosition + roll;
        dice = applySnakeOrLadder(positionAfterRoll);
        String event;
        if(dice > positionAfterRoll) event = "Ladder!";
        else if(dice < positionAfterRoll) event = "Snake!";
        else event = "No change";
        System.out.println("Rolled: " + roll + " → Position: " + positionAfterRoll + " → " + event + " → " + dice);
        return dice ;
    }

    public int getDice(){
        return dice;
    }
}
