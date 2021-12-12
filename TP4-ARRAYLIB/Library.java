import java.util.ArrayList;
import java.util.Objects;
public class Library {
	
	private ArrayList<Book> books;
	
	public Library() {
		this.books = new ArrayList<Book>();
	}
	
	public void add(Book book) {
		Objects.requireNonNull(book);
		books.add(book);
	}
	
	
	//Complexité O(n)
	public Book findByTitle(String title) {
		Objects.requireNonNull(title);
		var booksIterator = books.iterator();
		while (booksIterator.hasNext()) {
			var bookFound = booksIterator.next();
			if (bookFound.title().equals(title))
				return bookFound;
		}
		//Renvoie null si aucun livre n'a ce titre, ce qui peut arriver
		return null;
	}
	
	@Override
	public String toString() {
		var builder = new StringBuilder("[");
		for (var book : books) 
			builder.append(book).append(' ');
		builder.append(']');
		return builder.toString();
	}
	
	
}
