/**
 * 
 */
package builderfactory.html;

/**
 * @author Karen
 *
 */
public class HTMLPageContent {
	
	private String pageContent;
	
	public HTMLPageContent(String pageContent) {
		this.pageContent = pageContent;
	}
	
	@Override
	public String toString() {
		return pageContent;
	}
}
