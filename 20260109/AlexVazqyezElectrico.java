package Objectes;

public final class Electrico extends Pokemon {

    private int superAtac = 2;

    public Electrico() {
        super(LlistaNoms.Pikachu, 40);
    }

    public Electrico(LlistaNoms nombre) {
        super(nombre, 40);
    }

    @Override
    public int atacar() {
        int base = super.atacar();
        int total = base + superAtac;
        superAtac++;
        return total;
    }

    @Override
    protected int aplicarDefensasEspeciales(int danio) {
        return danio;
    }
}
