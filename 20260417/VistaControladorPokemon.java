package Vista;

import Modelo.Pokemon;
import Modelo.PokemonDAOBD;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class VistaControladorPokemon {

    public void run() {

        Scanner sc = new Scanner(System.in);

        try {
            PokemonDAOBD modelo = new PokemonDAOBD();

            Menu menuPokemon = new Menu("Pokemons DAW");
            anyadirOpcionesMenu(menuPokemon);

            int opcion = 0;

            do {
                menuPokemon.mostrarMenu();

                opcion = menuPokemon.llegirOpcioValida();

                switch (opcion) {
                    case 1:
                        System.out.println("Capturar Pokemons");
                        capturarPokemons(modelo);
                        break;
                    case 2:
                        System.out.println("Listar Pokemons");
                        listarPokemons(modelo);
                        break;
                    case 3:
                        System.out.println("Modificar datos de Pokemon");
                        break;
                    case 4:
                        System.out.println("Eliminar Pokemon");
                        break;
                    default:
                        if (opcion == menuPokemon.getOpcioSalida()) {
                            System.out.println("Salir");
                        } else {
                            System.out.println("opcion incorrecta");
                        }
                        break;
                }

            } while (opcion != menuPokemon.getOpcioSalida());

            System.out.println("Saliendo del programa...");
            sc.close();

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void anyadirOpcionesMenu(Menu menuPokemon) {
        menuPokemon.afegirOpcio("Capturar Pokemons");
        menuPokemon.afegirOpcio("Listar todos Pokemon");
        menuPokemon.afegirOpcio("Borrar Pokemon");
        menuPokemon.afegirOpcio("Listar Pokemon por tipo");
        menuPokemon.afegirOpcio("Añadir Pokemon en posicion");
        menuPokemon.afegirOpcio("Cambiar nombre Pokemon");
        menuPokemon.afegirOpcio("Salir");
        menuPokemon.setOpcioSalida(7);
    }

    private void listarPokemons(PokemonDAOBD modelo)  {
        try {
            List<Pokemon> all = modelo.getLista();

            for (Pokemon poke : all) {
                System.out.println(poke);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
   private void capturarPokemons(PokemonDAOBD modelo) {
    Scanner sc = new Scanner(System.in);

    try {
        System.out.println("Pon el nombre del Pokemon: ");
        String nom = sc.nextLine();

        Pokemon buscado = modelo.buscarPokemonPorNombre(nom);

        if (buscado == null) {
            System.out.println("Pon el id del pokemon capturado: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Tipus: ");
            String tipus = sc.nextLine();

            System.out.println("Pon el nivel del Pokemon: ");
            int nivell = sc.nextInt();

            Pokemon nuevo = new Pokemon(id, nom, tipus, nivell, 1);

            modelo.addPokemon(nuevo);

            System.out.println("Pokemon capturado y añadido correctamente");

        } else {
            modelo.incrementarCapturados(nom);

            System.out.println("Pokemon ya existia, capturats incrementado");
        }

    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
}
}