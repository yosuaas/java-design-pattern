package creational.prototype.animal;

public class Dog extends Animal {

  public Dog(String color, int noOfLegs) {
    super(color, noOfLegs);
  }

  @Override
  public String toString() {
    return "Dog [color=" + this.color + ", noOfLegs=" + this.noOfLegs + "]";
  }

  @Override
  public Animal copy() {
    return new Dog(this.color, this.noOfLegs);
  }
}
