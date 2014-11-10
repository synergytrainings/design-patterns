package Decoders;

/**
 * Created by Aram on 11/5/2014.
 */
public class Mp4Decoder implements AudioDecoder {
    @Override
    public DecodedFile Decode(AudioFile file) {
        byte[] arr = new byte[10];

        //Mp4 specifc implementation

        DecodedFile decodedFile = new DecodedFile(arr);
        return decodedFile;
    }
}
