package Model;

import java.util.ArrayList;

public class Frivillig {
    private final String navn;
    private final String mobil;
    private final int maksAntalTimer;
    private final ArrayList<Vagt> vagts = new ArrayList<>();

    public Frivillig(String navn,String mobil, int maksAntalTimer){
        this.navn = navn;
        this.mobil = mobil;
        this.maksAntalTimer = maksAntalTimer;
    }

    public ArrayList<Vagt> getVagts() {
        return new ArrayList<>(vagts);
    }

    public void addVagt(Vagt vagt){
        vagts.add(vagt);
        vagt.frivilligs.add(this);
    }

    public void removeVagt(Vagt vagt){
        vagts.remove(vagt);
        vagt.frivillig = null;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public int getMaksAntalTimer() {
        return maksAntalTimer;
    }



 //   public int ledigeTid(Frivillig frivillig){
  //      int timer = 0;
  //      timer = frivillig.maksAntalTimer -
  //  }
}
