package src.fr.umlv.fight;


// On ne fait pas un record car la vie doit pouvoir être modifiée.

import java.util.Objects;

public class Robot {
    final private String name;
    private int hp;

    public Robot(String name) {
        Objects.requireNonNull(name,"Robot must have a name!");
        this.name = name;
        hp = 10;
    }

    // Protected pour n'être accesible que par la classe et ses sous classes;
    protected boolean rollDice(){
        // Robot has a perfect accuracy !
        return false;
    }

    public int fire(Robot enemy){
        if (enemy.hp() <= 0)
            throw new IllegalArgumentException("You cannot shoot someone that's already dead ! STOP");

        if (this.rollDice()){
            System.out.println(this.name + " a loupé! aie aie");
            return 0;
        }
        System.out.println(this.name + " a envoyé un bourre-pif à " + enemy.name + " causant 2 dégat !");
        enemy.hp -= 2;
        return 1;
    }
    public boolean isDead(){
        return hp <= 0;
    }

    // Utilisé pour que fighter puisse changer les hp
    protected void changeHP(int hp){
        this.hp = hp;
    }
    public String name(){
        return this.name;
    }

    public int hp(){
        return this.hp;
    }
    @Override
    public String toString() {
        return "Robot " + name;
    }
}
