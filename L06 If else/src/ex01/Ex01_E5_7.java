package ex01;

// E5.7:
// Write a program that reads three numbers and prints “increasing” if they are in increasing order,
// “decreasing” if they are in decreasing order, and “neither” other- wise. Here,
// “increasing” means “strictly increasing”, with each value larger than its predecessor.
// The sequence 3 4 4 would not be considered increasing.

import java.util.Scanner;

public class Ex01_E5_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type 3 Numbers: ");

        int input1 = scan.nextInt();
        int input2 = scan.nextInt();
        int input3 = scan.nextInt();

        if (input1 < input2 && input2 < input3) {
            System.out.println("The Numbers are in increasing order");
        }
        else if (input1 > input2 || input2 > input3) {
            System.out.println("are in decreasing order");
        }
        scan.close();
        }

}
