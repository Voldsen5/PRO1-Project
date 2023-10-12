package ex04;

public class Person {
    private final String name;
    private String address;
    private int monthlySalary;

    public Person(String name,String address,int monthlySalary) {
        this.name = name;
        this.address = address;
        this.monthlySalary = monthlySalary;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getMonthlySalary(){
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public double YearlySalary(){
        return monthlySalary * 12 * 1.025;
    }

    public void printPerson(){
        System.out.println("*************************************");
        System.out.println("* Name: " + name + "       *");
        System.out.println("* Adress: " + address + "               *");
        System.out.println("* Monthly Salery: " + monthlySalary + "             *");
        System.out.println("* Yearly Salery: " + YearlySalary() + " *");
        System.out.println("*************************************");
    }
}
