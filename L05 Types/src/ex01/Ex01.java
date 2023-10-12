package ex01;

public class Ex01 {
    public static void main(String[] args) {

        int i1, i2, a = 4, b = 11, c;
        double d1, d2, r = 4.0, s = 11.0;

        i1 = b / a; //= 2
        System.out.println(i1);

        c = (int)(s / r); //= 2
        System.out.println(c);

        d1 = b / a; //= 2,0
        System.out.println(d1);

        d2 = s / r; //= 2,75
        System.out.println(d2);

        d1 = b / r; //= 2,75
        System.out.println(d1);

        d2 = 11.0 / 4.0; //2,75
        System.out.println(d2);

        d1 = 11.0 / a * c; // 5,5
        System.out.println(d1);

        i1++; //= 1
        System.out.println(i1);

        i1 += 4; //= 7
        System.out.println(i1);

        i1 = b % a; //= 3
        System.out.println(i1);

        i1 = 3 + 7 * 2; //= 17
        System.out.println(i1);

        i2 = (3 + 7) * 2; //= 20
        System.out.println(i2);



    }
}
