package structural.decorators;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class FileDataSource implements DataSource {
  private String name;

  public FileDataSource(String name) {
    this.name = name;
  }

  @Override
  public void writeData(String data) {
    File file = new File(name);
    try (OutputStream fileOutputStream = new FileOutputStream(file)) {
      fileOutputStream.write(data.getBytes(), 0, data.length());
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public String readData() {
    char[] buffer = null;
    File file = new File(this.name);

    try (FileReader fileReader = new FileReader(file)) {
      buffer = new char[(int) file.length()];
      fileReader.read(buffer);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return new String(buffer);
  }
}
