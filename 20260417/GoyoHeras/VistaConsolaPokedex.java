/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokedex.Pokemon;
import pokedex.PokemonDAODB;

/**
 *
 * @author ghe2503
 */
public class VistaConsolaPokedex {

    Scanner sc = new Scanner(System.in);

    public void run() throws ClassNotFoundException {
        try {
            PokemonDAODB modelo = new PokemonDAODB();
            Menu menuPokemons = new Menu("Pokedex DAW");
            anyadirOpcionesMenu(menuPokemons);
            int opcion = 0;

            do {
                menuPokemons.mostrarMenu();
                opcion = menuPokemons.llegirOpcioValida();

                switch (opcion) {
                    case 1:
                        System.out.println("Capturar Pokemon");
                        capturarPoke(modelo);
                        break;
                    case 2: {
                        System.out.println("Llistar tots els Pokemon");
                        listarPoke(modelo);
                        break;
                    }
                    case 3: {
                        System.out.println("Evolucionar Pokemon");
                        break;
                    }
                    case 4: {
                        System.out.println("Cercar Pokemon per nom");
                        break;
                    }
                    default: {
                        if (opcion == menuPokemons.getOpcioSalida()) {
                            System.out.println("Salir");
                        } else {
                            System.out.println("Opcion incorrecta");
                        }
                    }
                }
            } while (opcion != menuPokemons.getOpcioSalida());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void anyadirOpcionesMenu(Menu menuPokedex) {
        menuPokedex.afegirOpcio("Capturar Pokemon");
        menuPokedex.afegirOpcio("Llistar tots els Pokemon");
        menuPokedex.afegirOpcio("Evolucionar Pokemon");
        menuPokedex.afegirOpcio("Cercar Pokemon per nom");
        menuPokedex.afegirOpcio("Salir");
        menuPokedex.setOpcioSalida(5); //salida
    }

    private void listarPoke(PokemonDAODB modelo) throws SQLException {
        try {
            List<Pokemon> all = modelo.getLista();
            for (Pokemon pok : all) {
                System.out.println(pok);
            }
            System.out.println("Pokemons encontrados: " + all.size());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void capturarPoke(PokemonDAODB modelo) {
        try {
            System.out.print("¿Qué pokemon has capturado? ");
            String captura = sc.nextLine();

            boolean existente = modelo.comprobarExiste(captura);

            if (existente) {
                int poki = modelo.actualizarCaptura(captura);
                if (poki > 0) {
                    System.out.println("Pokemon capturado! Ahora tienes más ejemplares.");
                } else {
                    System.out.println("Error al actualizar la captura.");
                }
            } else {
                System.out.println("¡Es un nuevo Pokémon para la Pokédex!");
                System.out.print("Dime el ID (número de Pokédex): ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Dime el tipo: ");
                String tipus = sc.nextLine();

                System.out.print("Dime el nivel: ");
                int nivell = sc.nextInt();
                sc.nextLine();

                int insertado = modelo.inserirPokemon(id, captura, tipus, nivell);
                if (insertado > 0) {
                    System.out.println("Nuevo Pokémon registrado en la Pokédex!");
                } else {
                    System.out.println("Error al registrar el nuevo Pokémon.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error en la base de datos: " + ex.getMessage());
        }
    }

    private void evolucionarPokemon(PokemonDAODB modeloPokemon, EvolucioDAO modeloEvolucio) {
        try {
            System.out.print("Introduce el nombre del Pokémon a evolucionar: ");
            String nomBase = sc.nextLine();

            boolean existe = modeloPokemon.comprobarExiste(nomBase);
            if (!existe) {
                System.out.println("Ese Pokémon no está en tu Pokédex.");
                return;
            }

            String evolucion = modeloEvolucio.obtenirEvolucio(nomBase);

            if (evolucion == null) {
                System.out.println(nomBase + " no tiene evolución conocida.");
            } else {
                System.out.println(nomBase + " puede evolucionar a " + evolucion + "!");
                System.out.print("¿Quieres evolucionarlo? (s/n): ");
                String respuesta = sc.nextLine();

                if (respuesta.equalsIgnoreCase("s")) {
                    System.out.println(nomBase + " ha evolucionado a " + evolucion + "!");
                } else {
                    System.out.println("Evolución cancelada.");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private void cercarPerNom(PokemonDAODB modelo) {
        try {
            System.out.print("Introduce el nombre o parte del nombre: ");
            String texto = sc.nextLine();

            List<Pokemon> resultados = modelo.buscarPerNom(texto);

            if (resultados.isEmpty()) {
                System.out.println("No se encontraron Pokémon con: " + texto);
            } else {
                System.out.println("Coincidencias encontradas (" + resultados.size() + "):");
                for (Pokemon p : resultados) {
                    System.out.println("   " + p);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error en la búsqueda: " + ex.getMessage());
        }
    }
}
