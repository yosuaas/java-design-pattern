package structural.bridge.devices;

public interface Device {
  String getDeviceType();

  boolean isEnabled();

  void enable();

  void disable();

  int getVolume();

  void setVolume(int volume);

  int getChannel();

  void setChannel(int channel);

  void printStatus();
}
