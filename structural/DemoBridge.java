package structural;

import structural.bridge.devices.Device;
import structural.bridge.devices.Radio;
import structural.bridge.devices.Tv;
import structural.bridge.remotes.AdvancedRemote;
import structural.bridge.remotes.BasicRemote;

public class DemoBridge {

  public static void main(String[] args) {
    testBasicRemote(new Tv());
    testAdvancedRemote(new Radio());
  }

  public static void testBasicRemote(Device device) {
    System.out.println("Device: " + device.getDeviceType() + " Test with basic remote");
    BasicRemote basicRemote = new BasicRemote(device);
    // Before
    System.out.println("Before:");
    device.printStatus();
    // After
    System.out.println("After");
    basicRemote.power();
    basicRemote.channelUp();
    basicRemote.volumeUp();
    device.printStatus();
  }

  public static void testAdvancedRemote(Device device) {
    System.out.println("Device: " + device.getDeviceType() + " Test with advanced remote");
    AdvancedRemote advancedRemote = new AdvancedRemote(device);
    // Before
    System.out.println("Before: ");
    device.setVolume(100);
    device.printStatus();
    // After
    System.out.println("After: ");
    advancedRemote.power();
    advancedRemote.mute();
    device.printStatus();
  }
}
