package ex01;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private ArrayList<Double> lapTimes;

    public Swimmer(String name, ArrayList<Double> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }

    /** Return the fastest lap time. */
    public double bestLapTime() {
        double bestTime = lapTimes.get(0);
        for (int i = 1; i < lapTimes.size(); i++) {
            if (bestTime >= lapTimes.get(i)){
                bestTime = lapTimes.get(i);
            }
        }
        return bestTime;
    }
//------------------------------------------------------
    private TrainingPlan trainingPlan;

    public TrainingPlan getTrainingPlan(){
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan){
        this.trainingPlan = trainingPlan;
    }

    public void removeTrainingPlan(){
        this.trainingPlan = null;
    }
//-------------------------------------------------------

    public int allTrainingHours(){
        int allHours = 0;
        allHours = getTrainingPlan().getWeeklyStrengthHours() + getTrainingPlan().getWeeklyWaterHours();
        return allHours;
    }

}
