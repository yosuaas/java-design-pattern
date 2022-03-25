package creational.abstractfactory.factory;

import creational.abstractfactory.account.Account;
import creational.abstractfactory.account.impl.CurrentAccount;
import creational.abstractfactory.account.impl.SavingAccount;
import creational.abstractfactory.bank.Bank;
import creational.abstractfactory.loan.Loan;

public class AccountFactory extends AbstractFactory {

  private final String CURRENT_ACCOUNT = "Current";
  private final String SAVING_ACCOUNT = "Saving";

  @Override
  public Bank getBank(String bankName) {
    return null;
  }

  @Override
  public Account getAccount(String accountType) {
    if (CURRENT_ACCOUNT.equalsIgnoreCase(accountType)) {
      return new CurrentAccount();
    } else if (SAVING_ACCOUNT.equalsIgnoreCase(accountType)) {
      return new SavingAccount();
    }
    return null;
  }

  @Override
  public Loan getLoan(String loanType) {
    return null;
  }
}
