/***************************************************************
* L2INFO | G1 TP3 Java | Main                                  *        
* Par Loïc Cozdenmat | loic.cozdenmat@edu.univ-eiffel.fr       *
*                                                              *
* Crée le               : 10/10/2021 13:47                     *
****************************************************************/
public class Main{

    // On ne peux pas acceder aux do
    public static void main(String[] args){

        var book = new Book("Da Vinci Code", "Dan Brown");
        System.out.println(book.title() + ' ' + book.author() );
        book = book.withTitle("Da vinci Mode");
        System.out.println(book.title() + ' ' + book.author() );
        var book2 = new Book("Da vinci Code 2", "Dan Brown");
        System.out.println(book.title() + " et " + book2.title() + " meme auteur ? " + book.isFromTheSameAuthor(book2));
        
        var booka = new Book2("Da Vinci Code", "Dan Brown");
        var bookb = new Book2("Da Vinci Code", "Dan Brown");
        System.out.println(booka.equals(bookb));


    }
}