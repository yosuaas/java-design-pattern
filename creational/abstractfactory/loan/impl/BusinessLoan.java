package creational.abstractfactory.loan.impl;

import creational.abstractfactory.loan.Loan;

public class BusinessLoan extends Loan {

  @Override
  public String getLoanType() {
    return "Business Loan";
  }

  @Override
  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public Double getInterestRate() {
    return this.interestRate;
  }
}
