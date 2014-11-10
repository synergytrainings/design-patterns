/**
 * Created by Aram on 11/6/2014.
 */
public class PictureFile extends File {
    private double size;

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public File clone() {
        PictureFile file = new PictureFile();
        file.autor = autor;
        file.size = size;
        return file;
    }
}
