package controller;

import Model.Festival;
import Model.Frivillig;
import Model.FrivilligForening;
import storage.Storage;

import java.time.LocalDate;

public class Controller {
    public static Festival createFestival(String navn, LocalDate fradato, LocalDate tildato){
        Festival festival = new Festival(navn,fradato,tildato);
        Storage.storeFestival(festival);
        return festival;
    }

    public static Frivillig createFrivillig(String navn, String mobil, int maksAntalTimer){
        Frivillig frivillig = new Frivillig(navn,mobil,maksAntalTimer);
        Storage.storeFrivillig(frivillig);
        return frivillig;
    }

    public static FrivilligForening createFrivilligforening(String navn, String mobil, int maksAntalTimer, String foreningsNavn, int antalPersoner){
        FrivilligForening frivilligForening = new FrivilligForening(navn,mobil,maksAntalTimer,foreningsNavn,antalPersoner);
        Storage.storeFrivillig(frivilligForening);
        return frivilligForening;
    }
}
