/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author jpa2698
 */
public final class PokemonVeri extends Pokemon{

     private boolean defensaActiva = false;
    
    public PokemonVeri(int lifePoint, boolean viu, String nomPoke) {
        super(lifePoint, viu, nomPoke);
    }
    
      public PokemonVeri() {
         super();
        
        lifePoint = 50;
    }
     public void recibirImpacto(Pokemon atacante) {

        int dany = atacante.atacar();

        // Activar defensa si LP < 15
        if (lifePoint < 15) {
            defensaActiva = true;
        }

        if (defensaActiva) {
            System.out.println(nomPokemon + " activa defensa! Daño reducido a la mitad");
            dany = dany / 2;
        }

        aplicarDany(dany, atacante);
    }
    
}
