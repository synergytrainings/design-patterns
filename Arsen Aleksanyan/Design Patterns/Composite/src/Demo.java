import com.synisys.designpatterns.composite.Window;
import com.synisys.designpatterns.composite.leafs.Button;
import com.synisys.designpatterns.composite.leafs.CheckBox;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Window window = new Window(0,0,800,800);

		window.addUIComponent(new Button(10,10,50,50));
		window.addUIComponent(new CheckBox(10,80,50,50));
		
		window.draw();
	}

}
