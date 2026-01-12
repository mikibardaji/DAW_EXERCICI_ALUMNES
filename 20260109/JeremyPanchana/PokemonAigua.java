/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author jpa2698
 */
public class PokemonAigua  extends Pokemon{
    
    private int corassa = 3;


    public PokemonAigua(int lifePoint, boolean viu, String nomPokemon) {
        super(lifePoint, viu, nomPokemon);
    }
    
    
     public PokemonAigua() {
         super();
        
        lifePoint = 35;
    }
      public void recibirImpacto(Pokemon atacante) {
        int damage = atacante.atacar();

        if (corassa > 0) {
            System.out.println(nomPokemon + " bloqueja el dany,  Corassa restant: " + (corassa-1));
            corassa--;
            return;
        }

   aplicarDany(damage, atacante);
    }



    
}
