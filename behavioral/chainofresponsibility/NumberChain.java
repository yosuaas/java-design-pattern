package behavioral.chainofresponsibility;

public class NumberChain {

  private NumberHandler numberHandler;

  public NumberChain() {
    this.buildChain();
  }

  private void buildChain() {
    numberHandler = new NegativeHandler(new ZeroHandler(new PositiveHandler()));
  }

  public void handle(Number number) {
    numberHandler.handle(number);
  }
}
