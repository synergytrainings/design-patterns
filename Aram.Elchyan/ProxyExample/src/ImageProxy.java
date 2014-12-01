/**
 * Created by Aram on 12/1/2014.
 */
public class ImageProxy extends Image {
    private Resolution resolution;

    private ImageImpl image;

    private static final String lowResolutionFolder= "./low/";

    private static final String MediumResolutionFolder= "./medium/";

    private static final String HighResolutionFolder= "./high/";

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public Resolution getResolution() {
        return resolution;
    }

    @Override
    public void Draw(double screenX, double screenY) {
        switch (resolution) {
            case Low:
                image.SetSrc(lowResolutionFolder + this.getTitle());
                break;
            case Medium:
                image.SetSrc(MediumResolutionFolder + this.getTitle());
                break;
            case High:
                image.SetSrc(HighResolutionFolder + this.getTitle());
        }
        image.Draw(screenX, screenY);
    }
}
