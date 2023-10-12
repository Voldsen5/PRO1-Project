package ex04;

import DemoSearching.binarysearch.Kunde;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        Player p1 = new Player("Kristoffer",184,95,10);
        Player p2 = new Player("Oliver",190,79,15);
        Player p3 = new Player("Rasmus",200,88,20);
        Player p4 = new Player("Andreas",175,75,25);
        Player p5 = new Player("Mathias",188,105,30);
        Player p6 = new Player("Leon",185,80,35);
        Player p7 = new Player("Freddy",180,85,40);

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(p7);

        System.out.println(findPlayerLinear(players,25));
        System.out.println(findPlayerBinary(players,35));
    }
    public static Player findPlayerLinear(ArrayList<Player> players, int score){
        int i = 0;
        while (i < players.size()){
            int k = players.get(i).getScoredGoals();
            if (k == score){
                return players.get(i);
            }
            else i++;
        }
        return null;
    }

    public static Player findPlayerBinary(ArrayList<Player> players, int score){
        Player p = null;
        int left = 0;
        int right = players.size() - 1;
        while (p == null && left <= right) {
            int middle = (left + right) / 2;
            Player q = players.get(middle);
            if (q.getScoredGoals() == score)
                p = q;
            else if (q.getScoredGoals() < score)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return p;
    }

}
