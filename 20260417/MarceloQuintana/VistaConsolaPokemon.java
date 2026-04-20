package Vista;

import Modelo.Pokemon;
import Modelo.PokemonDAODB;
import Vista.Menu;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


    public class VistaConsolaPokemon {
    Scanner sc = new Scanner (System.in);
   
    
    public void run() {
        
   
        try {
            PokemonDAODB modelo = new PokemonDAODB();
            
            
            Menu menuPokemon = new Menu("Menu  Pokemon");
            anyadirOpcionesMenu(menuPokemon);
            int opcion=0;
            do {
                menuPokemon.mostrarMenu();
                
                boolean valorEntero = false;
                
                opcion = menuPokemon.llegirOpcioValida();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Capturar Pokemon ");
                        CapturarPokemon(modelo);
                        break;
                    case 2:
                        System.out.println("Listar tots els Pokemon");
                        listarPokemon(modelo);
                        break;
                    case 3:
                        System.out.println("Evolucionar Pokemon");
                         evolucionarPokemon(modelo); 
                        break;  
                    case 4:
                        System.out.println("Cercar pokemon por nom   ");  
                        buscarPokemon(modelo);
                        break;                   
                        
                        
                        
                        
                    default :
                        
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
            System.out.println(ex.getMessage());
        }
        
      
    }



    private void anyadirOpcionesMenu(Menu menupokemon) {
        menupokemon.afegirOpcio("Capturar Pokemon");
        menupokemon.afegirOpcio("Listar tots els Pokemon ");
        menupokemon.afegirOpcio("Evolucionar Pokemon");
        menupokemon.afegirOpcio("Cercar Pokemon per nom ");
        menupokemon.afegirOpcio("Salir");
        menupokemon.setOpcioSalida(5);




    }

    private void listarPokemon(PokemonDAODB modelo) {

        try {
            List<Pokemon> all =modelo.getListaPokemon();
            
            
            for (Pokemon pokemon : all) {
                System.out.println(pokemon);
            }
            
            
            
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
            
            
    
    }

   private void CapturarPokemon(PokemonDAODB modelo) {

    try {
        System.out.println("Introduce el nom del pokemon:");
        String nombre = sc.nextLine();

        boolean existe = modelo.isExist(nombre);

        if (existe) {

            int filas = modelo.CapturarPokemon(nombre);

            if (filas > 0) {
                System.out.println("Pokemon ya capturado , se ha añadido una mas a la pokedex ");
            } else {
                System.out.println("No se ha podido actualizar");
            }

        } else {

            System.out.println("El pokemon no existe, introduce datos:");

            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Tipo: ");
            String tipo = sc.nextLine();

            System.out.print("Nivel: ");
            int nivel = Integer.parseInt(sc.nextLine());

            Pokemon nuevo = new Pokemon(id, nombre, tipo, nivel, 1);

            int filas = modelo.insertarPokemon(nuevo);

            if (filas > 0) {
                System.out.println("Pokemon insertado correctamente");
            } else {
                System.out.println("Error al insertar");
            }
        }

    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
       
        
        
        

    }
   
   
   
   private void evolucionarPokemon(PokemonDAODB modelo) {
    try {
        System.out.println("Introduce el nom del Pokemon a evolucionar:");
        String nombre = sc.nextLine();
        
        System.out.println("Quants vols evolucionar?");
        int cantidad = sc.nextInt();
        
        boolean poke_evolucionado = modelo.evolucionPokemon(nombre, cantidad);
        
        if (poke_evolucionado) {
            System.out.println(" Evolució realitzada correctament!");
        } else {
            System.out.println("No s'ha pogut evolucionar.");
       
        }
        
    } catch (SQLException ex) {
        System.out.println( ex.getMessage());
    }
}

    private void buscarPokemon(PokemonDAODB modelo) {

  
        try {
            System.out.println("Introduce texto a buscar : ");
            String texto = sc.nextLine();
            
            List<Pokemon> lista = modelo.buscarPorNombre(texto);
            if (lista.isEmpty()){
                System.out.println(" NO se han encontrado pokemons");
            }
            else{
                System.out.println("Se han encontrado : ");
                for (Pokemon pokemon : lista) {
                    System.out.println(pokemon);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
            
            
        
        }



    }
   
   