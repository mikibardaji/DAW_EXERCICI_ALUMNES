package Objectes;

public class Agua extends Pokemon {

    private int corassa = 3;

    public Agua() {
        super(LlistaNoms.Pikachu, 35);
    }

    public Agua(LlistaNoms nombre) {
        super(nombre, 35);
    }

    @Override
    protected int aplicarDefensasEspeciales(int danio) {
        if(corassa > 0){
            corassa--;
            return 0;
        }
        return danio;
    }
}
