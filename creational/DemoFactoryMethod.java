package creational;

import creational.factorymethod.eum.ShapeEnum;
import creational.factorymethod.factory.ShapeFactory;
import creational.factorymethod.shape.Shape;

public class DemoFactoryMethod {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape circle = shapeFactory.getShape(ShapeEnum.CIRCLE);
    circle.draw();

    Shape triangle = shapeFactory.getShape(ShapeEnum.TRIANGLE);
    triangle.draw();

    Shape rectangle = shapeFactory.getShape(ShapeEnum.RECTANGLE);
    triangle.draw();
  }
}
