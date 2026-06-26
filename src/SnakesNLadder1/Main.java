package SnakesNLadder1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SnLBoard board = new SnLBoard();
        board.displayBoard();
    }
}

class Cell {
    private int position;

    public Cell(int position) {
        this.position = position;
    }

    public int getPosition() { return position; }
}

class Snake {
    private int head;
    private int tail;

    public Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }

    public int getHead() { return head; }
    public int getTail() { return tail; }
}

class Ladder {
    private int bottom;
    private int top;

    public Ladder(int bottom, int top) {
        this.bottom = bottom;
        this.top = top;
    }

    public int getBottom() { return bottom; }
    public int getTop() { return top; }
}

class SnLBoard {

    Random random;
    private Cell[] cells;
    private Snake[] snakes;
    private Ladder[] ladders;
    boolean[] occupied;

    public SnLBoard() {

        random= new Random();
        cells = new Cell[101];
        for (int i = 0; i < 101; i++) {
            cells[i] = new Cell(i);
        }

        snakes = new Snake[10];
        ladders = new Ladder[10];
        occupied = new boolean[101];

        generateSnakes();
        generateLadder();
    }

    public void generateSnakes() {

        for (int i = 0; i < snakes.length; i++) {
            int head, tail;

            do {

                head = random.nextInt(94) + 6;
                tail = random.nextInt(head - 5) + 1;
            } while (occupied[head] || occupied[tail]);

            occupied[head] = true;
            occupied[tail] = true;
            snakes[i] = new Snake(head, tail);
        }
    }

    public void generateLadder(){
        int bottom, top;
        for(int i=0; i<ladders.length; i++) {

            do {

                bottom = random.nextInt(89) + 1;
                top = random.nextInt(100 - (bottom + 10) + 1) + (bottom + 10);
            }while (occupied[top] || occupied[bottom]);

            occupied[top]=true;
            occupied[bottom]=true;
            ladders[i]= new Ladder(bottom, top);
        }
    }

    public void displayBoard() {

        for (int i = 0; i <=100; i++) {
            boolean found = false;

            for (int j = 0; j < snakes.length; j++) {
                if (snakes[j].getHead() == i) {
                    System.out.println("Snake! Head=" + i + " Tail=" + snakes[j].getTail());
                    found = true;
                    break;
                }
            }
            for (int j = 0; j < ladders.length; j++) {
                if (ladders[j].getBottom() == i) {
                    System.out.println("Ladders! Bottom=" + i + " top=" + ladders[j].getTop());
                    found = true;
                    break;
                }
            }

            if(!found){
                System.out.println("Normal");
            }
        }
    }
}
