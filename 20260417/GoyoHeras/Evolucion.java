/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author ghe2503
 */
public class Evolucion {
    private String pokemon_base;
    private String pokemon_evolucionat;

    public Evolucion(String pokemon_base, String pokemon_evolucionat) {
        this.pokemon_base = pokemon_base;
        this.pokemon_evolucionat = pokemon_evolucionat;
    }

    public String getPokemon_base() {
        return pokemon_base;
    }

    public String getPokemon_evolucionat() {
        return pokemon_evolucionat;
    }

    public void setPokemon_base(String pokemon_base) {
        this.pokemon_base = pokemon_base;
    }

    public void setPokemon_evolucionat(String pokemon_evolucionat) {
        this.pokemon_evolucionat = pokemon_evolucionat;
    }
}
