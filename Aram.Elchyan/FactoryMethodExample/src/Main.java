import Files.AudioFile;
import Readers.AudioReader;
import Readers.Mp3Reader;

public class Main {

    public static void main(String[] args) {
        AudioFile file = new AudioFile(new byte[20], "MP3");

        AudioReader reader = new Mp3Reader();
        reader.ReadFile(file);
    }
}
