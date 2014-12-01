/**
 * Created by Aram on 12/1/2014.
 */
public abstract class Image {
    private String id;

    private String title;

    public void Draw(double screenX, double screenY) {
        //drawing image
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
