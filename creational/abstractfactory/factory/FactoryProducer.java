package creational.abstractfactory.factory;

public class FactoryProducer {
  private static final String BANK = "Bank";
  private static final String ACCOUNT = "Account";
  private static final String LOAN = "Loan";

  public static AbstractFactory getFactory(String type) {
    if (ACCOUNT.equalsIgnoreCase(type)) {
      return new AccountFactory();
    } else if (BANK.equalsIgnoreCase(type)) {
      return new BankFactory();
    } else if (LOAN.equalsIgnoreCase(type)) {
      return new LoanFactory();
    }

    return null;
  }
}
