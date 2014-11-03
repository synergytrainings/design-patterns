package DeviceComponents;

/**
 * Created by Aram on 11/2/2014.
 */
public class Screen {
    private boolean isTouchScreen;

    private Double size;

    public void setTouchScreen(boolean isTouchScreen) {
        this.isTouchScreen = isTouchScreen;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public Double getSize() {
        return size;
    }
}
