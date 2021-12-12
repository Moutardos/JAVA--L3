/***************************************************************
* L2INFO | G1 TP1 Java | "Pascal.java" |                       *        
* Par Loïc Cozdenmat | loic.cozdenmat@edu.univ-eiffel.fr       *
*                                                              *
* Crée le               : 20/09/2021 16:12                     *
****************************************************************/

import java.util.Scanner; 

/*  Temps d'éxécution 
    Java : ~0m0,277s
    C : ~0m0,979s
	Java est optimisé pour le CPU dans lequel il est éxécuté, il est donc plus rapide mais au sacrifice d'une "mauvaise" utilisation de la mémoire 
*/
public class Pascal{

	public static void main (String[] args){
		System.out.println("Cn, p = " + renvoiePascal(30000, 250));
	}

	/* Renvoie le coefficient binomial (n,p) */
	public static int renvoiePascal(int ngoal, int pgoal) {
		var array[] = new int[ngoal + 1];
		var n;
		var i;
		array[0] = 1;
		for (n = 1; n <= ngoal; n++){
			array[n] = 1;

			for(i = n - 1; i > 0; i--)
				array[i] = array[i - 1] + array[i];
		}

		return array[pgoal];
	}
}