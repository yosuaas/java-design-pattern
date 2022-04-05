package behavioral;

import behavioral.chainofresponsibility.NegativeHandler;
import behavioral.chainofresponsibility.Number;
import behavioral.chainofresponsibility.NumberChain;
import behavioral.chainofresponsibility.PositiveHandler;
import behavioral.chainofresponsibility.ZeroHandler;

public class DemoChainOfResponsibility {
  public static void main(String[] args) {

    Number negativeNumber = new Number(-100);
    Number zeroNumber = new Number(0);
    Number positiveNumber = new Number(30);

    // Example One
    System.out.println("===== Example 1 =====");
    NumberChain numberChain = new NumberChain();

    numberChain.handle(negativeNumber);
    numberChain.handle(positiveNumber);
    numberChain.handle(zeroNumber);

    // Example Two
    System.out.println("\n\n===== Example 2 =====");
    NegativeHandler negativeHandler = new NegativeHandler();
    ZeroHandler zeroHandler = new ZeroHandler();
    PositiveHandler positiveHandler = new PositiveHandler();

    negativeHandler.setNextHandler(zeroHandler);
    zeroHandler.setNextHandler(positiveHandler);

    negativeHandler.handle(negativeNumber);
    negativeHandler.handle(positiveNumber);
    negativeHandler.handle(zeroNumber);
  }
}
