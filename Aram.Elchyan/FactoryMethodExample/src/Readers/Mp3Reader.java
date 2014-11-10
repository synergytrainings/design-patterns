package Readers;

import Decoders.AudioDecoder;
import Decoders.Mp3Decoder;

/**
 * Created by Aram on 11/5/2014.
 */
public class Mp3Reader extends AudioReader {
    @Override
    protected AudioDecoder GetDecoder() {
        return new Mp3Decoder();
    }
}
