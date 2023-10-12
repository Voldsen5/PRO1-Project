package model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Medarbejder {
    private final String navn;
    private final int antalTimerPrDag;
    private final LocalTime typiskMødetid;

    private final ArrayList<Funktion> funktions = new ArrayList<>();

    private final ArrayList<Vagt> vagts = new ArrayList<>();

    public Medarbejder(String navn, int antalTimerPrDag, LocalTime typiskMødetid) {
        this.navn = navn;
        this.antalTimerPrDag = antalTimerPrDag;
        this.typiskMødetid = typiskMødetid;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntalTimerPrDag() {
        return antalTimerPrDag;
    }

    public LocalTime getTypiskMødetid() {
        return typiskMødetid;
    }

    //----------------------------------------------------------------------------------

    public ArrayList<Funktion> getFunktions(){
        return new ArrayList<>(funktions);
    }

    public void addFunktion(Funktion funktion){
        funktions.add(funktion);
    }

    public void removeFunktion(Funktion funktion){
        funktions.remove(funktion);
    }

    //-----------------------------------------------------------------------------------


    public ArrayList<Vagt> getVagts() {
        return new ArrayList<>(vagts);
    }

    public void addVagt(Vagt vagt){
        vagts.add(vagt);
        vagt.medarbejders.add(this);
    }

    public void removeVagt(Vagt vagt){
        vagts.remove(vagt);
        vagt.medarbejders.remove(this);
    }

    //-------------------------------------------------------------------------------------
}
