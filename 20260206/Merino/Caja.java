package Objetos;

public class Caja {

    private int numeroCaja;
    private int premio;
    private boolean abierta;

    public Caja(int numeroCaja, int premio) {
        this.numeroCaja = numeroCaja;
        this.premio = premio;
        this.abierta = false;
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public int getPremio() {
        return premio;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void abrir() {
        this.abierta = true;
    }
}
