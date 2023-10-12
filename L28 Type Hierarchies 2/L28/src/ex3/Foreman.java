package ex3;

public class Foreman extends Employee {
    private int promotionYear;
    private int weeklyBonus;

    public Foreman(String name, String address, int hourlyWage, int promotionYear, int weeklyBonus) {
        super(name, address, hourlyWage);
        this.promotionYear = promotionYear;
        this.weeklyBonus = weeklyBonus;
    }

    public int calcWeeklyWage() {
        return super.calcWeeklyWage() + weeklyBonus;
    }
}
