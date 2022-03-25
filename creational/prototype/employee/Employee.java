package creational.prototype.employee;

import java.math.BigDecimal;

public class Employee implements Prototype {

  private String name;
  private String address;
  private BigDecimal salary;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public Employee(String name, String address, BigDecimal salary) {
    this.name = name;
    this.address = address;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [address=" + address + ", name=" + name + ", salary=" + salary + "]";
  }

  @Override
  public Prototype getClone() {
    return new Employee(name, address, salary);
  }
}
