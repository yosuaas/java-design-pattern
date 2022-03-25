package creational.factorymethod.shape.impl;

import creational.factorymethod.shape.Shape;

public class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.println("Drawing Rectangle...");
  }
}
