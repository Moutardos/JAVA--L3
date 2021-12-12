/***************************************************************
* L2INFO | G1 TP1 Java | "Point.java" |                        *        
* Par Loïc Cozdenmat | loic.cozdenmat@edu.univ-eiffel.fr       *
*                                                              *
* Crée le               : 20/09/2021 15:20                     *
****************************************************************/

import java.lang.Integer;

/* Pour compiler, on utilise javac */
public record Point(int x, int y) {
	
	/* Une fonctions static n'agit pas sur les variables de la classe */
	public static void main (String[] args) {
		if (args.length != 2){
			System.out.println("Merci de rentrer deux nombres en argument lors de l'éxécution");
			System.exit(0);
		}
		/* Si parseInt ne trouve pas de int, le programme plante et envoie l'erreur : "NumberFormatException" */
		var x = Integer.parseInt(args[0]);
		var y = Integer.parseInt(args[1]);
		System.out.println("x=" + x + ", y=" + y);
		
		Point point = new Point(x,y);
		System.out.println(point.toString());
		System.out.println("Distance entre 0,0 et le point est de :" + point.distance());

	}
	public	double distance() {
		return Math.sqrt(x*x + y*y);
	}
}
