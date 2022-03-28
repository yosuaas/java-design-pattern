package structural.facade;

import java.io.File;
import structural.facade.complex_library_example.AudioMixer;
import structural.facade.complex_library_example.BitrateReader;
import structural.facade.complex_library_example.Codec;
import structural.facade.complex_library_example.CodecFactory;
import structural.facade.complex_library_example.MPEG4CompressionCodec;
import structural.facade.complex_library_example.OggCompressionCodec;
import structural.facade.complex_library_example.VideoFile;
import structural.facade.constant.FormatConst;

public class VideoConversionFacade {
  public File convertVideo(String fileName, String format) {
    System.out.println("VideoConversionFacade: Conversion started...");
    VideoFile videoFile = new VideoFile(fileName);

    Codec sourceCodec = CodecFactory.extract(videoFile);
    Codec destinationCodec;

    if (format.equals(FormatConst.MP4)) {
      destinationCodec = new MPEG4CompressionCodec();
    } else {
      destinationCodec = new OggCompressionCodec();
    }

    VideoFile buffer = BitrateReader.read(videoFile, sourceCodec);
    VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
    File result = (new AudioMixer()).fix(intermediateResult);
    System.out.println("VideoConversionFacade: Conversion completed...");

    return result;
  }
}
