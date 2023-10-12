package ex01;

public class Foreman extends Mechanic {
    private int promotionYear;
    private int weeklyBonus;

    public Foreman(String name, String address, int eksamenYear, int hourlyWage, int promotionYear, int weeklyBonus) {
        super(name, address, eksamenYear, hourlyWage);
        this.promotionYear = promotionYear;
        this.weeklyBonus = weeklyBonus;
    }

    public int calcWeeklyWage() {
        int wage = 0;
        wage += getHourlyWage() * 37 + weeklyBonus;
        return wage;
    }
}
