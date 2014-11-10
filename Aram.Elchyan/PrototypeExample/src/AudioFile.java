/**
 * Created by Aram on 11/6/2014.
 */
public class AudioFile extends File {
    private double duration;

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public File clone() {
        AudioFile file = new AudioFile();
        file.autor = autor;
        file.duration = duration;
        return file;
    }
}
