package ex03;

import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";

        // A)
        System.out.println(ord1.toUpperCase());

        // B)
        System.out.println(ord2.toLowerCase());

        // C)
        System.out.println(ord1  + " " + ord2);

        // D)
        String ord3 = ord1 + ord2.toLowerCase();

        // E)
        System.out.println(ord3);

        // F)
        System.out.println(ord1.substring(0, 7));

        // G)
        System.out.println(ord2.substring(3, 8));

        // H)
        System.out.println(ord3.substring(ord3.length() / 2));
    }
}
