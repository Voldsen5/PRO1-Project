package ex01;

public class Beer implements Mesurable{
    private String name;
    private double alcoholPercentage;

    public Beer(String name, double alcoholPercentage){
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return alcoholPercentage;
    }

    @Override
    public String toString() {
        return "Beer: " + "\nname: '" + name + '\'' + ", \nAlcohol Percentage: " + alcoholPercentage;
    }
}
