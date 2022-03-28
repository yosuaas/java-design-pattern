package structural.decorators;

public interface DataSource {
  void writeData(String data);

  String readData();
}
