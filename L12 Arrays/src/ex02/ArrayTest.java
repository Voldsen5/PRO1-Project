package ex02;

public class ArrayTest {
    public static int sum(int[] t) {
        int sum = 0;
        for (int element : t){
            sum += element;
        }
        return sum;
    }

    public static double sumD(double[] t) {
        double sumD = 0;
        for (double element : t){
            sumD += element;
        }
        return sumD;
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        System.out.println("A: " + sum(a));

        System.out.println();

        double[] b = {20, 20, 20, 20, 20};

        System.out.println("B: " + sumD(b));
    }
}
