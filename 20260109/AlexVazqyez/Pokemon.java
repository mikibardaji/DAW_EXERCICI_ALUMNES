package Objectes;
import java.util.Random;

public abstract class Pokemon implements accionesCombate {

    protected final LlistaNoms nombre;
    protected int lifePoints;
    protected boolean vivo;
    
   public Pokemon(LlistaNoms nombre, int lpInicial) {
        this.nombre = nombre;
        this.lifePoints = lpInicial;
        this.vivo = true;
    }

    public LlistaNoms getNombre(){ return nombre; }
    public int getLifePoints(){ return lifePoints; }
    public boolean isVivo(){ return vivo; }

    @Override
    public int atacar() {
        Random r = new Random();
        int fuerza = r.nextInt(11);
        System.out.println(nombre + " ataca con fuerza " + fuerza);
        return fuerza;
    }

    @Override
    public void recibirImpacto(Pokemon atacante) {

        int danio = atacante.atacar();

        if ((atacante instanceof Agua && this instanceof Electrico) ||
            (atacante instanceof Electrico && this instanceof Veneno) ||
            (atacante instanceof Veneno && this instanceof Agua)) {
            danio = (int)(danio * 0.75);
        }

        danio = aplicarDefensasEspeciales(danio);

        lifePoints -= danio;
        if(lifePoints <= 0){
            lifePoints = 0;
            vivo = false;
        }

        mostrarEstadoPokemon();
    }

    protected abstract int aplicarDefensasEspeciales(int danio);

    private void mostrarEstadoPokemon(){
        String estado = (lifePoints > 0) ? "vivo" : "mort";
        System.out.print(nombre + " " + lifePoints + " LP " + estado + " ");
        for(int i=0;i<lifePoints;i++) System.out.print("=");
        System.out.println();
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Pokemon)) return false;
        Pokemon p = (Pokemon)obj;
        return this.nombre == p.nombre;
    }
}
