package ex2ex3;

import java.util.Scanner;

// Ex02

public class Person {
    private final String name;
    private final int dayOfBirth; // 1..31
    private final int monthOfBirth; // 1..12
    private final int yearOfBirth; // 1900..2010

    public Person(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public void printPerson() {
        System.out.println(name + ", born " + yearOfBirth + "-" + monthOfBirth + "-" + dayOfBirth);
    }

    public int calcAge(int year, int month, int day){
        int age = year - yearOfBirth;
        if (month < monthOfBirth || (month == monthOfBirth && day < dayOfBirth)){
            age--;
        }
        return age;
    }

//Ex03

    public boolean isLeapYear(int year){

        // Den bedre løsning:
        // return year % 400 == 0 || (year % 4 == 0 && year %100 !

        if (year % 400 == 0)
            return true;
        else if (year % 4 == 0 && year % 100 != 0)
            return true;
        else
            return false;
    }
}




