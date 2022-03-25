package creational.prototype.animal;

public abstract class Animal {

  String color;
  int noOfLegs;

  public Animal(String color, int noOfLegs) {
    this.color = color;
    this.noOfLegs = noOfLegs;
  }

  public abstract Animal copy();
}
