package design.patterns.strategy;

public class Book {
	private final String id;
	private final String author;
	private final String title;
	
	public Book(String id, String author, String title) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	
}
