package ex3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Mechanic m1 = new Mechanic("Claus","Birkevej",2010,140);
        Mechanic m2 = new Mechanic("Ole","Byvej",2011,145);
        Foreman f1 = new Foreman("Karsten","pilevej", 140,2012,1000);
        Foreman f2 = new Foreman("Egon", "Hedehusvej",150,2013,500);
        Mechanic m3 = new Mechanic("Lars", "Randersvej",2014,120);
        Survoyer s1 = new Survoyer("Kurt","Viborgvej",2002,140,25);
        WorkingBoy w1 = new WorkingBoy("Kris","Bøgevej",120);

        employees.add(m1);
        employees.add(m2);
        employees.add(f1);
        employees.add(f2);
        employees.add(m3);
        employees.add(s1);
        employees.add(w1);


        System.out.println(m1.getName() + "'s Løn: " + m1.calcWeeklyWage());
        System.out.println(m2.getName() + "'s Løn: " + m2.calcWeeklyWage());
        System.out.println(f1.getName() + "'s Løn: " + f1.calcWeeklyWage());
        System.out.println(f2.getName() + "'s Løn: " + f2.calcWeeklyWage());
        System.out.println(m3.getName() + "'s Løn: " + m3.calcWeeklyWage());
        System.out.println(s1.getName() + "'s Løn: " + s1.calcWeeklyWage());
        System.out.println();

        System.out.println("Samlet løn: " + totalWeeklySalary(employees));
        System.out.println();

        printWeeklyWages(employees);
        }



    public static double totalWeeklySalary(ArrayList<Employee> list){
        int total = 0;
        for (Employee m : list){
            total += m.calcWeeklyWage();
        }
        return total;

    }

    public static void printWeeklyWages(ArrayList<Employee> list){
        for (Employee m : list){
            System.out.println(m.getName() + "'s ugentlig Løn: " + m.calcWeeklyWage());
        }
    }
}
