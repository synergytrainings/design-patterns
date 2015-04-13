package design.patterns.strategy;
import org.junit.Assert;
import org.junit.Test;

public class StrategyPatternTest {

	@Test
	public void testStrategyPattern() {

		OnlineLibrary library = new OnlineLibrary();
		
		library.add(new Book("896AC", "Joanne Harris", "Chocolat"));
		library.add(new Book("123AA", "Dan Brown", "Code Da Vinci"));
		library.add(new Book("146AA", "Jane Austen", "Pride and Prejudice"));
		
		library.setComparator(new AuthorNameComparator());
		library.sort();		
		Assert.assertEquals(library.getBooks().get(0).getAuthor(), "Dan Brown");
		
		library.setComparator(new TitleComparator());
		library.sort();
		Assert.assertEquals(library.getBooks().get(0).getAuthor(), "Joanne Harris");

	}
}
