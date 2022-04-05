package behavioral.chainofresponsibility;

public class NegativeHandler extends NumberHandler {

  public NegativeHandler() {}

  public NegativeHandler(NumberHandler numberHandler) {
    super(numberHandler);
  }

  @Override
  public void handle(Number number) {

    if (number.getNumber() < 0) {
      System.out.println("NegativeHandler: " + number.getNumber());
    } else {
      nextHandler.handle(number);
    }
  }
}
