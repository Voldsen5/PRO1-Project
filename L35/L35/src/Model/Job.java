package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Job {
    private final String kode;
    private final String beskrivelse;
    private final LocalDate dato;
    private final int timeHonorar;
    private final int antalTimer;
    private final ArrayList<Vagt> vagts = new ArrayList<>();

    public Job(String kode, String beskrivelse, LocalDate dato,int timeHonorar, int antalTimer){ // OBS: package Visible
        this.kode = kode;
        this.beskrivelse = beskrivelse;
        this.dato = dato;
        this.timeHonorar = timeHonorar;
        this.antalTimer = antalTimer;
    }

    public ArrayList<Vagt> getVagt(){
        return new ArrayList<>(vagts);
    }

    public Vagt createVagt(int timer, Frivillig frivillig){
        Vagt vagt = new Vagt(timer, frivillig);
        vagts.add(vagt);
        vagt.job = this;
        return vagt;
    }

    public String getKode() {
        return kode;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public LocalDate getDato() {
        return dato;
    }

    public int getTimeHonorar() {
        return timeHonorar;
    }

    public int getAntalTimer() {
        return antalTimer;
    }

    public int calcJobWage(){
        int wage = 0;
        wage += timeHonorar * antalTimer;
        return wage;
    }


}
