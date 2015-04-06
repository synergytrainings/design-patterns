package design.patterns.memento;

import org.junit.Assert;
import org.junit.Test;


public class MementoPatternTest {
	
	@Test
	public void test(){
		
		ReportSaver reportSaver = new ReportSaver();
		
		Report report1 = new Report("new", 1);
		Report report2 = new Report("shared", 2);
		
		Assert.assertNotEquals(report1, report2);
		
		reportSaver.saveReport(report1);
		reportSaver.restoreReport(report2);
		
		Assert.assertEquals(report1, report2);
		
	}
}
