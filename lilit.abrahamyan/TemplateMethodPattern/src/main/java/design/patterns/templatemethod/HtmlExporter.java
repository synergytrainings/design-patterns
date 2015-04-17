package design.patterns.templatemethod;

import java.io.File;

public class HtmlExporter extends ReportExporter{


	@Override
	public void createFile() {
		file = new File("export" + HTML_FILE_EXT);
	}

	@Override
	public void exportDataTFile() {
		System.out.println("Exports Data into html file");		
	}

}
