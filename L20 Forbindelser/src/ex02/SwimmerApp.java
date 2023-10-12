package ex02;

import java.util.ArrayList;
import java.util.List;



public class SwimmerApp {

    public static void main(String[] args) {
        ArrayList<Double> lapTimesJan = new ArrayList<>();
        lapTimesJan.addAll(List.of(1.02, 1.01, 0.99, 0.98, 1.02, 1.04, 0.99));

        Swimmer jan = new Swimmer("Jan", lapTimesJan);

        ArrayList<Double> lapTimesBo = new ArrayList<>();
        lapTimesBo.addAll(List.of(1.05, 1.01, 1.04, 1.06, 1.08, 1.04, 1.02));

        Swimmer bo = new Swimmer("Bo", lapTimesBo);

        ArrayList<Double> lapTimesMikkel = new ArrayList<>();
        lapTimesMikkel.addAll(List.of(1.03, 1.01, 1.02, 1.05, 1.03, 1.06, 1.03));

        Swimmer mikkel = new Swimmer("Mikkel", lapTimesMikkel);

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(jan);
        swimmers.add(bo);
        swimmers.add(mikkel);

        for (Swimmer s : swimmers) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime());
        }
        System.out.println();

        TrainingPlan p1 = new TrainingPlan('A',13,10);
        TrainingPlan p2 = new TrainingPlan('B',10,7);

        p1.addSwimmer(jan);

        p2.addSwimmer(bo);
        p2.addSwimmer(mikkel);

        for (Swimmer q : p1.getSwimmers()){
            System.out.println(q.getName() + "'s bedstetid: " + q.bestLapTime());
        }
        System.out.println();

        for (Swimmer q : p2.getSwimmers()){
            System.out.println(q.getName() + "'s bedstetid: " + q.bestLapTime());
        }
        System.out.println();

        p2.removeSwimmer(mikkel);

        for (Swimmer q : p2.getSwimmers()){
            System.out.println(q.getName() + "'s bedstetid: " + q.bestLapTime());
        }
        System.out.println();

        p2.addSwimmer(mikkel);

        for (Swimmer q : p1.getSwimmers()){
            System.out.println(q.getName() + "'s samlet træningstid: " + p1.getHoursTrained() );
        }

        for (Swimmer q : p2.getSwimmers()){
            System.out.println(q.getName() + "'s samlet træningstid: " + p2.getHoursTrained() );
        }
        System.out.println();

        int sT = 0;

        for (Swimmer s : p1.getSwimmers()) {
            sT += p1.getHoursTrained();
        }

        for (Swimmer s : p2.getSwimmers()){
            sT += p2.getHoursTrained();
        }
        System.out.println("Samlet træningstid for alle svømmer: " + sT);



    }
}
