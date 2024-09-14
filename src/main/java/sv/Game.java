package sv;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    ArrayList<String> gameArray = new ArrayList<>(9);
    boolean isX = true;
    Game(){
        printInterface();

    } //empty
    public void printInterface(){
        // init game
        System.out.println("   1   |   2   |   3\n" +
                "-----------------------\n" +
                "   4   |   5   |   6\n" +
                "-----------------------\n" +
                "   7   |   8   |   9\n");
    }

    public void start(){
        // game loop

    }

    public void populate(String x, int y){
        gameArray.add(y, x);
    }

    public void printCurrentState(){
        System.out.println(gameArray.get(0));
        System.out.print(gameArray.get(1));
        System.out.print(gameArray.get(2));
        System.out.println(gameArray.get(3));
        System.out.print(gameArray.get(4));
        System.out.print(gameArray.get(5));
        System.out.println(gameArray.get(6));
        System.out.print(gameArray.get(7));
        System.out.print(gameArray.get(8));
    }
}