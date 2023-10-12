package ex01;

public class Hund {
    private String navn;
    private boolean stamtavle;
    private int pris;
    private Race race;

    public Hund(String navn, boolean stamtavle, int pris, Race race){
        this.navn = navn;
        this.stamtavle = stamtavle;
        this.pris = pris;
        this.race = race;
    }

    public int getPris() {
        return pris;
    }

    public Race getRace() {
        return race;
    }
}
