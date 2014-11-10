package Files;

/**
 * Created by Aram on 11/5/2014.
 */
public class AudioFile extends File {
    private String format;

    public AudioFile(byte[] arr, String format) {
        this.byteArr = arr;
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
