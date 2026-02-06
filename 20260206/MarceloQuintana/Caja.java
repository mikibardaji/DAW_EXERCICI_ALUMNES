
public class Caja {
     private int premio;
    private boolean abierta;


    public Caja(int premio) {
        this.premio = premio;
        this.abierta = false; 
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
    

    public void abrirCaja() {
        this.abierta = true;
    }
}