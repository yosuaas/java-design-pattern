package structural.facade.complex_library_example;

import structural.facade.constant.VideoFormatConst;

public class CodecFactory {

  public static Codec extract(VideoFile videoFile) {
    String type = videoFile.getCodecType();
    if (VideoFormatConst.MP4.equalsIgnoreCase(type)) {
      System.out.println("CodecFactory: Extracting MPEG Audio");
      return new MPEG4CompressionCodec();
    } else {
      System.out.println("CodecFactory: Extracting OGG Audio");
      return new OggCompressionCodec();
    }
  }
}
