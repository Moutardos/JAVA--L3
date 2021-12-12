package src.fr.umlv.fight;


public class Arena {

    static public Robot fight(Robot fighter1, Robot fighter2) {

        // alterne entre true et false chaque tour
        boolean turn = false;
        while (! (fighter1.isDead() || fighter2.isDead()) ){

            if (turn)
                fighter1.fire(fighter2);
            else
                fighter2.fire(fighter1);
            System.out.println("PV RESTANT : " + fighter1.name() + " " +fighter1.hp() );
            System.out.println("PV RESTANT : " + fighter2.name() + " " +fighter2.hp() );

            turn = !turn;
        }

        return fighter2.isDead() ? fighter1 : fighter2;
    }
}

