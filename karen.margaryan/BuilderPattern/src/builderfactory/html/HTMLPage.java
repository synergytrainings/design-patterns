package builderfactory.html;

/**
 * Creates HTML Page document using Builder Pattern
 * @author Karen
 *
 */
public class HTMLPage {
	
	/**
	 * Contains page header block (banner, page title etc)
	 */	
	private HTMLPageHeader pageHeader;
	
	/**
	 * Contains page menu block
	 */
	private HTMLPageMenu pageMenu;
	
	/**
	 * Contains page middle dynamic modifiable block 
	 */
	private HTMLPageContent pageContent;
	
	/**
	 * Contains page footer block (copyright, year etc)
	 */
	private HTMLPageFooter pageFooter;
	
	
	/**
	 * 
	 * @param htmlPageBuilder 
	 */
	private HTMLPage(HTMLPageBuilder htmlPageBuilder) {
		pageHeader = htmlPageBuilder.pageHeader;
		pageMenu = htmlPageBuilder.pageMenu;
		pageContent = htmlPageBuilder.pageContent;
		pageFooter = htmlPageBuilder.pageFooter;
	}
	
	@Override
	public String toString() {
		return pageHeader.toString()
				+ "\n\n"
				+ pageMenu 
				+ "\n\n"
				+ pageContent 
				+ "\n\n"
				+ pageFooter;
	}
	
	/**
	 * Builder class for HTMLPage class
	 *
	 */
	public static class HTMLPageBuilder {
		
		/**
		 * Contains page header block (banner, page title etc)
		 */
		private HTMLPageHeader pageHeader;
		
		/**
		 * Contains page menu block
		 */
		private HTMLPageMenu pageMenu;
		
		/**
		 * Contains page middle dynamic modifiable block 
		 */
		private HTMLPageContent pageContent;
		
		/**
		 * Contains page footer block (copyright, year etc)
		 */
		private HTMLPageFooter pageFooter;		
		
		/**
		 * Sets page header block
		 * @param pageHeader page header initialized object
		 * @return the same object with page header
		 */
		public HTMLPageBuilder pageHeader(HTMLPageHeader pageHeader) {
			this.pageHeader = pageHeader;
			return this;
		}
		
		/**
		 * Sets page menu block
		 * @param pageMenu page menu initialized object
		 * @return the same object with page menu block
		 */
		public HTMLPageBuilder pageMenu(HTMLPageMenu pageMenu) {
			this.pageMenu = pageMenu;
			return this;
		}
		
		/**
		 * Sets page dynamic modifiable block
		 * @param pageContent page dynamic modifiable initialized object
		 * @return the same object with page content block
		 */		
		public HTMLPageBuilder pageContent(HTMLPageContent pageContent) {
			this.pageContent = pageContent;
			return this;
		}
		
		/**
		 * Sets page footer block
		 * @param pageFooter page footer initialized object
		 * @return the same object with page footer block
		 */
		public HTMLPageBuilder pageFooter(HTMLPageFooter pageFooter) {
			this.pageFooter = pageFooter;
			return this;
		}
		
		/**
		 * Builds HTMLPage object based on previous initializations
		 * @return
		 */
		public HTMLPage build() {
			return new HTMLPage(this);
		}
		
	}
}
