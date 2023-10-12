package Crapsgame.craps;

import Simplegame.Project1.simple.DiceThrower;

import java.util.Scanner;

public class CrapsGame {

    /**
     * Simulates playing one game of craps.
     */
    public void play() {
        // TODO
        Scanner scanner = new Scanner(System.in);
        DiceThrower thrower = new DiceThrower();

        boolean finished = false;
        while (!finished) {
            // TODO: Roll dice, print roll description.
            thrower.roll();
            System.out.println(thrower.rollDescription());


            System.out.println("Roll again? (Y/n) ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                finished = true;
            }
        }
        scanner.close();
    }

    /**
     * Prints a 'You have won' message.
     */
    public void printGameWon() {
        // TODO
    }

    /**
     * Prints a 'You have lost' message.
     */
    public void printGameLost() {
        // TODO
    }

    /**
     * Prints the rules of craps.
     */
    public void printRules() {
        // TODO
        System.out.println("In the game a player throws 2 dice. The first throw is called 'the come out roll'. The player wins, if the sum of the dice in the come out roll is 7 or 11. The player loses, if the sum is 2, 3 or 12. If the sum is something else (that is, 4, 5, 6, 8, 9 or 10), the sum is set as the player's 'point'. The player will now continue throwing the dice until he has lost or won. A sum equal his 'point' is a win, and a sum equal 7 is a loss.");
    }

}
