package fr.umlv.data;

// Pour utiliser le main de Link dans le compilateur : java fr.umlv.data.Link
public final class Link<O> {

    // permet de relier le link, à son prochain maillon, protected car inutile d'y accéder
    // en dehors du package data
    protected Link<O> next;
    private final O value;


    public Link(O value){
        this.value = value;
        next = null;
    }

    public Object value(){
        return value;
    }
}
