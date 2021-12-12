/***************************************************************
* L2INFO | G1 TP2 Java | Morse                                 *        
* Par Loïc Cozdenmat | loic.cozdenmat@edu.univ-eiffel.fr       *
*                                                              *
* Crée le               : 24/09/2021 13:47                     *
****************************************************************/


public class Morse { 
    public static void main(String[] args) {
        // StringBuilder permet de construire en amont le string sans allouer de la mémoire a chaque boucle
        /* Méthode de merde
        var chaine = "";
        for (var arg: args){
            chaine = chaine +  arg + "Stop.";

        }
        */

        // Builder permet de ne pas allouer à chaque boucle, mais on prefere + si on l'utilise qu'une fois
        var builder = new StringBuilder();
        for (var arg: args){
            builder.append(arg).append(" Stop. ");
        }

        System.out.println(builder.toString());
        // Ne surtout pas mettre de + dans l'append, ça alloue de la mémoire inutilement
    }
}
    