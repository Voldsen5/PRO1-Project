package ex01;

// E5.1:
// Write a program that reads an integer and prints whether it is negative, zero, or positive.

import java.util.Scanner;

public class Ex01_E5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write an integer here:");
        int antal = scan.nextInt();

        if (antal > 0){
            System.out.println("Positiv");
        }
        else if (antal == 0){
            System.out.println("Zero");
        }
        else if (antal < 0){
            System.out.println("Negativ");
        }
        scan.close();
    }
}
