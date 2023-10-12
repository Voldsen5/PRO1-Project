package spiller;

public class Spiller {
    private String navn;
    private int Alder;
    private String position;
    private String hold;

    public Spiller(String navn, int alder, String position, String hold){
        this.navn = navn;
        this.Alder = alder;
        this.position = position;
        this.hold = hold;
    }

    public String getNavn() {
        return navn;
    }
    public int getAlder(){
        return Alder;
    }
    public String getPosition(){
        return position;
    }
    public String getHold() {
        return hold;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    public void setAlder(int alder) {
        Alder = alder;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setHold(String hold) {
        this.hold = hold;
    }
}
