package ex02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersMain {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        File in = new File("L32 text files/L32 Files and Exceptions/src/ex02/Numbers");
        try (Scanner scanner = new Scanner(in)){
            while (scanner.hasNextInt()){
                numbers.add(scanner.nextInt());
            }
            for(int i = numbers.size() - 1; i > -1; i--){
                System.out.println(numbers.get(i));}
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


