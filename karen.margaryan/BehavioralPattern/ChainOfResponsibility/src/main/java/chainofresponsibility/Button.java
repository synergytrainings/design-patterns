package chainofresponsibility;

/**
 * Created by Karen on 12/9/2014.
 */
public class Button extends View {


    public Button(View parent) {
        super(parent);
    }


    @Override
    public void onClick() {
        System.out.println("Button: click event handler is working");

        View parent = getParent();
        if (parent != null && getStopEventPropagation() == false) {
            parent.onClick();
        }
    }
}
