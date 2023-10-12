package ex01;

public class BankAccount {
    private double balance;
    private static int id;

    /**
     */
    public BankAccount(double balance, int id){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
}
