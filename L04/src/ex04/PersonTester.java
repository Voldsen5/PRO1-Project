package ex04;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person("Kristoffer Enevoldsen", "Birkevej 18", 30000);
        System.out.println(person1.getName());
        System.out.println(person1.getAddress());
        System.out.println(person1.getMonthlySalary());

        person1.printPerson();
    }
}
