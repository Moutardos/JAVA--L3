package src.fr.umlv.fight;
import java.util.Random;

public class Fighter extends Robot{
    private Random generator;
    public Fighter(String name, int hp) {
        super(name);
        changeHP(hp);
        generator = new Random();
    }

    @Override
    protected boolean rollDice(){
        return (generator.nextBoolean());
    }
    @Override
    public String toString() {
        return "Fighter " +  name();
    }

}
