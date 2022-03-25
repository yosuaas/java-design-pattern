package creational.abstractfactory.loan;

public abstract class Loan {
  public Double interestRate;

  public abstract String getLoanType();

  public abstract Double getInterestRate();

  public abstract void setInterestRate(Double interestRate);
}
