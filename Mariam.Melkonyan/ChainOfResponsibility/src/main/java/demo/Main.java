package demo;

import com.synisys.trainings.chainOfResponsibility.impl.HTMLElement;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HTMLElement body = new HTMLElement("body", null);
		HTMLElement table = new HTMLElement("table", body);
		HTMLElement tr =  new HTMLElement("tr", table);
		HTMLElement td =  new HTMLElement("td", tr);
		// in this case body, table, tr and td event handlers will be called
		td.onClicked();
		// in this case table and body event handlers are called
		table.onMouseUp();

	}

}
