package creational;

import creational.prototype.animal.Dog;
import creational.prototype.employee.Employee;
import java.math.BigDecimal;

public class DemoPrototype {

  public static void main(String[] args) {

    // Interface
    Employee employee1 = new Employee("Emp 1", "Address 1", new BigDecimal("4000"));
    Employee employee2 = (Employee) employee1.getClone();

    System.out.println(employee1.toString());
    System.out.println(employee2.toString());

    // Abstract class
    Dog dog1 = new Dog("Black", 4);
    Dog dog2 = (Dog) dog1.copy();

    System.out.println(dog1.toString());
    System.out.println(dog2.toString());
  }
}
