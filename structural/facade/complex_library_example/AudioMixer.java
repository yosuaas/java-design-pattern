package structural.facade.complex_library_example;

import java.io.File;

public class AudioMixer {
  public File fix(VideoFile videoFile) {
    System.out.println("AudioMixer: Fixing audio...");
    return new File("tempFile");
  }
}
