/**
 * 
 */
package builderfactory.html;


/**
 * @author Karen
 *
 */
public class HTMLPageMenu {
	
	private String[] menuItems;
	
	public HTMLPageMenu(String[] menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public String toString() {
		StringBuilder menuLine = new StringBuilder();
		menuLine.append("<div class='menu'>");
		for (String menuItem : menuItems) {
			menuLine.append("\n\t<a href='" + menuItem + "'>").append(menuItem).append("</a>");
		}
		menuLine.append("\n</div>");
		
		return menuLine.toString();
	}
}
