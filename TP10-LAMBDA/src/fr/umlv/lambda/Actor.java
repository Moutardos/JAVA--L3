package fr.umlv.lambda;

import java.util.*;
import java.util.function.Supplier;

public record Actor(String firstName, String lastName){
    public Actor {
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);
        
    }

    public static HashMap<String, Set<Actor>> actorGroupByFirstName(List<Actor> actors) {
    	Objects.requireNonNull(actors,"actors list can't be null");
    	HashMap<String, Set<Actor>> mapAnswer = new HashMap<>();
        actors.forEach(elem -> mapAnswer.computeIfAbsent(elem.firstName, k -> new HashSet<Actor>()).add(elem));
        return mapAnswer;

    }

    public static HashMap<String, Set<Actor>> actorGroupBy(List<Actor> actors, Operation<String, Actor> op) {
    	Objects.requireNonNull(actors,"actors list can't be null");
    	Objects.requireNonNull(op, "the second parameter must return a String");
        HashMap<String, Set<Actor>> mapAnswer = new HashMap<>();
        actors.forEach(elem ->{
        	var name = op.GroupBy(elem);
        	mapAnswer.computeIfAbsent(name, k -> new HashSet<>()).add(elem);
        });
        return mapAnswer;
    }

 

}



