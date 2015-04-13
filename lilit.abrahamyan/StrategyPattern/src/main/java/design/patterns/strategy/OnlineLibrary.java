package design.patterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author lilit.abrahamyan
 * 
 */
public class OnlineLibrary {

	private List<Book> books;
	private Comparator<Book> comparator;

	public OnlineLibrary() {
		books = new ArrayList<>();
	}

	public void add(Book book) {
		books.add(book);
	}

	public List<Book> getBooks() {
		return books;
	}

	public void sort() {
		if (comparator != null) {
			Collections.sort(books, comparator);
		}
	}
	
	public void setComparator(Comparator<Book> comparator) {
		this.comparator = comparator;
	}

}
