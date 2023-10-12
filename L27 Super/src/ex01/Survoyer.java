package ex01;

public class Survoyer extends Mechanic {

    private int inspection;

    public Survoyer(String name, String address, int eksamenYear, int hourlyWage, int inspection) {
        super(name, address, eksamenYear, hourlyWage);
        this.inspection = inspection;
    }

    public int getInspection() {
        return inspection;
    }

    public int calcWeeklyWage() {
        int wage = 0;
        wage += getHourlyWage() * 37 + getInspection() * 29;
        return wage;
    }


}
