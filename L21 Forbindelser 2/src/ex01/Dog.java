package ex01;

public class Dog {

    Person person;

    private String name;
    private final int number;

    public Dog(String name, int number){
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Person getPerson(){
        return person;
    }

//--------------------------------------------------------

    @Override
    public String toString(){
        return name;
    }


}
