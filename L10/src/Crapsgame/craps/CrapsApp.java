package Crapsgame.craps;

public class CrapsApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the game of Craps.");
        CrapsGame game = new CrapsGame();
        game.printRules();

        game.play();

        // TODO

        System.out.println("Thank you for playing craps.");
    }
}
