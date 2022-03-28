package structural;

import structural.decorators.DataSource;
import structural.decorators.DataSourceDecorator;
import structural.decorators.EncryptionDecorator;
import structural.decorators.FileDataSource;

public class DemoDecorators {
  private static final String FILE_PATH = "decoratorsDemoFile.txt";
  private static final String SEPARATOR = "=============================";

  public static void main(String[] args) {
    String userData = "Name,Position\nJonathan,Staff\nAlex,Supervisor";
    DataSourceDecorator encoded = new EncryptionDecorator(new FileDataSource(FILE_PATH));
    encoded.writeData(userData);

    DataSource plain = new FileDataSource(FILE_PATH);
    System.out.println(SEPARATOR);
    System.out.println("Data: ");
    System.out.println(userData);
    System.out.println(SEPARATOR);
    System.out.println("Encoded: ");
    System.out.println(plain.readData());
    System.out.println(SEPARATOR);
    System.out.println("Decoded: ");
    System.out.println(encoded.readData());
    System.out.println(SEPARATOR);
  }
}
