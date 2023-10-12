package model;

public class Antal {
    private final int Antal;

    private Funktion funktion;

    Antal(int antal, Funktion funktion) { // OBS: package visible
        this.Antal = antal;
        this.funktion = funktion;
    }

    public int getAntal() {
        return Antal;
    }

    //------------------------------------------------------------------------

    public Funktion getFunktion() {
        return funktion;
    }

    public void setFunktion(Funktion funktion){
        this.funktion = funktion;
    }

    public void removeFunktion(){
        this.funktion = null;
    }
}
