package objetos;

public class agua extends Pokemon {

    private int corassa;

    public agua() {
        this.LP = 35;
        this.corassa = 3;
    }

    public void aplicarDanyo(int dany) {
        if (corassa > 0) {
            corassa--;
        } else {
            rebreAtac(dany);
        }
    }
}
