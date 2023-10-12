package ex03;

public class App {
    public static void main(String[] args) {

        Car c1 = new Car("CA20475","2010",350);
        Car c2 = new Car("CK20420", "2013", 220);
        Car c3 = new Car("KK29316","2015", 400);

        Rental r1 = new Rental(02,"02/11-2022",5);
        Rental r2 = new Rental(03,"02/11-2022",6);
        Rental r3 = new Rental(05,"02/11-2022",7);


        r1.setCar(c1);
        r2.setCar(c2);
        r3.setCar(c3);

        System.out.println("Prisen for bil: " + r1.getCar().getNo()  + " Er: " + r1.getPrice() + "Kr");
        System.out.println("Prisen for bil: " + r2.getCar().getNo()  + " Er: " + r2.getPrice() + "Kr");
        System.out.println("Prisen for bil: " + r3.getCar().getNo()  + " Er: " + r3.getPrice() + "Kr");



    }
}
