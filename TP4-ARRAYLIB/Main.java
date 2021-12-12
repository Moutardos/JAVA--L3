/**
 * 
 */

/**
 * @author loic
 *
 */
public class Main {
	public static void main(String[] args) {
		
	    var library = new Library2();
	    var book1 = new Book("Da Vinci Code", "Monsieur");
	    var book2 = new Book("Dadada Vinci Code", "Sosie de Monsieur");
	    var book3 = new Book("Petit livre sympa", "Bernard");

	    library.add(book1);
	    library.add(book2);
	    library.add(book3);
	    System.out.println(library);

	    System.out.println(library.findByTitle("Da Vinci Code"));

//	      var library2 = new Library2();
//	      library2.add(new Book("Da Vinci Code", "Dan Brown"));
//	      library2.add(new Book("Angels & Demons", "Dan Brown"));
//	      library2.removeAllBooksFromAuthor("Dan Brown");

	}

}
