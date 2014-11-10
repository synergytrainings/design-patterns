package Readers;

import Decoders.AudioDecoder;
import Decoders.Mp4Decoder;

/**
 * Created by Aram on 11/5/2014.
 */
public class Mp4Reader extends AudioReader {
    @Override
    protected AudioDecoder GetDecoder() {
        return new Mp4Decoder();
    }
}
