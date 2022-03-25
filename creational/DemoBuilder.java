package creational;

import creational.builder.Person;
import java.util.Date;

public class DemoBuilder {
  public static void main(String[] args) {
    Person person1 =
        new Person.Builder()
            .firstName("Yosh")
            .lastName("Set")
            .phoneNumber("0821")
            .address("Jl. ABC 123")
            .birthDate(new Date(1999, 2, 8))
            .build();

    Person person2 =
        Person.builder()
            .firstName("Yosh2")
            .lastName("Set2")
            .phoneNumber("0822")
            .address("Jl. DEF 456")
            .birthDate(new Date(1999, 2, 8))
            .build();

    System.out.println(person1.toString());
    System.out.println(person2.toString());
  }
}
