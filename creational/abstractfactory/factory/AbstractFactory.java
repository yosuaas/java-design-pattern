package creational.abstractfactory.factory;

import creational.abstractfactory.account.Account;
import creational.abstractfactory.bank.Bank;
import creational.abstractfactory.loan.Loan;

public abstract class AbstractFactory {
  public abstract Bank getBank(String bankName);

  public abstract Account getAccount(String accountType);

  public abstract Loan getLoan(String loanType);
}
