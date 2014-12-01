import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aram on 12/1/2014.
 */
public class ImageGallery {
    private Resolution resolution;

    private Map<String, ImageProxy> images;

    public ImageGallery() {
        images = new HashMap<String, ImageProxy>();
        resolution = Resolution.Low;
        //loading all information about images from xml file
        //and creating proxies
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public Image getImage(String id) {
        ImageProxy proxy = images.get(id);
        proxy.setResolution(resolution);
        return proxy;
    }
}
