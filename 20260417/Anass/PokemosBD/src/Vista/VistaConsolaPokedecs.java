/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Pokemon;
import Modelo.PokemonDAOBD;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aba7500
 */
public class VistaConsolaPokedecs {
  Scanner sc = new Scanner (System.in);
  
  public void run(){
 
      try {
          PokemonDAOBD modelo = new PokemonDAOBD();
          Menu menuPokemon = new Menu("--MENU POKEMON---");
          menuPokemon.afegirOpcio("Capturar Pokémon");
          menuPokemon.afegirOpcio("Llistar tots els Pokémon");
          menuPokemon.afegirOpcio("Evolucionar Pokémon");
          menuPokemon.afegirOpcio("Cercar Pokémon per nom");
          menuPokemon.afegirOpcio("SALIR");
          menuPokemon.setOpcioSalida(5);
          int opcion = 0;
          
          
          do {
              menuPokemon.mostrarMenu();
              opcion = menuPokemon.llegirOpcioValida();
              switch (opcion) {
                  case 1:
                      System.out.println("Has seleccionado: Capturar Pokémon");
                      
                      break;
                  case 2:
                      System.out.println("Has seleccionado: Llistar tots els Pokémon");
                      llistarPokemons(modelo);
                      break;
                  case 3:
                      System.out.println("Has seleccionado: Evolucionar Pokémon");
                      break;
                  case 4:
                      System.out.println("Has seleccionado: Cercar Pokémon per nom");
                      break;                  
                  default:
                      if (opcion == menuPokemon.getOpcioSalida()){
                          System.out.println("Saliendo");
                      } else System.err.println("Opcion incorrecta");
                      break;
              }
              
          } while (opcion != menuPokemon.getOpcioSalida());
      } catch (ClassNotFoundException ex) {
         System.err.println(ex.getMessage());
      }



}

    private void llistarPokemons(PokemonDAOBD modelo) {
      try {
          List<Pokemon> all = modelo.getLista();
          System.out.println("Pokemons encontrados -> " + all.size());
          for (Pokemon pok : all) {
              System.out.println(pok);
          }
      } catch (SQLException ex) {
          System.err.println(ex.getMessage());
      }
    }
  
}
