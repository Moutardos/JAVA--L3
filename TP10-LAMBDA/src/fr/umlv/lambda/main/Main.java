package fr.umlv.lambda.main;

import java.util.ArrayList;
import java.util.List;

import fr.umlv.lambda.Actor;
import fr.umlv.lambda.Lambda;

public class Main {



    public static void main(String[] args) {

        String[]   s ={ "on", "est", "majuscule", "majuscule", "majuscule"};

        // upperCaseAll
        Lambda<String> info = new Lambda<>();
        Lambda.upperCaseAll(s);
        System.out.println(s[0] + " " + s[1] + " " + s[2]);

        // occurences
        System.out.println(info.occurences(s));

        // Actor
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("bob", "cat"));
        actors.add(new Actor("bob", "de niro"));
        actors.add(new Actor("willy", "cat"));

        System.out.println(Actor.actorGroupByFirstName(actors));

        System.out.println(Actor.actorGroupBy(actors, Actor::lastName));


    }

}
