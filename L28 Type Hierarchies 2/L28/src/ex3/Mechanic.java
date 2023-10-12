package ex3;

public class Mechanic extends Employee {

    private int eksamenYear;
    public Mechanic(String name, String address, int eksamenYear, int hourlyWage) {
        super(name, address, hourlyWage);
        this.eksamenYear = eksamenYear;

    }

    public int calcWeeklyWage(){
        int wage = 0;
        wage += getHourlyWage() * 37;
        return wage;
    }
}
