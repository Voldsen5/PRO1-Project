package ex03;

public class Customer {
    private final String name;
    private final int age;
    private int money;

    public Customer(String name, int age, int money){
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMoney() {
        return money;
    }

    public int compareTo(Customer customer){
       if (money > customer.getMoney())
           return -1;
       else if (money < customer.getMoney()) {
           return 1;
       }
       else return 0;
    }
}
