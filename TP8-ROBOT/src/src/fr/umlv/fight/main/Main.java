package src.fr.umlv.fight.main;

import src.fr.umlv.fight.Arena;
import src.fr.umlv.fight.Fighter;
import src.fr.umlv.fight.Robot;

// Fighter est un polymorphisme de Robot (Architecture partageant des memes champs mais pouvant avoir des méthodes
// differentes

public class Main {

    public static void main(String[] args) {
        var bob = new Robot("bob");
        System.out.println(bob);  // affiche "Robot bob"

        var D2R2 = new Robot("D2R2");
        var data = new Robot("DATA");

        var winner = Arena.fight(D2R2, data);

        System.out.println("The winner is : " + winner);

        var john = new Fighter("John", 1);
        var jane = new Fighter("Jane", 2);
        System.out.println(Arena.fight(john, jane) + " wins");


    }
}
