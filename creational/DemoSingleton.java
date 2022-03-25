package creational;

import creational.singleton.Singleton;

public class DemoSingleton {

  public static void main(String[] args) {
    Singleton s = Singleton.getInstance("ABC");
    Singleton s2 = Singleton.getInstance("DEF");

    // Must print the same value
    System.out.println(s.getValue());
    System.out.println(s2.getValue());
  }
}
