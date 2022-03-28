package structural.facade.complex_library_example;

public class BitrateReader {
  public static VideoFile read(VideoFile videoFile, Codec coded) {
    System.out.println("Bitrate Reader: Reading file...");
    return videoFile;
  }

  public static VideoFile convert(VideoFile buffer, Codec coded) {
    System.out.println("BitrateReader: Writing file...");
    return buffer;
  }
}
