package decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.synisys.trainings.designPatterns.decorator.api.Category;
import com.synisys.trainings.designPatterns.decorator.api.Format;
import com.synisys.trainings.designPatterns.decorator.impl.CategoryDecorator;
import com.synisys.trainings.designPatterns.decorator.impl.CategoryImpl;
import com.synisys.trainings.designPatterns.decorator.impl.FormatImpl;



public class DecoratorTest {
	@Test
	public void test() {
		Format format = new FormatImpl();
		format.setBold(true);
		format.setItalic(true);
		Category category = new CategoryImpl("A1_Commitment", "Commitment");
		CategoryDecorator categoryDecorator = new CategoryDecorator(category);
		categoryDecorator.setFormat(format);
		assertEquals("Bold Italic Category", categoryDecorator.toString());
	}
	
}
