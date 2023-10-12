package controller;

import model.Funktion;
import model.Medarbejder;
import model.Vagt;
import storage.Storage;

import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Controller {

    public static Medarbejder opretMedarbejder(String navn, int antalTimerPrDag, LocalTime typiskMødeTid){
        Medarbejder medarbejder = new Medarbejder(navn,antalTimerPrDag,typiskMødeTid);
        Storage.storeMedarbejder(medarbejder);
        return medarbejder;
    }

    public static Vagt opretVagt(String navn, LocalDateTime tidFra, LocalDateTime tidTil){
        Vagt vagt = new Vagt(navn,tidFra,tidTil);
        Storage.storeVagt(vagt);
        return vagt;
    }

    public static Funktion opretFunktion(String navn){
        Funktion funktion = new Funktion(navn);
        Storage.storeFunktion(funktion);
        return funktion;
    }

    public static void initStorage(){
        Controller.opretFunktion("Filtering");
        Controller.opretFunktion("Grøntsager");
        Controller.opretFunktion("Sovs og Tilbehør");
        Controller.opretFunktion("Buffetopfyldning");

        Controller.opretMedarbejder("Peter",6,LocalTime.parse("8:00"));
        Controller.opretMedarbejder("Anne",8,LocalTime.parse("8:00"));
        Controller.opretMedarbejder("Marie",6, LocalTime.parse("10:00"));
        Controller.opretMedarbejder("Torben",8,LocalTime.parse("7:00"));

        Controller.opretVagt("Røgede ål til medarbejderne",
                LocalDateTime.of(2022,6,24,8,0,0),
                LocalDateTime.of(2022,6,24,12,30,0));
    }

}
