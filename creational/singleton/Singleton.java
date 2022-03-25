package creational.singleton;

public final class Singleton {
  private static Singleton instance;

  private String value;

  private Singleton(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  public static Singleton getInstance(String value) {
    if (instance == null) {
      System.out.println("Initializing: " + value);
      instance = new Singleton(value);
    }

    return instance;
  }
}
