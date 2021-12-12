package fr.umlv.data.main;

import fr.umlv.data.Link;
import fr.umlv.data.LinkedLink;

public class Main {
    //Ajouter des casts Object partout est redondant
    public static void main(String[] args) {
        Link<Integer> maillon1 = new Link<>(13);
        Link<Integer> maillon2 = new Link<>(144);
        LinkedLink<String> linkedLink1 = new LinkedLink();

        linkedLink1.add("oink");
        linkedLink1.add("gruik");
        linkedLink1.add("meow");

        System.out.println(linkedLink1);

        // meow
        System.out.println(linkedLink1.get(0));

        // oink
        System.out.println(linkedLink1.get(2));

        // null !
        System.out.println(linkedLink1.get(20));


    }
}
