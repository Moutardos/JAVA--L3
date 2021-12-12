/***************************************************************
* L2INFO | G1 TP2 Java | Regex                                 *        
* Par Loïc Cozdenmat | loic.cozdenmat@edu.univ-eiffel.fr       *
*                                                              *
* Crée le               : 24/09/2021 13:47                     *
****************************************************************/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Morse { 
    public static void main(String[] args) {
    	// Compile permet de créer un "automate" avec une expression régulière
    	// Matcher essaye de vérifier si le string respecte l'automate.

    	Pattern reg = Pattern.compile("([^0-9]*)([0-9]+)");
        Matcher m;
    	for (var arg: args){
            m = reg.matcher(arg);
    		if(m.find())
    			System.out.println(m.group(2));


    	}

    }
}