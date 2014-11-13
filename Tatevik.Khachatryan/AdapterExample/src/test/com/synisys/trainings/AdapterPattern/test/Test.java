package test.com.synisys.trainings.AdapterPattern.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import main.com.synisys.trainings.AdapterPattern.PipProject;
import main.com.synisys.trainings.AdapterPattern.Project;
import main.com.synisys.trainings.AdapterPattern.impl.*;

public class Test {

	@org.junit.Test
	public void test() {
		// init test project
		CurrencyAmount currencyAmount = new CurrencyAmount(3, new BigDecimal(
				500));
		ProjectImpl testProject = new ProjectImpl(1, "PRJ/Test Project 1",
				currencyAmount);

		// TEST 1------------
		// our program will convert pipProject object to Project class object to
		// pass it to other interface which expects Project instead of
		// PipProject

		// init test pipProject
		PipProject pipProject = new PipProjectImpl(1, "Test Project 1", 500);
		Project project1 = new ProjectObjectAdapter(pipProject);

		// check if project1 equals to testProject by each property...
		assertEquals(testProject.getId(), project1.getId());
		assertEquals(testProject.getName(), project1.getName());
		assertEquals(testProject.getCurrencyAmount().getAmount(), project1
				.getCurrencyAmount().getAmount());

		// TEST 2------------
		// our program will convert pipProject object to Project class object to
		// pass it to other interface which expects Project instead of
		// PipProject
		ProjectClassAdapter project2 = new ProjectClassAdapter();

		// init ProjectClassAdapter project2 through pipProject data
		project2.setPipProjectId(1);
		project2.setTitle("Test Project 1");
		project2.setAmount(500);

		// check if project2 equals to testProject by each property...
		assertEquals(testProject.getId(), project2.getId());
		assertEquals(testProject.getName(), project2.getName());
		assertEquals(testProject.getCurrencyAmount().getAmount(), project2
				.getCurrencyAmount().getAmount());

		// now let's test pip project data with testPip...
		PipProject testPipProject = new PipProjectImpl(2, "Test Pip Project 2",
				150);

		project2.setId(2);
		project2.setName("PRJ/Test Pip Project 2");
		project2.setCurrencyAmount(new CurrencyAmount(5, new BigDecimal(300)));
		assertEquals(testPipProject.getPipProjectId(),
				project2.getPipProjectId());
		assertEquals(testPipProject.getTitle(), project2.getTitle());
		assertEquals(testPipProject.getAmount(), project2.getAmount());

	}

}
