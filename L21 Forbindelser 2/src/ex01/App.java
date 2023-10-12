package ex01;

public class App {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Murphy", 32);
        Dog dog2 = new Dog("Eddy", 84);
        Dog dog3 = new Dog("luna", 88);

        Person p1 = new Person("Kristoffer","1906008787","61604171");
        Person p2 = new Person("Oliver", "3107998383","38724563");
        Person p3 = new Person("Rasmus", "1711006363","54783922");

        p1.addDog(dog1);
        p1.addDog(dog2);

        p2.addDog(dog3);

        System.out.println(dog1.getPerson());
        System.out.println(p1.getDogs());

        p1.removeDog(dog1);
        System.out.println();

        System.out.println(dog1.getPerson());
        System.out.println(p1.getDogs());

        p1.addDog(dog1);
        System.out.println();

        for (Dog p : p1.getDogs()){
            System.out.println("Dog name: " + p.getName() + " - Dog nr: " + p.getNumber());
        }



    }
}
