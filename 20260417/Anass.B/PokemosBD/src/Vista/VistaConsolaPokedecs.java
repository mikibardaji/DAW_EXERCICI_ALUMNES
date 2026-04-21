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
          menuPokemon.afegirOpcio("Borrar pokemon");
          menuPokemon.afegirOpcio("SALIR");
          menuPokemon.setOpcioSalida(6);
          int opcion = 0;
          
          
          do {
              menuPokemon.mostrarMenu();
              opcion = menuPokemon.llegirOpcioValida();
              switch (opcion) {
                  case 1:
                      System.out.println("Has seleccionado: Capturar Pokémon");
                      anyadirPoke(modelo);
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
                      buscarPorNombre(modelo);
                      break;         
                  case 5:
                      System.out.println("Has seleccionado: Borrar pokemon");
                      borrarPokemon(modelo);
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

    private void anyadirPoke(PokemonDAOBD modelo) {
      try {
          Scanner sc = new Scanner (System.in);
          
          System.out.print("Itriduce el nombre del pokemon que quieres añadir  ");
          String nombre = sc.nextLine();
          
          if(!modelo.existencia(nombre)){
              
              System.out.print("Introduce el id  ");
              int id = sc.nextInt();
              sc.nextLine();
              
              System.out.print("Que tipo és?  ");
              String tipo = sc.nextLine();
              System.out.print("Cual es el nivel?  ");
              int nivel = sc.nextInt();
              sc.nextLine();
              
            Pokemon nuevo = new Pokemon(id, nombre, tipo, nivel, 1);
            
            int pokemonNuevo = modelo.addPokemon(nuevo);
            
            if(pokemonNuevo == 1){
                System.out.println("Se ha registrado un nuevo Pokemon");
            } else System.err.println("Operacion fallida");
              
          }else System.err.println("El pokemon " + nombre + " ya existe.");
      } catch (SQLException ex) {
        ex.getMessage();
      }
        
    }

    private void buscarPorNombre(PokemonDAOBD modelo) {
      try {
          Scanner sc = new Scanner (System.in);
          System.out.print("Dime el nombre del pokemon que quieres busacar  ");
          String nombre = sc.nextLine();
          
          Pokemon buscar = new Pokemon(0, nombre, "", 0, 1);

         Pokemon pok = modelo.getBuscarPoke(buscar);
         
          if(pok == null){
              System.err.println("No se ha encontrado ningun Pokemon que se llame " + nombre);         
          } else { System.out.println("Pokemon " + nombre + " enocntrado");
          
              System.out.println(pok);
          }
      } catch (SQLException ex) {
         ex.getMessage();
      }

    }

    private void borrarPokemon(PokemonDAOBD modelo) {
      try {
          Scanner sc = new Scanner (System.in);
          System.out.print("Introduce el nombre del pokemon  ");
          String nombre = sc.nextLine();
          
          Pokemon borrar = new Pokemon(0, nombre, "", 0, 0);
          
          int borr = modelo.getBorrar(borrar);
          
          if(borr == 0){
              System.err.println("No se ha encontrado ningunn pokemon con el nombre " + nombre);
          } else System.out.println("Se ha borrado correctamente el pokemon " + nombre);
          
      } catch (SQLException ex) {
          ex.getMessage();
      }
       
       
    }
  
}
