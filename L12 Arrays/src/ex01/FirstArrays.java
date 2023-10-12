package ex01;

import java.util.Arrays;

public class FirstArrays {
    public static void main(String[] args) {

        //Exercise 1 A:

        System.out.println();

        int[] a = new int[10];

        System.out.println("A: " + Arrays.toString(a));
        System.out.println();

        // B

        int[] b = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};

        System.out.println("B: " + Arrays.toString(b));
        System.out.println();

        // C

        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = i;
        }
        System.out.println("C: " + Arrays.toString(c));
        System.out.println();

        // D

        int[] d = new int[10];
        for (int i = 0; i < d.length; i++) {
            d[i] = (i + 1) * 2;
        }
        System.out.println("D: " + Arrays.toString(d));
        System.out.println();

        // E

        int[] e = new int[10];
        for (int i = 0; i < e.length; i++) {
            e[i] = (i + 1) * (i + 1);
        }
        System.out.println("E: " + Arrays.toString(e));
        System.out.println();

        // F

        int[] f = new int[10];
        for (int i = 0; i < f.length; i++) {
            f[i] = i % 2;
        }
        System.out.println("F: " + Arrays.toString(f));
        System.out.println();

        // G

        int[] g = new int[10];
        for (int i = 0; i < g.length; i++) {
            g[i] = i % 5;
        }
        System.out.println("G: " + Arrays.toString(g));
        System.out.println();

        // H

        int[] h = new int[10];
        for (int i = 0; i < g.length; i++){
            h[i] = 2 * i + i % 2;
        }
        System.out.println("H: " + Arrays.toString(h));
        System.out.println();
     }
}

