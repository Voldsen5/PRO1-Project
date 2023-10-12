package ex02.model;

import java.util.ArrayList;

public class Plads {
    private int nr;
    Omraade omraade;
    final ArrayList<Reservation> reservationer = new ArrayList<>();

    public Plads(int nr, Omraade omraade){
        this.nr = nr;
        this.omraade = omraade;
    }

    public int getNr() {
        return nr;
    }

    public Omraade getOmraade() {
        return omraade;
    }

    public ArrayList<Reservation> getReservationer() {
        return new ArrayList<Reservation>(reservationer);
    }
}
