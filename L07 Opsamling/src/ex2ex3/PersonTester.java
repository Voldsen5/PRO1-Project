package ex2ex3;

public class PersonTester {

    public static void main(String[] args) {
        // Ex. 2
        ex2ex3.Person p1 = new Person("Ib", 2000, 10, 6);
        p1.printPerson();

        p1.calcAge(2022, 2, 24);

        System.out.println(p1.calcAge(2022, 2, 24));



    }
}
