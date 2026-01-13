package objetos;

import java.util.Random;

public abstract class Pokemon {

    protected final String nomPokemon;
    protected int LP;
    protected boolean Viu;

    public Pokemon() {
        this.nomPokemon = "Pikachu";
        this.Viu = true;
    }

    public String getNomPokemon() {
        return nomPokemon;
    }

    public int getLP() {
        return LP;
    }

    public boolean isViu() {
        return Viu;
    }

    public int atacar() {
        Random rd = new Random();
        int força = rd.nextInt(11);
        System.out.println("El Pokémon " + nomPokemon + " ataca amb una força de " + força);
        return força;
    }

    public void recibirImpacto(Pokemon atacante) {

        int dany = atacante.atacar();

        if (atacante instanceof agua && this instanceof electrico){
            dany = (int)(dany * 0.75);
        }
            
        if  (atacante instanceof electrico && this instanceof veri) {
            dany = (int)(dany * 0.75);
        }
        
        if  (atacante instanceof veri && this instanceof agua) {
            dany = (int)(dany * 0.75);
        }
        
        else {
            rebreAtac(dany);
        }

        mostrarEstadoPokemon();
    }

    protected void rebreAtac(int dany) {
        LP -= dany;
        if (LP <= 0) {
            LP = 0;
            Viu = false;
        }
    }

   // private void mostrarEstadoPokemon() {
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pokemon)) return false;
        Pokemon other = (Pokemon) obj;
        return this.nomPokemon.equals(other.nomPokemon);
    }
}



