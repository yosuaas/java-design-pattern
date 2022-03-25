package creational;

import creational.abstractfactory.account.Account;
import creational.abstractfactory.bank.Bank;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.factory.FactoryProducer;
import creational.abstractfactory.loan.Loan;

public class DemoAbstractFactory {

  public static void main(String[] args) {

    // Bank
    AbstractFactory bankFactory = FactoryProducer.getFactory("Bank");
    Bank bank = bankFactory.getBank("BCA");

    // Account
    AbstractFactory accountFactory = FactoryProducer.getFactory("Account");
    Account account = accountFactory.getAccount("Saving");

    // Loan
    AbstractFactory loanFactory = FactoryProducer.getFactory("Loan");
    Loan loan = loanFactory.getLoan("Education");
    loan.setInterestRate(4d);

    System.out.println(bank.getBankName());
    System.out.println(account.getAccountType());
    System.out.println(loan.getLoanType() + ", Interest rate: " + loan.interestRate);
  }
}
