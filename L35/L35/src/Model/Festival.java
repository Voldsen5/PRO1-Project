package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Festival {
    private final String navn;
    private final LocalDate fraDato;
    private final LocalDate tilDato;
    private final ArrayList<Job> jobs = new ArrayList<>();

    public Festival(String navn, LocalDate fraDato, LocalDate tilDato){
        this.navn = navn;
        this.fraDato = fraDato;
        this.tilDato = tilDato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public ArrayList<Job> getJobs() {
        return new ArrayList<>(jobs);
    }

    public Job createJob(String kode, String beskrivelse, LocalDate dato,int timeHonorar, int antalTimer){
        Job job = new Job(kode,beskrivelse,dato,timeHonorar,antalTimer);
        jobs.add(job);
        return job;
    }

    public int budgetteretJobUdgift(){
        int total = 0;
        for (Job e : jobs){
            total += e.calcJobWage();
        }
        return total;
    }

    public int realiseretJobUdgift(){
        int total = 0;
        for (Job e : jobs){

        }
        return total;
    }
}
