package fr.umlv.lambda;


@FunctionalInterface
public interface Operation<T, S> {
	// Mostly used with Actor::firstName and Actor::lastName
    T GroupBy(Actor S);
    
}
