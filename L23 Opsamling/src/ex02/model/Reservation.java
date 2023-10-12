package ex02.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reservation {
    private LocalDateTime start;
    private LocalDateTime slut;
    private ArrayList<Plads> pladser = new ArrayList<>();

    public Reservation (LocalDateTime start, LocalDateTime slut){
        this.start = start;
        this.slut = slut;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getSlut() {
        return slut;
    }

    public ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    public void addPladser(Plads plads){
        pladser.add(plads);
        plads.reservationer.add(this);
    }

    public void removePladser(Plads plads){
        pladser.remove(plads);
        plads.reservationer.remove(this);
    }
}
