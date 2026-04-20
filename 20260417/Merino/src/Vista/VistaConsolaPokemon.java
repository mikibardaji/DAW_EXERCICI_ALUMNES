/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Model.PokemonDAODB;
import Model.Pokemon;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cme9861
 */
public class VistaConsolaPokemon {
   Scanner sc = new Scanner (System.in);


    public void run() {


       try {
           Menu menuPokemon = new Menu("Menu Pokemon");
           anyadirOpcionesMenu(menuPokemon);
           int opcion=0;
           
           PokemonDAODB modelo = new PokemonDAODB();
           do {
               menuPokemon.mostrarMenu();
               
               boolean valorEntero = false;
               
               opcion = menuPokemon.llegirOpcioValida();
               
               switch (opcion) {
                   case 1:
                       System.out.println("Capturar Pokemon");
                       capturarPokemon(modelo);
                       // metodo();
                       break;
                   case 2:
                       System.out.println("Listar todos los Pokemons");
                       listarTodosPokemons(modelo);
                       break;
                   case 3:
                       System.out.println("Buscar por nombre");
                       buscarPorNombre(modelo);
                       break;
                   case 4:
                       System.out.println("Evolucionar Pokemon");
                       evolucionarPokemon(modelo);
                       break;
                   default:
                       if (opcion == menuPokemon.getOpcioSalida()){
                           System.out.println("Salir");
                       }
                       else {
                           System.out.println(" Opcion incorrecta ");
                       }
                       break;
               }
           } while (opcion != menuPokemon.getOpcioSalida());
           
           System.out.println("? Saliendo del programa...");
           sc.close();
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(VistaConsolaPokemon.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    private void anyadirOpcionesMenu(Menu menupokemon) {
        menupokemon.afegirOpcio("Capturar Pokemon");
        menupokemon.afegirOpcio("Listar todos los Pokemons");
        menupokemon.afegirOpcio("Buscar por nombre");
        menupokemon.afegirOpcio("Evolucionar Pokemon");
        menupokemon.afegirOpcio("Salir");
        menupokemon.setOpcioSalida(5);
    }

    private void listarTodosPokemons(PokemonDAODB modelo) {
       try {
           List <Pokemon> todos = modelo.listarPokemons();
           for (Pokemon Poke : todos) {
               System.out.println(Poke);
           }
           
           System.out.println("Pokemos encontrados: " + todos);
           
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
    }

    private void capturarPokemon(PokemonDAODB modelo) {
       try {
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Nombre del pokemon capturado:");
           String pokeCapturado = sc.nextLine();
                    
           boolean existe = modelo.pokemonExiste(pokeCapturado);           
           
           if (!existe) {
               System.out.println("Dime el ID del pokemon capturado:");
               int id = sc.nextInt();
               sc.nextLine();
               System.out.println("Dime de qué tipo es:");
               String tipus = sc.nextLine();
               System.out.println("Dime el nivel:");
               int nivell = sc.nextInt();
               sc.nextLine();
               
               Pokemon anyadirPokemonCapturado = new Pokemon(id, pokeCapturado, tipus, nivell, 1);
               int filasInsertadas = modelo.insertarPokemon (anyadirPokemonCapturado);
               
               if (filasInsertadas == 1) {
                   System.out.println("Pokemon registrado correctamente.");
               } else {
                   System.out.println("El pokemon no se ha podido añadir.");
               }
           } else{
               int filasActualizadas = modelo.aumentarCapturados(pokeCapturado);
               if (filasActualizadas == 1) {
                   System.out.println("El pokemon ya existía. Capturas incrementadas correctamente.");
               } else {
                   System.out.println("No se ha podido actualizar.");
               }
           }
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
    }

    private void buscarPorNombre(PokemonDAODB modelo) {
       try {
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Nombre del pokemon que quieres buscar:");
           String nom = sc.nextLine();
           
            List<Pokemon> porNombre = modelo.listarPorNombre(nom);
            if (porNombre.isEmpty()) {
            System.out.println("No hay coincidencias.");
            } else {
            for (Pokemon nombrePokemon : porNombre) {
               System.out.println(nombrePokemon);
           }
           
           }
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
    }

    private void evolucionarPokemon(PokemonDAODB modelo) {
       try {
           Scanner sc = new Scanner(System.in);
           System.out.println("Nombre del pokemon que quieres evolucionar:");
           String nom = sc.nextLine();
           
           String evolucionado = modelo.pokemonEvolucionado(nom);
           
           if (evolucionado == null) {
               System.out.println("Este pokemon no tiene evolución.");
           } else {           
           System.out.println("¿Cuántos quieres evolucionar?");
           int cantidadAEvolucionar = sc.nextInt();
           sc.nextLine();
           
           int capturats = modelo.obtenerCapturats(nom);
           if (cantidadAEvolucionar > capturats) {
               System.out.println("No tienes suficientes pokemon capturados.");
            } else {
               
               int filas = modelo.pokemonEvolution(nom, evolucionado, cantidadAEvolucionar);
               if (filas >= 2) {
                    System.out.println("Pokemon evolucionado correctamente.");
                } else {
                    System.out.println("No se ha podido evolucionar.");
                }
           }
          }           
       } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }
    }

}
