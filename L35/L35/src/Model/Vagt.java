package Model;

import java.util.ArrayList;

public class Vagt {
    private final int timer;
    Job job;
    Frivillig frivillig;
    final ArrayList<Frivillig> frivilligs = new ArrayList<>();

    public Vagt(int timer, Frivillig frivillig){
        this.timer = timer;
        this.frivillig = frivillig;
        frivillig.addVagt(this);
    }

    public ArrayList<Frivillig> getFrivilligs(){
        return new ArrayList<Frivillig>(frivilligs);
    }

    public int getTimer() {
        return timer;
    }

    public Job getJob(){
        return job;
    }
}
