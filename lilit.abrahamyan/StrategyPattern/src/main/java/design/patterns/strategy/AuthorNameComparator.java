package design.patterns.strategy;

import java.util.Comparator;

/**
 * 
 * @author lilit.abrahamyan
 * 
 */
public class AuthorNameComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		return book1.getAuthor().compareTo(book2.getAuthor());
	}
}