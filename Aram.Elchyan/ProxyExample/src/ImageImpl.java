/**
 * Created by Aram on 12/1/2014.
 */
public class ImageImpl extends Image {
    private String src;

    public void SetSrc(String src) {
        this.src = src;
    }

    public String GetSrc() {
        return src;
    }

    @Override
    public void Draw(double screenX, double screenY) {
        //drawing image
    }
}
