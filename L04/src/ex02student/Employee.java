package ex02student;

public class Employee {
    // The name of the employee.
    private final String name;
    // Whether the employee is a trainee or not.
    private boolean trainee;
    private int age;
    private final String lastname;



    /**
     * Create an employee as a trainee with the given name.
     */
    public Employee(String name,String lastname,int age) {
        this.name = name;
        this.lastname = lastname;
        this.trainee = true;
        this.age = age;
    }

    /**
     * Return the name of the employee.
     */
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return this.age;
    }

    public int getBirthday() {
        return age + 1;
    }

    /**
     * Return the trainee state of the employee.
     */
    public boolean isTrainee() {
        return trainee;
    }

    /**
     * Set the trainee state of the employee.
     */
    public void setTrainee(boolean trainee) {
        this.trainee = trainee;
    }

    /**
     * Return a description of the employee (for test purposes).
     */
    @Override
    public String toString() {
        return name + " (trainee: " + trainee + ")";
    }

    /**
     * Print a description of the employee.
     */
    public void printEmployee() {
        System.out.println("*******************");
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastname);
        System.out.println("Trainee: " + trainee);
        System.out.println("Age: " + age);
        System.out.println("*******************");
    }
}
