package ex03;

import java.util.Arrays;

public class ArrayTest03 {
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

    public static int[] sumArrays(int[] a, int[] b){
        int[] at = new int[a.length];
        for (int i = 0; i < a.length ; i++) {
            at [i] = a[i] + b[i];
        }
        return at;
    }

    public static void main(String[] args) {

        int[] aq = {10, 20, 30, 40, 50};

        System.out.println("A: " + sum(aq));

        System.out.println();

        double[] bq = {20, 20, 20, 20, 20};

        System.out.println("B: " + sumD(bq));
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(sumArrays(a,b)));
    }
}
