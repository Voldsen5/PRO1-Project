package ex02student;

public class EmployeeApp {

    public static void main(String[] args) {
 //       Employee e1 = new Employee("Hans Jensen");
  //      System.out.println("Name: " + e1.getName());
   //     System.out.println("Trainee? " + e1.isTrainee());
     //   System.out.println();

//        e1.setTrainee(true);
//        e1.printEmployee();
 //       System.out.println();


        Employee e2 = new Employee("Kristoffer", "Enevoldsen", 21);
        e2.setTrainee(false);
        System.out.println("******************");
        System.out.println("Name: " + e2.getName());
        System.out.println("Trainee: " + e2.isTrainee());
        System.out.println("age: " + e2.getAge());
        System.out.println("Birthday: " + e2.getBirthday());
        System.out.println("******************");

        e2.printEmployee();


    }
}
