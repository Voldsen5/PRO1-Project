package storage;

import Model.Festival;
import Model.Frivillig;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Festival> festivals = new ArrayList<>();
    private static final ArrayList<Frivillig> frivilligs = new ArrayList<>();

    public static void storeFestival(Festival festival) {
        festivals.add(festival);
    }
    public static void storeFrivillig(Frivillig frivillig){frivilligs.add(frivillig);}

    public static ArrayList<Festival> getFestivals() {
        return new ArrayList<>(festivals);
    }
    public static ArrayList<Frivillig> getFrivilligs(){return new ArrayList<>(frivilligs);}

}
