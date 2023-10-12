package ex01;

public class App {
    public static void main(String[] args) {

        Chilli[] chilies = {
                new Chilli("Banana Pepper", 1000),
                new Chilli("Cayenne pepper", 45000),
                new Chilli("Habanero chili", 150000),
                new Chilli("Red savina habenero", 500000),
                new Chilli("Carolina reaper", 2000000),
        };

        Beer[] beers = {
                new Beer("Tuborg classic",4.6),
                new Beer("Royal export", 5.4),
                new Beer("Hancock øko humle",5.8),
                new Beer("Corona",4.5),
                new Beer("Royal classic", 4.6)
        };

        System.out.println(average(chilies));
        System.out.println(max(chilies));

        System.out.printf("%.2f", average(beers));
        System.out.println();
        System.out.println(max(beers));

        Mesurable blackFridayMeal[] = blackFridayMeal(chilies,beers);
        System.out.println(blackFridayMeal.toString());
    }

    public static double average(Mesurable[] objects) {
        double average = 0.0;
        for (Mesurable s : objects){
            average += s.getMeasure();
        }
        return average / objects.length;
    }

    public static Mesurable max(Mesurable[] objects){
        Mesurable max = objects[0];
        for (Mesurable s : objects){
            if (s.getMeasure() > max.getMeasure()){
                max = s;
            }
        }
        return max;
    }

    public static Mesurable[] blackFridayMeal(Mesurable[] chilies, Mesurable[] beers){
        Mesurable maxChili = max(chilies);
        Mesurable maxBeer = max(beers);
        Mesurable[] blackFridayMeal = {maxBeer,maxChili};
                return blackFridayMeal;
    }
}
