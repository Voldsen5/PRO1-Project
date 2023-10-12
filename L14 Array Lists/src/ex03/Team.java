package ex03;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public Team (String name){
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player p){
        players.add(p);
    }

    public void printPlayers(){
        for(Player player : players){
            System.out.printf("Name: %s, Age: %d, Score: %d %n", player.getName(), player.getAge(), player.getScore());
        }
    }

    public double calcAverageAge(){
        double age = 0;
        for (Player player : players){
            age = age + player.getAge();
        }
        return age / players.size();
    }

    public int calcTotalScore(){
        int totalScore = 0;
        for (Player player : players){
            totalScore = totalScore + player.getScore();
        }
        return totalScore;
    }

    public int calcOldPlayerScore(int ageLimit){
        int oldPlayerScore = 0;
        for (Player player : players){
            if (player.getAge() > ageLimit ){
                oldPlayerScore = oldPlayerScore + player.getScore();
            }
        }
        return oldPlayerScore;
    }

    public int maxScore(){
        int max = 0;
        for (Player player : players){
            if (player.getScore() > max){
                max = player.getScore();
            }
        }
        return max;
    }

    public ArrayList<Player> bestPlayerNames(){
        ArrayList<Player> bestPlayers = new ArrayList<>();
        int maxScore = maxScore();
        for (Player player : players){
            if (player.getScore() == maxScore){
            }
        }
        return bestPlayers;
    }

}
