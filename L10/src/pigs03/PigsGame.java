package pigs03;

import java.util.Scanner;

public class PigsGame {

    public void play() {
        Scanner scan = new Scanner(System.in);
        DiceThrower thrower = new DiceThrower();
        Die die1 = new Die();
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");

        boolean turn = true;
        boolean finished = false;
        while (!finished) {
            int points = 0;
            String answer = "";
            while (turn) {
                System.out.println("player1 Roll Again? (Y/n)");
                answer = scan.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    System.out.println("player1 sum: " + (points + player1.getPoints()));
                    player1.updateTotal(points);
                    System.out.println();
                    points = 0;
                    turn = false;
                } else {
                    die1.roll();
                    if (die1.getFaceValue() == 1) {
                        points = 0;
                        turn = false;
                        System.out.println("Du har slået " + die1.getFaceValue() + " Du Har dsv tabt, prøv igen");
                        System.out.println("");
                    } else {
                        System.out.println("Player1 points: " + points + " + " + die1.getFaceValue() + " = " + (points + die1.getFaceValue()));
                        points += die1.getFaceValue();
                        if (points + player1.getPoints() >= 30) {
                            System.out.println("Tillykke, du har vundet!!");
                            finished = true;
                        }

                    }
                }
            }
            while (!turn) {
                System.out.println("Player2 - Roll again? (Y/n)");
                answer = scan.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    System.out.println("Player2 sum: " + (points + player2.getPoints()));
                    player2.updateTotal(points);
                    System.out.println("");
                    points = 0;
                    turn = true;
                } else {
                    die1.roll();
                    if (die1.getFaceValue() == 1) {
                        points = 0;
                        turn = true;
                        System.out.println(die1.getFaceValue() + " Du har desværre tabt, prøv igen!");
                        System.out.println("");

                    } else {
                        System.out.println("Player2 points: " + points + " + " + die1.getFaceValue() + " = " + (points + die1.getFaceValue()));
                        points += die1.getFaceValue();
                        if (points + player2.getPoints() >= 30) {
                            System.out.println("Tilykke Player2, du har vundet!");
                            finished = true;
                        }
                    }
                }
            }
        }
    }
}