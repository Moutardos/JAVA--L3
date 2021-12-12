package fr.umlv.data;


public class LinkedLink<T> {
    //fonctionne avec n'importe quel type T

    // premier maillon
    private Link<T> first;

    public LinkedLink(){
        first = null;
    }

    public LinkedLink(T value) {
        first = new Link<T>(value);
    }

    public Object add(T value){
        Link<T> newlink = new Link<T>(value);
        newlink.next = first;
        first = newlink;
        return value;
    }

    public T get(int index){
        int count = 0;
        Link<T> link = first;

        while(link != null) {
            if(count == index)
                return (T) link.value();
            link = link.next;
            count++;
        }

        // get est en dehors de la liste chainée
        return null;

    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Link<T> nextLink = first.next;
        sb.append("LinkedLink [").append(first.value());
        while (nextLink != null){
            sb.append(" -> ");
            sb.append(nextLink.value());
            nextLink = nextLink.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
