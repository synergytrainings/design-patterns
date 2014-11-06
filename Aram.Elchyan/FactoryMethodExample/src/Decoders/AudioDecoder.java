package Decoders;

import Files.AudioFile;
import Files.DecodedFile;

/**
 * Created by Aram on 11/5/2014.
 */
public interface AudioDecoder {
    public DecodedFile Decode(AudioFile file);
}
