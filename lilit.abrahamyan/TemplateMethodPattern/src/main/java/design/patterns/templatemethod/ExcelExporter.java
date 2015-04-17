package design.patterns.templatemethod;

import java.io.File;


/**
 * 
 * @author lilit.abrahamyan
 * 
 */
public class ExcelExporter extends ReportExporter{

	@Override
	public void createFile() {
		file = new File("export" + EXCEL_FILE_EXT);
	}

	@Override
	public void exportDataTFile() {
		System.out.println("Exports Data into excel file");
	}


}
