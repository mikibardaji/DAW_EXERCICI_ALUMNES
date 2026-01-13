package objetos;

public class agua extends Pokemon {

    private int corassa;

    public agua() {
        this.LP = 35;
        this.corassa = 3;
    }

    public void aplicarDany(int dany) {
        if (corassa > 0) {
            corassa--;
        } else {
            rebreAtac(dany);
        }
    }
}

