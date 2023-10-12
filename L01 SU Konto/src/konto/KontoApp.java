package konto;

public class KontoApp {
    public static void main(String[] args) {
        Konto konto = new Konto("Mastercard",2212);
        System.out.println(konto.getKontoType());
        System.out.println(konto.getNr());
        konto.indsætBeløb(1000);
        System.out.println(konto.getSaldo());
        konto.indsætBeløb(4000);
        System.out.println(konto.getSaldo());
        konto.lukKonto();
        konto.indsætBeløb(4000);
        System.out.println(konto.getSaldo());
    }
}
