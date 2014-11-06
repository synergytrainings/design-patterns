import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Aram on 11/6/2014.
 */
public class FilePrototypeFactory {
    private static Map<FileType,File> prototypes = new HashMap<FileType, File>();

    static {
        prototypes.put(FileType.Audio, new AudioFile());
        prototypes.put(FileType.Picture, new PictureFile());
        prototypes.put(FileType.Text, new TextFile());
    }

    public static File getFile(FileType type) {
        return  prototypes.get(type).clone();
    }
}
