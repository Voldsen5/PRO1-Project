package ex01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList hunde = new ArrayList<>();

        Hund d1 = new Hund("Murphy", false, 3500, Race.Puddel);
        Hund d2 = new Hund("Eddie", true, 5500,Race.Terrier);
        Hund d3 = new Hund("Jackie", true,7300,Race.Bokser);
        Hund d4 = new Hund("Lars", false, 8500,Race.Bokser);
        Hund d5 = new Hund("Kurt",false, 5000, Race.Terrier);

        hunde.add(d1);
        hunde.add(d2);
        hunde.add(d3);
        hunde.add(d4);
        hunde.add(d5);

        System.out.println(samletPris(hunde, Race.Terrier));
    }

    public static int samletPris(ArrayList<Hund> hunde, Race race){
        int pris = 0;
        for (Hund h : hunde){
            if (race == h.getRace()){
            pris += h.getPris();
            }
        }
        return pris;
    }
}
