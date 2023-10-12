package gui;

import controller.Controller;
import javafx.application.Application;
import model.Festival;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] args) {
        initStorage();

        Application.launch(Gui.class);
    }

    public static void initStorage() {
        Festival northside = Controller.opretFestival("Northside",
                LocalDate.of(2020, 6, 4),
                LocalDate.of(2020, 6, 6));

        Controller.opretFrivillig("Jane Jensen", "12345677", 20);
        Controller.opretFrivillig("Lone Hansen", "78787878", 25);
        Controller.opretFrivillig("Anders Mikkelsen", "55555555", 10);

        Controller.opretFrivilligForening(
                "Christian Madsen", "23232323", 100,
                "Erhversakademi Aarhus", 40);

        LocalDate juni4 = LocalDate.of(2020, 6, 4);
        for (int i = 1; i <= 3; i++) {
            Controller.opretJob("T" + i, "Rengøring af toilet",
                    juni4,
                    100, 5, northside);
        }
        for (int i = 4; i <= 6; i++) {
            Controller.opretJob("T" + i, "Rengøring af toilet",
                    juni4.plus(1, ChronoUnit.DAYS),
                    100, 5, northside);
        }
        for (int i = 7; i <= 9; i++) {
            Controller.opretJob("T" + i, "Rengøring af toilet",
                    juni4.plus(2, ChronoUnit.DAYS),
                    100, 5, northside);
        }
    }
}