package Objetos;
import java.util.Random;
public abstract class Pokemon implements AccionesCombate {
    
    protected final  String nomPokemon  ;
    protected int lifePoint;
    protected boolean viu;
     

    public Pokemon(int lifePoint, boolean viu, String nomPokemon) {
        
       this.nomPokemon = nomPokemon;
        this.lifePoint = lifePoint;
        this.viu = viu;
    }
    
    public Pokemon (){
    nomPokemon = "PikACHU";
    viu = true;
    
    
    }

    public String getNomPokemon() {
        return nomPokemon;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public boolean isViu() {
        return viu;
    }
    
    
     @Override  //object
    public boolean equals(Object obj) {
        if (obj == null)
        {
            return false; //no es igual
        }
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Pokemon))
        {
            return false;
        }
       
        Pokemon other = (Pokemon) obj;
        
        if (!this.nomPokemon.equals(other.nomPokemon))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
     public int atacar() {
        Random r = new Random();
        int fuerza = r.nextInt(11); 
        System.out.println(nomPokemon + " ataca con " + fuerza);
        return fuerza;
    }
    
      protected void aplicarDany(int dany, Pokemon atacante) {

        
        if ((atacante instanceof PokemonAigua && this instanceof PokemonElectric) ||
            (atacante instanceof PokemonElectric && this instanceof PokemonVeri) ||
            (atacante instanceof PokemonVeri && this instanceof PokemonAigua)) {

            dany = (int)(dany * 0.75);
        }

      
        lifePoint -= dany;

       
        if (lifePoint <= 0) {
            lifePoint = 0;
            viu = false;
            System.out.println(nomPokemon + " esta fuera de combate ");
        }
    }


     private void mostrarEstadoPokemon() {
        String estat = (viu) ? "viu" : "mort";

        System.out.print(nomPokemon + " " + lifePoint + " LP " + estat + " ");

        for (int i = 0; i < lifePoint; i++) {
            System.out.print("=");
        }
        System.out.println(); 
    }


    protected final void mostrarDespuesImpacto() {
        mostrarEstadoPokemon();
    }
    
}