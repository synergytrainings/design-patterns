package chainofresponsibility;

/**
 * Created by Karen on 12/9/2014.
 */
abstract public class View {

    private View parent;
    private boolean show;
    private boolean stopEventPropagation;

    public View(View parent) {
        this.parent = parent;
        stopEventPropagation = false;
        show = false;
    }

    public View getParent() {
        return parent;
    };

    public void setParent(View parent) {
        this.parent = parent;
    }

    public void show(boolean show) {
        this.show = show;
        // show or hide the view logic
    }

    public void stopEventPropagation(boolean stop) {
        this.stopEventPropagation = stop;
    }

    public boolean getStopEventPropagation() {
        return stopEventPropagation;
    }

    abstract public void onClick();

}
