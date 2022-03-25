package creational.abstractfactory.bank.impl;

import creational.abstractfactory.bank.Bank;

public class BankBca implements Bank {

  @Override
  public String getBankName() {

    return "Bank BCA";
  }
}
