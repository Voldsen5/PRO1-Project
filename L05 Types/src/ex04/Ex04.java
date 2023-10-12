package ex04;

public class Ex04 {
    public static void main(String[] args) {
   Name name1 = new Name("Kristoffer", "Wulff", "Enevoldsen");
   Name name2 = new Name("Lars", "Jensen");

        System.out.println(name2.getFullName());

        System.out.println(name1.getFullName());
        System.out.println("Username" + " = " + name1.getUsername());
    }
}
