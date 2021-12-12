import java.util.LinkedHashMap;
import java.util.Objects;

//Une classe nous permet de ne pas forcer la création des champs a la création de l'objet,
//beaucoup plus pratique pour les collections
public class Library2 {
	
	private final LinkedHashMap<String, Book> books;
	
	public Library2() {
		this.books = new LinkedHashMap<>();
	}
	
	public void add(Book book) {
		Objects.requireNonNull(book);
		books.put(book.title(), book);
	}
	
	
	public Book findByTitle(String title) {
		return books.get(title);
	}
	
//	public void removeAllBooksFromAuthor(String author){
//	Iterator iterateur =  books.entrySet().iterator();
//		
//		while (iterateur.hasNext()) {
//			var titleget = iterateur.
//			if (book.get(title).author().equals(author)) {
//				
//			}
//		}
//	}
	@Override
	public String toString() {
		return books.values().toString();
	}
	
	
}