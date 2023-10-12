package ex02.model;

import java.util.ArrayList;

public class Arrangement {
    private String name;
    private boolean offentlig;
    private final ArrayList<Reservation> reservationer = new ArrayList<>();

    public Arrangement(String name, boolean offentlig){
        this.name = name;
        this.offentlig = offentlig;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Reservation> getReservation() {
        return reservationer;
    }

    public void addReservation(Reservation reservation) {
        reservationer.add(reservation);
    }

    public void removeReservation(Reservation reservation){
        reservationer.remove(reservation);
    }

    public int antalReserverdePladser(){
        int rP = 0;
        for (Reservation r : reservationer){
            rP += r.getPladser().size();
       }
        return rP;
   }
}
