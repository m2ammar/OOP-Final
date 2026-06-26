package SnakesNLadder;

public class Main {
    public static void main(String[] args) {
        SnakesAndLadders game = new SnakesAndLadders("Snakes and Ladders", 2);
        game.displayInfo();

        int position = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Turn " + i + ": ");
            position = game.takeTurn(position);
        }
    }
}