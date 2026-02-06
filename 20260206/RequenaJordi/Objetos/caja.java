package Objetos;

public class caja {

    private int premio;
    private boolean abierta;

    public caja( int premio) {
        this.abierta = false;
        this.premio = premio;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public void abrir() {
        this.abierta = true;
    }

    public boolean estaCerrada() {
        return !abierta;
    }
    

}
