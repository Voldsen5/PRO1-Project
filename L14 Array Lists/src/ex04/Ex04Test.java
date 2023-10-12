package ex04;

import java.util.ArrayList;

public class Ex04Test {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);

        System.out.println(ints);

        switcherRoo(ints);

        System.out.println(ints);

    }

    public static void switcherRoo(ArrayList<Integer> list){
 //       int firstNumber = list.get(list.lastIndexOf() - 1);
  //      list.set(0, list.get(list.size()) - 1);
 //       list.set(list.size() - 1, firstNumber);
    }
}
