package ex3;

public class WorkingBoy extends Employee {

    public WorkingBoy(String name, String address, int hourlyWage) {
        super(name, address, hourlyWage);
    }

    @Override
    public int calcWeeklyWage() {
        int wage = 0;
        wage += getHourlyWage() * 25;
        return wage;
    }
}
