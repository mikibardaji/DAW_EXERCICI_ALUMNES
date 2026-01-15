package Objectes;
import java.util.Scanner;


public final class Veneno extends Pokemon {

    private boolean defensa = false;

    public Veneno() {
        super(LlistaNoms.Pikachu, 50);
    }

    public Veneno(LlistaNoms nombre) {
        super(nombre, 50);
    }

    @Override
    protected int aplicarDefensasEspeciales(int danio) {
        if(lifePoints < 15) defensa = true;
        if(defensa) return danio / 2;
        return danio;
    }
}

