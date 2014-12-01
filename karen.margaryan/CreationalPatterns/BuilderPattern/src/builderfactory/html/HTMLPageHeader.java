/**
 * 
 */
package builderfactory.html;


/**
 * @author Karen
 *
 */
public class HTMLPageHeader {
	
	private String pageTitle;
	private String bannerFilename;
	
	
	public HTMLPageHeader(String pageTitle, String bannerFilename) {
		this.pageTitle = pageTitle;
		this.bannerFilename = bannerFilename;
	}
	
	@Override
	public String toString() {
		return "<html>\n<head>\n\t<title>" + pageTitle + "</title>\n</head> "
				+ "\n<body>\n\n<img src='" + bannerFilename + "' height='200px'>";
	}
}
