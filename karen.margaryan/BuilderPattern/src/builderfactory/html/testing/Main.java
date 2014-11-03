package builderfactory.html.testing;

import builderfactory.html.HTMLPage;
import builderfactory.html.HTMLPageContent;
import builderfactory.html.HTMLPageFooter;
import builderfactory.html.HTMLPageHeader;
import builderfactory.html.HTMLPageMenu;

public class Main {
	public static void main(String[] args) {
		HTMLPage htmlPage = new HTMLPage.HTMLPageBuilder()
				.pageHeader(new HTMLPageHeader("Builder Pattern", ""))
				.pageMenu(new HTMLPageMenu(new String[] {"home", "pricelist", "contacts"}))
				.pageContent(new HTMLPageContent("<h1>HELLO BUILDER PATTERN</h1>"))
				.pageFooter(new HTMLPageFooter())
				.build();
		
		System.out.println(htmlPage);
	}
}
