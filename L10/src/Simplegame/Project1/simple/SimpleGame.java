package Simplegame.Project1.simple;

import java.util.Scanner;

public class SimpleGame {

    /**
     * Simulates playing one game of Simple.
     */
    public void play() {
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

        System.out.printf("\nResults:\n");
        System.out.printf("---------\n");
        // TODO: Print all the results:
        System.out.println("Roll Count: " + thrower.getRollCount());
        System.out.println("All Face Values: " + thrower.getAllFaceValue());
        System.out.println("Face Value of 6: " + thrower.getValue6());
        System.out.println("Same Face: " + thrower.getSameFace());
        System.out.println("Maximum sum: " + thrower.getMaxSumRoll());
        System.out.println("Average sum: " + thrower.getAllFaceValue() / thrower.getRollCount());
        // roll count, total of all face values, average sum in one roll,
        // count of face value 6, count of same face value on both dice,
        // max sum in one roll.
        // Use the method: System.out.printf().

    }

    /**
     * Prints the rules of Simple.
     */
    public void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of Simple:");
        System.out.println("The player throws the 2 dice as long as he/she wants.");
        System.out.println("=====================================================");
    }

}
