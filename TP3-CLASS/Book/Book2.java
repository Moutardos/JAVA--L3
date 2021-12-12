/***************************************************************
* L2INFO | G1 TP3 Java | Book2                                 *        
* Par Loïc Cozdenmat | loic.cozdenmat@edu.univ-eiffel.fr       *
*                                                              *
* Crée le               : 10/10/2021 13:47                     *
****************************************************************/
/*
  Les méthodes equals et hashcode ne fonctionne pas directement dans les class, il faut les modifier
*/


public class Book2 {
  private final String title;
  private final String author;

  public Book2(String title, String author) {
    this.title = title;
    this.author = author;
  }

  @Override
  public  boolean equals(Object o){
   
    return o instanceof Book2 book 
    && title.equals(book.title) 
    && author.equals(book.author); 
  }

  @Override
  public int hashCode(){
    return title.hashCode() ^ author.hashCode();
  }
  
}
  