package creational.factorymethod.factory;

import creational.factorymethod.eum.ShapeEnum;
import creational.factorymethod.shape.Shape;
import creational.factorymethod.shape.impl.Circle;
import creational.factorymethod.shape.impl.Rectangle;
import creational.factorymethod.shape.impl.Triangle;

public class ShapeFactory {

  public Shape getShape(ShapeEnum shape) {

    if (ShapeEnum.CIRCLE == shape) {
      return new Circle();
    } else if (ShapeEnum.TRIANGLE == shape) {
      return new Triangle();
    } else if (ShapeEnum.RECTANGLE == shape) {
      return new Rectangle();
    }

    return null;
  }
}
