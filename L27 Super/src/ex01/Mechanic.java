package ex01;

public class Mechanic extends Person{
    private int eksamenYear;
    private int hourlyWage;

    public Mechanic(String name, String address, int eksamenYear, int hourlyWage) {
        super(name, address);
        this.eksamenYear = eksamenYear;
        this.hourlyWage = hourlyWage;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public int calcWeeklyWage(){
        int wage = 0;
        wage += getHourlyWage() * 37;
        return wage;
    }
}
