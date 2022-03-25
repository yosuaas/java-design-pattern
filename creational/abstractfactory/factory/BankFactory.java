package creational.abstractfactory.factory;

import creational.abstractfactory.account.Account;
import creational.abstractfactory.bank.Bank;
import creational.abstractfactory.bank.impl.BankBca;
import creational.abstractfactory.bank.impl.BankMandiri;
import creational.abstractfactory.loan.Loan;

public class BankFactory extends AbstractFactory {

  private final String BANK_BCA = "BCA";
  private final String BANK_MANDIRI = "MANDIRI";

  @Override
  public Bank getBank(String bankName) {
    if (BANK_BCA.equalsIgnoreCase(bankName)) {
      return new BankBca();
    } else if (BANK_MANDIRI.equalsIgnoreCase(bankName)) {
      return new BankMandiri();
    }
    return null;
  }

  @Override
  public Account getAccount(String accountType) {
    return null;
  }

  @Override
  public Loan getLoan(String loanType) {
    return null;
  }
}
