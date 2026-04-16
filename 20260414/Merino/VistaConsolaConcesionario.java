/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Coche;
import Modelo.CocheDAODB;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class VistaConsolaConcesionario {
    Scanner sc = new Scanner(System.in);
    
    
    public void run()
    {   
        try {
            CocheDAODB modelo = new CocheDAODB();
            
            /* Crear una variable pel model de dades*/
            //LuchadorDAOList repositori = new LuchadorDAOList();
            Menu menuConcesionario = new Menu("Concesionario DAW");//
            anyadirOpcionesMenu(menuConcesionario);
            int opcion=0;
            do {
                menuConcesionario.mostrarMenu();
                
                boolean valorEntero = false;
                
                opcion = menuConcesionario.llegirOpcioValida();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Alta");
                        altaCoche(modelo);
                        break;
                    case 2:
                        System.out.println("Listar");
                        listarCoches(modelo);
                        break;
                    case 3:
                        System.out.println("Modificar datos");
                        modificarCoches(modelo);
                        break;
                    case 4:
                        System.out.println("Eliminar Coche por nº de puertas");
                        eliminarCochesPorPuerta(modelo);
                        break;
                    case 5:
                        System.out.println("Consultar las características del coche");
                        concultarCaractCoche(modelo);
                        break;
                    default:
                        if (opcion == menuConcesionario.getOpcioSalida()) {
                             System.out.println("Salir");
                        }
                        else {
                            System.out.println("Opción incorrecta.");
                        }
                        //borrarLuchador(repositori);
                        break;
                }
                
            } while (opcion != menuConcesionario.getOpcioSalida());
            
            System.out.println("? Saliendo del programa...");
            sc.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void anyadirOpcionesMenu(Menu menuConcesionario) {
        menuConcesionario.afegirOpcio("Alta Ccohe");
        menuConcesionario.afegirOpcio("Listar todos Coche");
        menuConcesionario.afegirOpcio("Modificar datos de Coche");
        menuConcesionario.afegirOpcio("Eliminar Coche por nº de puertas");
        menuConcesionario.afegirOpcio("Consultar características Coche");
        menuConcesionario.afegirOpcio("Salir");
        menuConcesionario.setOpcioSalida(6); //salida
    }

    private void listarCoches(CocheDAODB modelo) {
        try {
            
            List<Coche> all = modelo.getLista();
            for (Coche car : all) {
                System.out.println(car);
            }
        System.out.println("Coches encontrados: " + all.size());
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void altaCoche(CocheDAODB modelo) {
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime la matrícula del coche:");
            String matricula = sc.nextLine().toUpperCase();
            if (matricula.length() == 7) {
            System.out.println("Dime la marca:");
            String marca = sc.nextLine();
            System.out.println("Dime el número de puertas:");
            int puertas = sc.nextInt();
            sc.nextLine();
            System.out.println("¿Es automático?");
            String respuesta = sc.nextLine();
            boolean autom;
            if (respuesta.equalsIgnoreCase("Sí")) {
                autom = true;
            } else {
                autom = false;
            }
            
            Coche nuevo = new Coche(matricula, marca, puertas, autom);
            int cocheNuevo = modelo.addCoche(nuevo);
            if (cocheNuevo == 1) {
                System.out.println("El coche se ha registrado correctamente.");
            } else {
                System.out.println("Operación fallida.");
            }
        } else {
                System.err.println("La longitud de la matrícula debe ser 7.");
            }
            }
             catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    }

    private void modificarCoches(CocheDAODB modelo) {
        Scanner sc = new Scanner(System.in);
            
            System.out.println("Dime la matrícula del coche que quieres modificar:");
            String matricula = sc.nextLine().toUpperCase();
            if (matricula.length() == 7) {
            try {
                System.out.println("Dime la nueva marca:");
                String marca = sc.nextLine();
                System.out.println("Dime el número de puertas:");
                int puertas = sc.nextInt();
                sc.nextLine();
                System.out.println("¿Es automático?");
                String respuesta = sc.nextLine();
                boolean autom;
                if (respuesta.equalsIgnoreCase("Sí")) {
                    autom = true;
                } else {
                    autom = false;
                }
                Coche cochesModificar = new Coche (matricula, marca, puertas, autom);
                int update = modelo.modificarCar(cochesModificar);
                
                if (update == 0) {
                    System.err.println("Matrícula no existente" + matricula);
                } else {
                    System.out.println("Se han actualizado: " + update + " coche.");
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            } else {
                    System.err.println("La longitud de la matrícula debe ser 7.");
            }
    }

    private void eliminarCochesPorPuerta(CocheDAODB modelo) {
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("¿De cuántas puertas quieres borrar el coche?");
            int puertas = sc.nextInt();
            
            Coche cochesEliminarPorPuerta = new Coche("", "", puertas, true);
            int cocheEliminado = modelo.eliminarPorPuertas(cochesEliminarPorPuerta);
            
            if (cocheEliminado > 0) {
                System.out.println("Coche/s eliminado/s correctamente.");
            } else {
                System.err.println("No se ha podido eliminar.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void concultarCaractCoche(CocheDAODB modelo) {
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Dime la matrícula del coche que quieres ver las caracteríticas:");
           String matricula = sc.nextLine();

            Coche cochesBuscarCaract = new Coche(matricula, "", 0, true);
            Coche buscarCoche = modelo.buscarCocheCaract(cochesBuscarCaract);

            if (buscarCoche != null) {
                System.out.println("No existe ningún coche con esa matrícula.");
            } else {
                System.out.println("Características del coche:");
                System.out.println("Matrícula: " + buscarCoche.getMatricula());
                System.out.println("Marca: " + buscarCoche.getMarca());
                System.out.println("Puertas: " + buscarCoche.getPuertas());
                System.out.println("Automático: " + buscarCoche.isAutomatico());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
