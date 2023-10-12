package ex02;

import java.util.ArrayList;

public class TrainingPlan {
    private char level;
    private int weeklyWaterHours;
    private int weeklyStrengthHours;

    private final ArrayList<Swimmer> swimmers = new ArrayList<>();

    public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrengthHours = weeklyStrengthHours;
    }

    public char getLevel() {
        return level;
    }

    public int getWeeklyStrengthHours() {
        return weeklyStrengthHours;
    }

    public int getWeeklyWaterHours() {
        return weeklyWaterHours;
    }

    public int getHoursTrained() {
        int ht;
        ht = getWeeklyStrengthHours() + getWeeklyWaterHours();
        return ht;
    }

    public ArrayList<Swimmer> getSwimmers(){
        return swimmers;
    }

    public void addSwimmer(Swimmer swimmer){
        swimmers.add(swimmer);
    }

    public void removeSwimmer(Swimmer swimmer){
        swimmers.remove(swimmer);
    }
}
