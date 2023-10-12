package ex01;

public class Chilli implements Mesurable {
    private String name;
    private double scoville;

    public Chilli(String name, int scoville){
        this.name = name;
        this.scoville = scoville;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return scoville;
    }


    @Override
    public String toString() {
        return "Chilli: " + "\nname: '" + name + '\'' + ", \nscoville: " + scoville;
    }
}
