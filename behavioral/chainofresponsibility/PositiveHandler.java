package behavioral.chainofresponsibility;

public class PositiveHandler extends NumberHandler {

  @Override
  public void handle(Number number) {
    if (number.getNumber() > 0) {
      System.out.println("PositiveHandler: " + number.getNumber());
    }
  }
}
