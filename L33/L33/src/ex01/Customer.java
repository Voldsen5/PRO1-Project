package ex01;

public class Customer implements Comparable<Customer> {
    private final String firstName;
    private final String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int compareTo(Customer c) {
        if (this.lastName.compareTo(c.lastName) > 0) {
            return 1;
        } else if (this.lastName.compareTo(c.lastName) < 0) {
            return -1;
        } else if (this.firstName.compareTo(c.firstName) > 0) {
            return 1;
        } else if (this.firstName.compareTo(c.firstName) < 0) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    //   public int comparetoSmart(Customer c){
 //       if (this.lastName.compareTo(c.lastName) != 0)
 //           return (this.lastName.compareTo(c.lastName));
 //       else return (this.firstName.compareTo(c.firstName));
 //   }
}




// hvis efternavnene på this og anotherstring er forskellige
// så returner sammenligningen af efternavne
// else
// returner sammenligningen af fornavne
