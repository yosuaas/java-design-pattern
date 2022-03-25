package creational.abstractfactory.account.impl;

import creational.abstractfactory.account.Account;

public class SavingAccount implements Account {

  @Override
  public String getAccountType() {
    return "Saving Account";
  }
}
