package structural.bridge.devices;

public class Radio implements Device {
  private final String DEVICE_TYPE = "Radio";

  private boolean on = false;
  private int volume = 0;
  private int channel = 1;

  @Override
  public String getDeviceType() {
    return DEVICE_TYPE;
  }

  @Override
  public boolean isEnabled() {
    return this.on;
  }

  @Override
  public void enable() {
    this.on = true;
  }

  @Override
  public void disable() {
    this.on = false;
  }

  @Override
  public int getVolume() {
    return this.volume;
  }

  @Override
  public void setVolume(int volume) {
    if (volume < 0) {
      this.volume = 0;
    } else if (volume > 100) {
      this.volume = 100;
    } else {
      this.volume = volume;
    }
  }

  @Override
  public int getChannel() {
    return channel;
  }

  @Override
  public void setChannel(int channel) {
    this.channel = channel;
  }

  @Override
  public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| Device: " + DEVICE_TYPE);
    System.out.println("| Device Status:  " + (on ? "Enabled" : "Disabled"));
    System.out.println("| Device Volume: " + volume + "%");
    System.out.println("| Device channel: " + channel);
    System.out.println("------------------------------------\n");
  }
}
