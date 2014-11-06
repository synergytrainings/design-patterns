/**
 * Created by Aram on 11/6/2014.
 */
public class TextFile extends File {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public File clone() {
        TextFile file = new TextFile();
        file.autor = autor;
        file.content = content;
        return file;
    }
}
