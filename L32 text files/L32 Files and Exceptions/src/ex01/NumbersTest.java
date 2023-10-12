package ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumbersTest {
    public static void main(String[] args) {
        File in = new File("L32 text files/L32 Files and Exceptions/src/ex01/Numbers");
        try (Scanner scanner = new Scanner(in)){
            while (scanner.hasNextInt()){
                int d  = scanner.nextInt() * 2;
                System.out.println(d);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
