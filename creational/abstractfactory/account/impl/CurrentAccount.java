package creational.abstractfactory.account.impl;

import creational.abstractfactory.account.Account;

public class CurrentAccount implements Account {

  @Override
  public String getAccountType() {
    return "Current Account";
  }
}
