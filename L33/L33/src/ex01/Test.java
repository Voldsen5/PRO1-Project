package ex01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Customer> l1 = new ArrayList<>();
        ArrayList<Customer> l2 = new ArrayList<>();

        Customer c1 = new Customer("Kristoffer", "Enevoldsen");
        Customer c2 = new Customer("Amanda", "Dalsgaard");
        Customer c3 = new Customer("Lars", "Nielsen");

        l1.add(c1);
        l1.add(c2);
        l1.add(c3);

        Customer c4 = new Customer("Ole", "Hansen");
        Customer c5 = new Customer("Peter", "Jørgensen");
        Customer c6 = new Customer("Hans", "Petersen");

        l2.add(c4);
        l2.add(c5);
        l2.add(c6);

        System.out.println(mergeAllCustomers(l1, l2));
    }

    public static ArrayList<Customer> mergeAllCustomers(ArrayList<Customer> l1, ArrayList<Customer> l2) {
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo(l2.get(i2)) <= 0) {
                result.add(l1.get(i1));
                i1++;
            } else {
                result.add(l2.get(i2));
                i2++;
            }
        }
        while (i1 < l1.size()) {
            result.add(l1.get(i1));
            i1++;
        }
        while (i2 < l2.size()) {
            result.add(l2.get(i2));
            i2++;
        }
        return result;
    }
}

