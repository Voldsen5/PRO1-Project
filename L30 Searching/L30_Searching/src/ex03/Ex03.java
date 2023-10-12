package ex03;

public class Ex03 {
    public static void main(String[] args) {
        int[] numbers = {7, 9, 13, 7, 9, 13};
        int[] numbers1 = {7, 9, 13, 13, 9, 7};

        int[] numbers2 = {1,2,3,4,4,6,7};
        int[] numbers3 = {7,5,7,5,0,5};

        System.out.println(linearSameAdjacent(numbers));
        System.out.println(linearSameAdjacent(numbers1));

        System.out.println(linearSameAsTarget(numbers2,5));
        System.out.println(linearSameAsTarget(numbers3,0));

        System.out.println(linear3ofAKind(numbers2,4));
        System.out.println(linear3ofAKind(numbers3,5));
    }
    public static boolean linearSameAdjacent(int[] arr){
        boolean found = false;
        int i = 1;
        while (i < arr.length){
        if (arr[i] == arr[i - 1]){
            return !found;
        }
        else i++;
        }
        return found;
    }

    public static boolean linearSameAsTarget(int[] arr, int target){
        int i = 1;
        while (i < arr.length){
            if (arr[i] == arr[i - 1]){
                if (arr[i] == target){
                    return true;
                }
                else i++;
            }
            else i++;
        }
        return false;

    }

    public static boolean linear3ofAKind(int[] arr, int target){
        int count = 0;
        int i = 0;
        while (i < arr.length){
            if (arr[i] == target){
                count++;
                i++;
            }
            else i++;
        }
        if (count == 3){
            return true;
        }
        else return false;
    }
}
