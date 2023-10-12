package model;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;


public class Vagt {
    private final String navn;
    private final LocalDateTime tidFra;
    private final LocalDateTime tidTil;

    private final ArrayList<Antal> antals = new ArrayList<>();

    final ArrayList<Medarbejder> medarbejders = new ArrayList<>();

    public Vagt(String navn, LocalDateTime tidFra, LocalDateTime tidTil){
        this.navn = navn;
        this.tidFra = tidFra;
        this.tidTil = tidTil;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDateTime getTidFra() {
        return tidFra;
    }

    public LocalDateTime getTidTil() {
        return tidTil;
    }

    //----------------------------------------------------------------------------------


    public ArrayList<Antal> getAntals() {
        return new ArrayList<>(antals);
    }

    public Antal createAntal(int antal, Funktion funktion){
        Antal antal1 = new Antal(antal, funktion);
        antals.add(antal1);
        return antal1;
    }

    //-----------------------------------------------------------------------------------

    public ArrayList<Medarbejder> getMedarbejders(){
        return new ArrayList<Medarbejder>(medarbejders);
    }

    //-----------------------------------------------------------------------------------

    public Medarbejder findMedarbejder(LocalTime tidspunkt, int antaltimer){
        for (int i = 0; i <= medarbejders.size(); i++){
            if(medarbejders.get(i).getTypiskMødetid() == tidspunkt){
                if (medarbejders.get(i).getAntalTimerPrDag() <= antaltimer){
                    return medarbejders.get(i);
                }
                else return null;
            }
            else return null;
        }
        return null;
    }

    //------------------------------------------------------------------------------------

    public int beregnTimeForbrug(){
        int vagt = tidTil.getHour() - tidFra.getHour();
        return medarbejders.size() * vagt;
    }

    //------------------------------------------------------------------------------------

    public int antalMedarbejderMedFunktion(Funktion funktion){
        int antal = 0;
        for (int i = 0; i <= medarbejders.size(); i++){
            if (medarbejders.get(i).getFunktions().equals(funktion)){
                antal++;
            }
        }
        return antal;
    }

    //-------------------------------------------------------------------------------------

    public Medarbejder[] skalAdviseresOmMødetid(){
        Medarbejder[] a = medarbejders.toArray(new Medarbejder[0]);
        for (int i = 0; i <= medarbejders.size(); i++) {
            if (medarbejders.get(i).getTypiskMødetid().isAfter(LocalTime.from(LocalDateTime.of(tidFra.toLocalDate(),tidFra.toLocalTime())))){
                a[i] = medarbejders.get(i);
            }
            else i++;
        }
        return a;
    }

    //--------------------------------------------------------------------------------------
    public  String status(){
 //       while()

            return "Manglende resourcer";
    }

}
