package creational.abstractfactory.bank.impl;

import creational.abstractfactory.bank.Bank;

public class BankMandiri implements Bank {

  @Override
  public String getBankName() {
    return "Bank Mandiri";
  }
}
