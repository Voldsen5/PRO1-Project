package Model;

public class FrivilligForening extends Frivillig {
    private final String foreningsNavn;
    private final int antalPersoner;

    public FrivilligForening(String navn, String mobil, int maksAntalTimer,String foreningsNavn, int antalPersoner){
        super(navn,mobil,maksAntalTimer);
        this.foreningsNavn = foreningsNavn;
        this.antalPersoner = antalPersoner;
    }

    public String getForeningNavn() {
        return foreningsNavn;
    }

    public int getAntalPersoner() {
        return antalPersoner;
    }
}
