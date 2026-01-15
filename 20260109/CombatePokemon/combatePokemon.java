package CombatePokemon;

import Objetos.Pokemon;
import Objetos.agua;
import Objetos.electrico;

public class combatePokemon {
    public static void main(String[] args) {

        Pokemon p1 = new agua();
        Pokemon p2 = new electrico();

        while (p1.isViu() && p2.isViu()) {
            p1.recibirImpacto(p2);
            if (p1.isViu()) {
                p2.recibirImpacto(p1);
            }
        }
    }
}
