package ex01Cars;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("Citroen C1", "Black", "CV 53.143");
        System.out.println(myCar.getBrand() + ", " + myCar.getColor());
        System.out.println(myCar.getKm());
        System.out.println();

        myCar.setKm(5000);
        System.out.println(myCar.getKm());

        Car myCar01 = new Car("Tesla Model S","Red","KO 69.420" );
        myCar01.setKm(200369);
        System.out.println("********************");
        System.out.println("*" + myCar01.getBrand() + ", " + myCar01.getColor());
        System.out.println("*" + myCar01.getRegistrationNumber());
        System.out.println("*" + "Km:" +  myCar01.getKm());
        System.out.println("********************");
    }
}
