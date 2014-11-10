package Readers;

import Decoders.AudioDecoder;
import Files.AudioFile;
import Files.DecodedFile;

/**
 * Created by Aram on 11/5/2014.
 */
public abstract class AudioReader {

    protected AudioDecoder decoder;

    public AudioReader() {
        this.decoder = GetDecoder();
    }

    public void ReadFile(AudioFile file) {
        DecodedFile decodedFile = this.decoder.Decode(file);
        //....
    }

    protected abstract AudioDecoder GetDecoder();
}
