package SnakesNLadder;

public class BoardGame {
    private String gameName;
    private int numberOfPlayers;

    public BoardGame(String gameName, int numberOfPlayers) {
        this.gameName = gameName;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getGameName() { return gameName; }
    public int getNumberOfPlayers() { return numberOfPlayers; }

    public void displayInfo() {
        System.out.println("Game: " + gameName);
        System.out.println("Players: " + numberOfPlayers);
    }
}