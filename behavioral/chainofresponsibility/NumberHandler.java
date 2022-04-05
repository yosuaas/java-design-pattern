package behavioral.chainofresponsibility;

public abstract class NumberHandler {

  public NumberHandler nextHandler;

  public NumberHandler() {}

  public NumberHandler(NumberHandler numberHandler) {
    this.nextHandler = numberHandler;
  }

  public void setNextHandler(NumberHandler numberHandler) {
    this.nextHandler = numberHandler;
  }

  public void handle(Number number) {
    if (nextHandler != null) {
      this.nextHandler.handle(number);
    }
  }
}
