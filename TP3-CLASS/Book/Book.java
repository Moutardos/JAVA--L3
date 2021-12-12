/***************************************************************
* L2INFO | G1 TP3 Java | Book                                  *        
* Par Loïc Cozdenmat | loic.cozdenmat@edu.univ-eiffel.fr       *
*                                                              *
* Crée le               : 10/10/2021 13:47                     *
****************************************************************/
import java.util.Objects;

public record Book(String title, String author){


	/*  
    	public Book(String title, String author) {
        	this.title = Objects.requireNonNull(title);
        	this.author = Objects.requireNonNull(author);
    	}
	*/


    // Si les deux arguments sont renseigné
	public Book {
        Objects.requireNonNull(title);
        Objects.requireNonNull(author);

    }

     // Si  un seul argument est renseigné
    public Book(String title){
    	this(title,"<no author>");
    }

	@Override // Remplace une fonction deja incluse
	public String toString(){
		return title + " by " + author;

	}


	/* Ca ne marche pas, il faut allouer un nouvel objet 
	public void withTitle(String title) {
    	this.title = title;
  	}*/

  	public Book withTitle(String title) {
   		return new Book(title, author);
  	}



  	public boolean isFromTheSameAuthor(Book book){
  		Objects.requireNonNull(book,"Book is NULL");
  		return author.equals(book.author);
  	}
}