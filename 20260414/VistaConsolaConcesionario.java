/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Coche;
import Modelo.CocheDAOBD;
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
            CocheDAOBD modelo = new CocheDAOBD();
            
            /* Crear una variable pel model de dades*/
            //LuchadorDAOList repositori = new LuchadorDAOList();
            Menu menuConcesionario = new Menu("Concesionario DAW");
            anyadirOpcionesMenu(menuConcesionario);
            int opcion=0;
            do {
                menuConcesionario.mostrarMenu();
                
                boolean valorEntero = false;
                
                opcion = menuConcesionario.llegirOpcioValida();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Alta");
                        altaCochesito(modelo);
                        break;
                    case 2:
                        System.out.println("Listar");
                        listarCochesito(modelo);
                        break;
                    case 3:
                        System.out.println("Modificar datos de coche");
                        modificarCoche(modelo);
                        break;
                    case 4:
                        System.out.println("Eliminar coche por puertas");
                        deleteCoche(modelo);
                        break;
                        default:
                        if (opcion == menuConcesionario.getOpcioSalida()) {
                          System.out.println("Salir");  
                        } else{
                          System.out.println("opcion incorrecta");
                        }
                       
                        break;
                }
                
            } while (opcion != menuConcesionario.getOpcioSalida());
            
            System.out.println("? Saliendo del programa...");
            sc.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    

    private void anyadirOpcionesMenu(Menu menuLuchador) {
        menuLuchador.afegirOpcio("Alta Coche");
        menuLuchador.afegirOpcio("Listar todos Coches");
        menuLuchador.afegirOpcio("Modificar datos de coche");
        menuLuchador.afegirOpcio("Eliminar coche por puertas");
        menuLuchador.afegirOpcio("Salir");
        menuLuchador.setOpcioSalida(5); //salida
    }

    private void listarCochesito(CocheDAOBD modelo) {
        try {
            List<Coche> all = modelo.getLista();
            for (Coche carro : all) {
                System.out.println(carro);
              
                   
            }   
            System.out.println("Coches encontrados: " + all.size());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void altaCochesito(CocheDAOBD modelo) {
            try{
            System.out.println("Dime la matricula del coche: ");
            String matricula = sc.nextLine().toUpperCase();
                if (matricula.length() == 7) {
                    
        
                    System.out.println("Dime la marca de coche: ");
                    String marca = sc.nextLine();
                    System.out.println("Cuantas puertas tiene: ");
                    int puertas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Es automatico? (si/no)");
                    String respuesta = sc.nextLine();
                    boolean aut;
                    if (respuesta.equalsIgnoreCase("si")) {
                        aut = true;      
                    }else {
                        aut = false;
                    }

                    Coche nuevo = new Coche(matricula, marca, puertas, aut);
                    int cochesitoNuevo = modelo.addCoche(nuevo);
                        if (cochesitoNuevo == 1) {
                            System.out.println("Se ha registrado");                   
                        }else{
                            System.out.println("Operacion fallida");
                        }
        }else{
                    System.err.println("La longitud matricula debe ser 7");
                }
        }catch (SQLException ex){
                System.err.println(ex.getMessage());
        }
    }

    private void modificarCoche(CocheDAOBD modelo) {
        System.out.println("Introduce los datos del coche a modificar");
       try{
            System.out.println("Dime la matricula del coche: ");
            String matricula = sc.nextLine().toUpperCase();
                if (matricula.length() == 7) {

                    System.out.println("Dime la nueva marca de coche: ");
                    String marca = sc.nextLine();
                    System.out.println("Cuantas puertas tiene: ");
                    int puertas = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Es automatico? (si/no)");
                    String respuesta = sc.nextLine();
                    boolean aut;
                    if (respuesta.equalsIgnoreCase("si")) {
                        aut = true;      
                    }else {
                        aut = false;
                    }
                    Coche cocheModifica = new Coche(matricula, marca, 0, true);
                    int update = modelo.modificarCoche(cocheModifica);
                    if (update == 0) {
                        System.err.println("ERROR, NO EXISTE LA MATRICULA " + matricula);
                    }else{
                        System.out.println("Se ha actualizado " + update + " coche");
                    }
                    
                }
                else{
                System.err.println("La matricula tiene que ser de longitud 7");
                } 
                 
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private void deleteCoche(CocheDAOBD modelo){
        try {
            System.out.println("De cuantas puertas quieres eliminar los coches");
            int puerta = sc.nextInt();
            sc.nextLine();
            Coche eliminarCoche = new Coche(" ", " ", puerta, true);
            int cochePuertas = modelo.eliminarCoche(eliminarCoche);
            if (cochePuertas == 0) {
                System.err.println("ERROR, no existe esas puertas");
            }else{
                System.out.println("Se ha eliminado " + cochePuertas + " coches");
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
     private void mostrarDATOSCoche(CocheDAODB modelo) {    
        try {
            Scanner sc = new Scanner (System.in);
            System.out.println("Intoduce la matricula del coche : ");
            String matricula = sc.nextLine().toUpperCase();
            
            Coche car = modelo.mostrardatosCoche(matricula);
            if (car!= null){
            
                System.out.println("DATOS DEL COCHE = ");
                System.out.println("Matricula " + car.getMatricula());
                System.out.println("Marca" + car.getMarca());
                System.out.println("Num puertas " + car.getPuertas());
                System.out.println("Es automatico : " + car.isAutomatico());
            }else{
                System.out.println("No hay ningun coche con la matricula que has escrito ");
            }
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
     }
        
}
