/***************************************************************
* L2INFO | G1 TP1 Java | "Calc.java" |                         *        
* Par Loïc Cozdenmat | loic.cozdenmat@edu.univ-eiffel.fr       *
*                                                              *
* Crée le               : 20/09/2021 14:59                     *
****************************************************************/

/* Import joue le rôle d'alias en java (On écrit alors Scanner dans le fichier au lieu de java.util.Scanner */
import java.util.Scanner; 

public class Calculette { 
    public static void main(String[] args) {
    	
    	/* Déclaration d'une variable Scanner */
    	var scanner = new Scanner(System.in);
		System.out.println("Bonjour, donnez moi deux entiers");
		
    	/* Déclaration d'une variable int 
    	   nextInt() est une méthode d'un record */
    	var value = scanner.nextInt();
    	
    	/* Déclaration d'une variable int */
    	var value2 = scanner.nextInt();
   
    	
		System.out.println(value + " + " + value2 + " = " + (value + value2));
		System.out.println(value + " - " + value2 + " = " + (value - value2));
		System.out.println(value + " * " + value2 + " = " + (value * value2));
		System.out.println(value + "/" + value2 + " = " + (value / value2 + " * " + value2 + " + " + value % value2));
    }
}
    