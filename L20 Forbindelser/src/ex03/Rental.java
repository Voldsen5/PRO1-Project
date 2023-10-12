package ex03;

public class Rental {
    private final int no;
    private final String date;
    private int days;


    public Rental(int no, String date, int days){
        this.no = no;
        this.date = date;
        this.days = days;
    }

    public int getNo() {
        return no;
    }

    public String getDate() {
        return date;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public int getPrice(){
        int price = 0;
        price = car.getPricePerDay() * getDays();
        return price;
    }

    //----------------------------------------------------------------------

    private Car car;

    public Car getCar(){
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void removeCar(){
        this.car = null;
    }
}
