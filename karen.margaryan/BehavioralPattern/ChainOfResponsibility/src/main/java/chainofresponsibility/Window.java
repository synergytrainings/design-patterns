package chainofresponsibility;

/**
 * Created by Karen on 12/9/2014.
 */
public class Window extends View {

    public Window(View parent) {
        super(parent);
    }


    @Override
    public void onClick() {
        System.out.println("Window: click event handler is working");

        View parent = getParent();
        if (parent != null && getStopEventPropagation() == false) {
            parent.onClick();
        }
    }
}
