package pigs03;

public class Player {
    private int points;
    private String player;

    public Player(String player){
        this.player = player;
        this.points = 0;
    }

    public void updateTotal(int points){
        this.points = this.points + points;
    }

    public int getPoints(){
        return points;
    }
}
