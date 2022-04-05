package behavioral.chainofresponsibility;

public class ZeroHandler extends NumberHandler {

  public ZeroHandler() {}

  public ZeroHandler(NumberHandler numberHandler) {
    super(numberHandler);
  }

  @Override
  public void handle(Number number) {
    if (number.getNumber() == 0) {
      System.out.println("ZeroHandler: " + number.getNumber());
    } else {
      nextHandler.handle(number);
    }
  }
}
