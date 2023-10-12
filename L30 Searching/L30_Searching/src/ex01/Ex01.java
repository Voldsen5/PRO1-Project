package ex01;

import java.sql.Array;

public class Ex01 {
    public static void main(String[] args) {

        int[] numbers = {2,4,5,6,8};
        int[] numbers1 = {2,4,2,6,8};

        System.out.println(linearUnevenSearch(numbers));
        System.out.println(linearUnevenSearch(numbers1));

    }
    public static boolean linearUnevenSearch(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length) {
            if (arr[i] % 2 != 0) {
                found = true;
            } else i++;
        }
        return found;
    }
}
