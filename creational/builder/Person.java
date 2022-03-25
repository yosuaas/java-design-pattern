package creational.builder;

import java.util.Date;

/** Person */
public class Person {

  private String firstName;
  private String lastName;
  private String address;
  private String phoneNumber;
  private Date birthDate;

  //   Getter & Setter
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  // Another way to use builder
  public static Builder builder() {
    return new Builder();
  }

  // Constructor
  public Person() {}

  public Person(
      String firstName, String lastName, String address, String phoneNumber, Date birthDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.birthDate = birthDate;
  }

  public Person(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.address = builder.address;
    this.phoneNumber = builder.phoneNumber;
    this.birthDate = builder.birthDate;
  }

  @Override
  public String toString() {
    return "Person [address="
        + address
        + ", birthDate="
        + birthDate
        + ", firstName="
        + firstName
        + ", lastName="
        + lastName
        + ", phoneNumber="
        + phoneNumber
        + "]";
  }

  public static class Builder {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private Date birthDate;

    public Builder() {}

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public Builder birthDate(Date birthDate) {
      this.birthDate = birthDate;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }
}
