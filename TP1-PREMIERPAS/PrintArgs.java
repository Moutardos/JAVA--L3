/***************************************************************
* L2INFO | G1 TP1 Java | "PrintArgs.java" |                    *        
* Par Loïc Cozdenmat | loic.cozdenmat@edu.univ-eiffel.fr       *
*                                                              *
* Crée le               : 20/09/2021 14:50                     *
****************************************************************/

public class PrintArgs{
	public static void main(String[] args){
		/* 1.
		 * System.out.println(args[0]);				    *
		 * Execution sans élément  : Erreur d'index OOB */
		
		for(String arg: args )
			System.out.println(arg);
	}
}