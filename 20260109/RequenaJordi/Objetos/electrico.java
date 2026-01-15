package Objetos;

public class electrico extends Pokemon {

    private int superAtac;

    public electrico() {
        this.LP = 40;
        this.superAtac = 2;
    }

    @Override
    public int atacar() {
        int base = super.atacar();
        int total = base + superAtac;
        superAtac++;
        return total;
    }
}
