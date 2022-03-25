package creational.factorymethod.shape.impl;

import creational.factorymethod.shape.Shape;

public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("Drawing Circle...");
  }
}
