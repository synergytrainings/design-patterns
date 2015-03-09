import chainofresponsibility.Button;
import chainofresponsibility.Tab;
import chainofresponsibility.View;
import chainofresponsibility.Window;

/**
 * Created by Karen on 12/9/2014.
 */
public class Main {
    public static void main(String[] args) {
        View window = new Window(null);
        View tab = new Tab(window);
        View button = new Button(tab);
        button.onClick();

        System.out.println("-----------------------------");
        tab.stopEventPropagation(true);
        button.onClick();

    }
}
