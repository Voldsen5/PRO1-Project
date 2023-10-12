package konto;

public class Konto {
    private int nr;
    private int saldo;
    private String kontoType;
    private String status;

    public Konto(String kontoType, int nr){
        this.kontoType = kontoType;
        this.nr = nr;
        this.saldo = 0;
        this.status = "Åben";
    }

    public int getNr(){
        return nr;
    }
    public int getSaldo(){
        return saldo;
    }
    public String getKontoType(){
        return kontoType;
    }
    public String getStatus(){
        return status;
    }

    public void indsætBeløb(int beløb){
        if(status.equalsIgnoreCase("Åben")){
            saldo += beløb;
        }
        else {
            System.out.println("Kontoen er lukket");}
    }

    public void hævBeløb(int beløb){
        if(status.equalsIgnoreCase("Åben")){
            saldo -= beløb;
        }
        else {
            System.out.println("Kontoen er lukket");
        }
    }

    public void lukKonto(){
        status = "lukket";
    }
}
