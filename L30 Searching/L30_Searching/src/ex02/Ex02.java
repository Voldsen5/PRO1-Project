package ex02;

public class Ex02 {
    public static void main(String[] args) {
        int[] numbers = {7, 56, 34, 3, 7, 14, 13, 4};
        int[] numbers1 = {7, 56, 34, 3, 7, 4};

        System.out.println(linearRestrictedSearch(numbers));
        System.out.println(linearRestrictedSearch(numbers1));
    }

    public static int linearRestrictedSearch(int[] arr){
        int i = 0;
        while (i < arr.length){
            if (10 <= arr[i] && arr[i] <= 15){
                return arr[i];
            }
            else i++;
        }
        return -1;
    }
}
