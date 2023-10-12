package ex01;

import java.util.ArrayList;

public class Person {

    private String name;
    private final String cpr;
    private String phone;

    private final ArrayList<Dog> dogs = new ArrayList<>();

    public Person(String name, String cpr, String phone){
        this.name = name;
        this.cpr = cpr;
        this.phone = phone;
    }

    public String getCpr() {
        return cpr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void addDog(Dog dog){
        dogs.add(dog);
        dog.person = this;
    }

    public void removeDog(Dog dog){
        dogs.remove(dog);
        dog.person = null;
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    //-----------------------------------------------------------------

    @Override
    public String toString(){
        return name;
    }
}
