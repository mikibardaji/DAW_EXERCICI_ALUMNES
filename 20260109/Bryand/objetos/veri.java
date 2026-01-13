package objetos;

public class veri extends Pokemon {

    private boolean defensa;

    public veri() {
        this.LP = 50;
        this.defensa = false;
    }

    public void aplicarDany(int dany) {
        if (LP < 15) {
            defensa = true;
        }

        if (defensa) {
            dany = dany / 2;
        }

        rebreAtac(dany);
    }
}

