/**
 * Created by Aram on 11/6/2014.
 */
public abstract class File {
    protected String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public abstract File clone();
}
