package structural.decorators;

public class DataSourceDecorator implements DataSource {
  private DataSource wrapee;

  public DataSourceDecorator(DataSource source) {
    this.wrapee = source;
  }

  @Override
  public void writeData(String data) {
    wrapee.writeData(data);
  }

  @Override
  public String readData() {
    return wrapee.readData();
  }
}
