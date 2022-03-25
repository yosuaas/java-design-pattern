package creational.abstractfactory.factory;

import creational.abstractfactory.account.Account;
import creational.abstractfactory.bank.Bank;
import creational.abstractfactory.loan.Loan;
import creational.abstractfactory.loan.impl.BusinessLoan;
import creational.abstractfactory.loan.impl.EducationLoan;

public class LoanFactory extends AbstractFactory {

  private final String BUSINESS_LOAN = "Business";
  private final String EDUCATION_LOAN = "Education";

  @Override
  public Bank getBank(String bankName) {
    return null;
  }

  @Override
  public Account getAccount(String accountType) {
    return null;
  }

  @Override
  public Loan getLoan(String loanType) {
    if (BUSINESS_LOAN.equalsIgnoreCase(loanType)) {
      return new BusinessLoan();
    } else if (EDUCATION_LOAN.equalsIgnoreCase(loanType)) {
      return new EducationLoan();
    }

    return null;
  }
}
