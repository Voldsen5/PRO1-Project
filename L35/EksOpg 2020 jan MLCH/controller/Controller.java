package controller;

import model.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

// S5 (6 p)
public abstract class Controller {

    public static Festival opretFestival(String navn, LocalDate fraDato, LocalDate tilDato) {
        Festival festival = new Festival(navn, fraDato, tilDato);
        Storage.storeFestival(festival);
        return festival;
    }

    public static Frivillig opretFrivillig(String name, String mobil, int maksAntalTimer) {
        Frivillig frivillig = new Frivillig(name, mobil, maksAntalTimer);
        Storage.storeFrivillig(frivillig);
        return frivillig;
    }

    public static FrivilligForening opretFrivilligForening(
            String navn, String mobil, int maksAntalTimer,
            String foreningsNavn, int antalFrivillige) {
        FrivilligForening frivilligForening = new FrivilligForening(
                navn, mobil, maksAntalTimer,
                foreningsNavn, antalFrivillige);
        Storage.storeFrivillig(frivilligForening);
        return frivilligForening;
    }

    public static Job opretJob(
            String kode, String beskrivelse, LocalDate dato,
            int timeHonorar, int antalTimer, Festival festival) {
        return festival.opretJob(kode, beskrivelse, dato, timeHonorar, antalTimer);
    }

    //-------------------------------------------------------------------------

    // S7 (6 p)
    public static Vagt tagVagt(Job job, Frivillig frivillig, int timer) {
        if (frivillig.ledigeTimer() < timer || job.ikkeBesatteTimer() < timer) {
            throw new RuntimeException("Vagten kan ikke oprettes med timetallet: " + timer);
        }

        return job.opretVagt(timer, frivillig);
    }

    //-------------------------------------------------------------------------

    // S9 (7 p)
    public static boolean findFrivillig(Festival festival, String navn) {
        ArrayList<String> liste = festival.gaverTilFrivillige();
        int left = 0;
        int right = liste.size() - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            String s = liste.get(middle);
            String t = s.substring(0, navn.length());
            if (t.compareTo(navn) == 0) {
                return true;
            } else if (t.compareTo(navn) < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }
}
