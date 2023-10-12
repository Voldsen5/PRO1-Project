package ex02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> bubble = new ArrayList<>();
        String a = "a";
        String b = "c";
        String c = "b";
        String e = "e";
        String d = "d";

        bubble.add(a);
        bubble.add(b);
        bubble.add(c);
        bubble.add(e);
        bubble.add(d);

        System.out.println(bubble);
        selectionSort(bubble);
        System.out.println(bubble);
    }

    public static void selectionSort(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(j).compareTo(arrayList.get(indexOfMin)) < 0) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                String temp = arrayList.get(i);
                arrayList.set(i, arrayList.get(indexOfMin));
                arrayList.set(indexOfMin, temp);
            }
        }
    }
}
