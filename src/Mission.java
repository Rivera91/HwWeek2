import java.util.*;

import static java.lang.System.*;


public class Mission {

    public static String start() {
        out.println(Options.travel);
        out.println("1: Walk");
        out.println("2: Uber");
        Scanner scanner = new Scanner(in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                out.println(Options.walk);
               // return walk();
            case 2:
                out.println(Options.uber);
        }
        return null;
    }

    //private static void String walk {


    public static String pieceOneBronx(){
        out.println("1: Take the train");
        out.println("2: Walk");
        Scanner scanner = new Scanner(in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                out.println(Options.train1);
              //  return train1();
            case 2:
                out.println(Options.walk1);
               // return walk1();
        }
        return null;

      // System.out.println(pieceOneManhattan);
    }

    private static void train1() {
    }

    public static String pickNext(){
        out.println("1: Queens");
        out.println("2: Brooklyn");
        out.println("3: Staten Island");
        Scanner scanner = new Scanner(in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
               // System.out.println(Options.pieceOnQueens);
                return pieceOnQueens();
            case 2:
                out.println(Options.pieceOneBrooklyn);
                return pieceOneBrooklyn();
            case 3:
                out.println(Options.pieceOneStatenIsland);
                return pieceOneStatenIsland();
        }
        return null;
    }

    public static String pieceOnQueens(){
        out.println("1: I have a question. ");
        out.println("2: Keep moving");
        Scanner scanner = new Scanner(in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                out.println(Options.askQuestion);
               // return askQuestion();
            case 2:
                out.println(Options.moveOn);
               // return moveOn();
        }
        return null;
    }

    public static String pieceOneBrooklyn(){
        out.println("1: Meet her duh!");
        out.println("2: Keep moving");
        Scanner scanner = new Scanner(in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                out.println(Options.queenB);
               // return queenB();
            case 2:
                out.println(Options.moveOn);
              //  return moveOn();
        }
        return null;
    }

    public static String pieceOneStatenIsland(){
        out.println("1: Eternal Darkness ");
        out.println("2: Jump Ship");
        Scanner scanner = new Scanner(in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                out.println(Options.darkness);
                //return darkness();
            case 2:
                out.println(Options.jumpShip);
              //  return jumpShip();
        }
        return null;
       // out.println(assemble);
    }


    public static String newGame(){
        Scanner scanner = new Scanner(in);
        out.println("Do You want to play again? (Y/N)");

        String input = scanner.next().toLowerCase();

        if (input.equals("y") || input.equals("yes")) {
            return start();
        } else if (input.equals("n") || input.equals("no")) {
            return gameOver();
        } else  System.out.println("");
        return null;
    }

    public static String gameOver(){
        out.println("~FIN~");
        return null;
    }

}


