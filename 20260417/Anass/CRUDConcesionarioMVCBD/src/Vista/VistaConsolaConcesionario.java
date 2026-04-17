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
            Menu menuConcesioanrio = new Menu("Concesionario DAW");
            anyadirOpcionesMenu(menuConcesioanrio);
            int opcion=0;
            do {
                menuConcesioanrio.mostrarMenu();
                
                boolean valorEntero = false;
                
                opcion = menuConcesioanrio.llegirOpcioValida();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado dar alta coche");
                        altaCoches(modelo);
                        break;
                    case 2:
                        System.out.println("Has seleccionado Listar coches");
                        listarCoches(modelo);
                        break;
                    case 3:
                        System.out.println("Has seleccionado modificar datos");
                        modificarCoches(modelo);
                        break;
                    case 4:
                        System.out.println("Has seleccionado borrar coches por puertas");
                        deleteCarPuertas(modelo);
                        break;
                    case 5:
                        System.out.println("Has seleccionado buscar carateristicas por matricula");
                        consularCaracteristicas(modelo);
                        break;
                    default:
                        if (opcion == menuConcesioanrio.getOpcioSalida()){
                        System.out.println("SALIR");
                        } else System.out.println("Opcion incorrecta");
                        break;
                  
                }
                
            } while (opcion != menuConcesioanrio.getOpcioSalida());
            
            System.out.println("Saliendo del programa...");
            sc.close();
        } catch (ClassNotFoundException ex) {
               System.out.println(ex.getMessage());
        }
    }

    

    private void anyadirOpcionesMenu(Menu menuConcesioanrio) {
        menuConcesioanrio.afegirOpcio("Alta Coches");
        menuConcesioanrio.afegirOpcio("Listar todos Coches");
        menuConcesioanrio.afegirOpcio("Modificar datos de coche");
        menuConcesioanrio.afegirOpcio("Borrar coche por puerta");
        menuConcesioanrio.afegirOpcio("Caracteristicas coche matricula");
        menuConcesioanrio.afegirOpcio("Salir");
        menuConcesioanrio.setOpcioSalida(6); //salida
    }

    private void listarCoches(CocheDAODB modelo) {
        try { 
           List<Coche> all = modelo.getLista();
            for (Coche carro : all) {
                System.out.println(carro);
            }
        System.out.println("Coches encontrados " + all.size());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }


    private void altaCoches(CocheDAODB modelo) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Intgroduce la matricula del coche  ");
            String matricula = sc.nextLine().toUpperCase();
            if(matricula.length() == 7) {

                if(!modelo.existeCocheMatricula(matricula))
                {
                            System.out.print("Ponme la marca del coche  ");
                    String marca = sc.nextLine();

                    System.out.print("Cuantas puertas tiene?  ");
                    int puertas = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Es automatico?");
                    String respuesta = sc.nextLine();

                    boolean aut;
                    if(respuesta.equalsIgnoreCase("si")){
                        aut = true;
                    } else  aut = true;

                    Coche nuevo = new Coche(matricula, marca, puertas, aut);
                int cocheNuevo = modelo.addCoche(nuevo);
                    if(cocheNuevo == 1){
                        System.out.println("Se ha registrado");
                    } else System.out.println("Operacion fallida");
                }
                else System.err.println("Existe esta matricula...");

            }
            else System.out.println("La longuitud de la martiucla debe ser 7");  
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
      
        
        
        
    }

    private void modificarCoches(CocheDAODB modelo) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Intgroduce la matricula del coche  ");
            String matricula = sc.nextLine().toUpperCase();
            if(matricula.length() == 7) {
            
           try {
               System.out.print("Ponme la marca que le quieres cambiar al coche  ");
               String marca = sc.nextLine();
               
               System.out.print("Cuantas puertas tiene?  ");
               int puertas = sc.nextInt();
               sc.nextLine();
               
               System.out.print("Es automatico?  ");
               String respuesta = sc.nextLine();
               
               boolean aut;
               if(respuesta.equalsIgnoreCase("si")){
                   aut = true;
               } else  aut = true;
               
               Coche cocheModif = new Coche(matricula, marca, puertas, aut);
               int mod = modelo.modificarCar(cocheModif);
               
               if(mod ==0){
                   System.err.println("No existe la matricula " + matricula);
               } else System.out.println("Se han actualizado " + mod + " coches");
               
           } catch (SQLException ex) {
               System.err.println(ex.getMessage());
           }
            
            }else System.err.println("La matricula tiene que ser de 7");
    }

    private void deleteCarPuertas(CocheDAODB modelo) {
        try {
            Scanner sc = new Scanner (System.in);
            System.out.print("De cuantas puertas quieres borrar los coches->  ");
            int puerta = sc.nextInt();
            Coche borrar = new Coche(" ", " ", puerta, true);
            
           int borr = modelo.borrarCarPuertas(borrar);
           if(borr == 0){
               System.err.println("No se han enontrado coches con " + puerta + " puertas.");
           } else 
               System.out.println("Se han borrado " + borr + " coches con " + puerta + " puertas.");
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    private void consularCaracteristicas(CocheDAODB modelo) {
        try {
            Scanner sc =  new Scanner (System.in);
            System.out.print("Introduce la matricula del coche que quieres ver ->  ");
            String matricula = sc.nextLine().toUpperCase();
           
            Coche carCarateristicas = new Coche(matricula, " ", 0, true);
           
          Coche carr =  modelo.carcateristicasCoche(carCarateristicas);
           
            if (carr == null){
                System.err.println("No se ha encontrado ningun coche con matricula " + matricula);
            } else {
                System.out.println("Carracteristicas del coche con marticula " + matricula);
                System.out.println(carr);
            }
           
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
 
    }

    
    
}
