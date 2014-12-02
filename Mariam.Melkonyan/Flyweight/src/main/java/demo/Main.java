package demo;

import com.synisys.trainings.designPatterns.flyweight.api.HTMLElement;
import com.synisys.trainings.designPatterns.flyweight.api.HTMLElementContext;
import com.synisys.trainings.designPatterns.flyweight.impl.HTMLElementContextImpl;
import com.synisys.trainings.designPatterns.flyweight.impl.HTMLElementFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HTMLElementContext context =  new HTMLElementContextImpl("FF0000", 10, 10);
		HTMLElementFactory htmlElementFactory =  new HTMLElementFactory();
		HTMLElement element = htmlElementFactory.getHTMLElement("div");
		element.draw(context);

	}

}
