package ex01;

import java.util.ArrayList;

public class Ex01 {
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
        bubbleSort(bubble);
        System.out.println(bubble);
    }

    public static void bubbleSort(ArrayList<String> arrayList){
        for (int i = arrayList.size() - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                int k = j + 1;
                if (arrayList.get(j).compareTo(arrayList.get(j+1)) > 0){
                    String temp = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
    }

}
