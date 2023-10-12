package ex03;

public class ex03App {
    public static void main(String[] args) {
        Player player1 = new Player("Kris", 21);
        player1.addScore(15);
        Player player2 = new Player("Mathias", 17);
        player2.addScore(12);
        Player player3 = new Player("Oliver", 18 );
        player3.addScore(20);
        Player player4 = new Player("Rasmus", 15);
        player4.addScore(9);
        Player player5 = new Player("Andreas", 24);
        player5.addScore(32);

        Team t1 = new Team("Hammel GF");
        t1.addPlayer(player1);
        t1.addPlayer(player2);
        t1.addPlayer(player3);
        t1.addPlayer(player4);
        t1.addPlayer(player5);

        t1.printPlayers();
        System.out.println();

        System.out.println("Average age: " + t1.calcAverageAge());
        System.out.println();

        System.out.println("Total Score: " + t1.calcTotalScore());
        System.out.println();

        System.out.println("Age limit Score: " + t1.calcOldPlayerScore(19));
        System.out.println();

        System.out.println("Highest Score: " + t1.maxScore());
        System.out.println();

        System.out.println(t1.bestPlayerNames());
    }
}
