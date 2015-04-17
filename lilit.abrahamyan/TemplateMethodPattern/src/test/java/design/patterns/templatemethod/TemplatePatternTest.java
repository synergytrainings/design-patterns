package design.patterns.templatemethod;
import org.junit.Assert;
import org.junit.Test;


public class TemplatePatternTest {

	@Test
	public void testTemplatePattern() {
		
		ReportExporter exporter = new ExcelExporter();
		exporter.exportReport();
		Assert.assertTrue(exporter.file.getName().contains(ReportExporter.EXCEL_FILE_EXT));
		

		exporter = new HtmlExporter();
		exporter.exportReport();
		Assert.assertTrue(exporter.file.getName().contains(ReportExporter.HTML_FILE_EXT));


	}
}
