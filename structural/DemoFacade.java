package structural;

import java.io.File;
import structural.facade.VideoConversionFacade;

public class DemoFacade {
  public static void main(String[] args) {
    VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
    File convertedVideo = videoConversionFacade.convertVideo("thisIsOgg.ogg", "mp4");
    // ..
  }
}
