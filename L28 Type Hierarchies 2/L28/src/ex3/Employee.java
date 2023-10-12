package ex3;

public abstract class Employee {
    private String name;
    private String address;
    private int hourlyWage;

    public Employee(String name, String address, int hourlyWage) {
        this.name = name;
        this.address = address;
        this.hourlyWage = hourlyWage;
    }

    public String getName() {
        return name;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public int calcWeeklyWage() {
        int wage = 0;
        wage += getHourlyWage() * 37;
        return wage;
    }
}

