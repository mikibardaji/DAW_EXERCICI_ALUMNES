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
public class VistaConsolaConsecionario {
    Scanner sc = new Scanner(System.in);
    
    
    public void run()
    {   
        
        try {
            CocheDAODB modelo = new CocheDAODB();
            
            /* Crear una variable pel model de dades*/
            //LuchadorDAOList repositori = new LuchadorDAOList();
            Menu menuconsesionario = new Menu("Mantenimiento Concesionario");
            anyadirOpcionesMenu(menuconsesionario);
            int opcion=0;
            do {
                menuconsesionario.mostrarMenu();
                
                boolean valorEntero = false;
                
                opcion = menuconsesionario.llegirOpcioValida();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Alta");
                         altaCoches(modelo);
                        break;
                    case 2:
                        System.out.println(" Listar");
                        listarCoches(modelo);
                        break;
                    case 3:
                        System.out.println(" Modificar datos ");
                        modificarCoches(modelo);
                        break;  
                    case 4:
                        System.out.println(" Vender  coche  ");
                        VenderCoche(modelo);
                        break;  
                        
                         case 5:
                        System.out.println(" Mostrar datos mediante matricula   ");
                        mostrarDATOSCoche(modelo);
                        break; 
                        
                        
                    default :
                        
                        if (opcion == menuconsesionario.getOpcioSalida()){
                         System.out.println("Salir");
                        }
                        else {
                        
                            System.out.println(" Opcion incorrecta ");
                        }
                        //borrarLuchador(repositori);
                        break;
//                    case 4:
//                        System.out.println("? Listar Luchadores que no superen el peso.");
//                        //listarLuchadoresPeso(repositori);
//                        break;
//                    case 5:
//                        System.out.println("? Alta en posicion elegida");
//                        //anyadirLuchadorPosicion(repositori);
//                        break;
//                    case 6:
//                        //cambiarNombre(repositori);
//                        break;
//                        // case 8: no hace falta controlarla
//                        //      System.out.println("? Saliendo del programa...");
//                        //      break;
                }
                
            } while (opcion != menuconsesionario.getOpcioSalida());
            
            System.out.println("? Saliendo del programa...");
            sc.close();
        
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());        }
    }

    

    private void anyadirOpcionesMenu(Menu menuLuchador) {
        menuLuchador.afegirOpcio("Alta COCHE");
        menuLuchador.afegirOpcio("Listar todos COCHES");
//        menuLuchador.afegirOpcio("Borrar Luchador");
//        menuLuchador.afegirOpcio("Listar Luchadores por categoria peso");
        menuLuchador.afegirOpcio("Modificar datos de coches ");
//        menuLuchador.afegirOpcio("Cambiar nombre luchador (pedir idLicencia)");
    menuLuchador.afegirOpcio("Vender Coche");
    menuLuchador.afegirOpcio(" Mostrar datos mediante matricula "); 
menuLuchador.afegirOpcio("Salir");
        menuLuchador.setOpcioSalida(6); //salida
    }

    private void listarCoches(CocheDAODB modelo) {

        try {
           List<Coche > all =  modelo.getLista();
            for (Coche coche : all) {
                System.out.println(coche);
              
            }
              System.out.println("Coches encontrados : "+ all.size());
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }


    }

    private void  altaCoches(CocheDAODB modelo) {
        try {
            System.out.println("Dime la matricula del coche: ");
            String matricula = sc.nextLine().toUpperCase();
            if (matricula.length()==7){
            System.out.println("Dime la marca de coche: ");
            String marca = sc.nextLine();
            System.out.println("Cuantas puertas tiene: ");
            int puertas = sc.nextInt();
            sc.nextLine();
            System.out.println("Es automatico?");
            String respuesta = sc.nextLine();
            boolean aut;
            if (respuesta.equalsIgnoreCase("si")) {
                aut = true;
            }else {
                aut = false;
            }
            Coche nuevo = new Coche(matricula, marca, puertas, aut);
            int cochesitonuevo = modelo.addCoche(nuevo);
            if (cochesitonuevo ==1){
                System.out.println("Se ha registrado el coche nuevo correctamente");
            
            }else {
                System.out.println("No se ha registrado bien ");
            }
    }else{
                System.err.println("La longitudn  matricula debe ser 7");
            }         
        } catch (SQLException ex) {

             System.err.println(ex.getMessage());
        }
    }

    private void modificarCoches(CocheDAODB modelo) {

            Scanner sc = new Scanner (System.in);
            System.out.println("INTRODUCE DATOS DE COCHE QUE QUEIERE MODIFICAR ");
            
            System.out.println("Dime la matricula del coche: ");
            String matricula = sc.nextLine().toUpperCase();
            
            
            if (matricula.length()==7){
            
                try {
                    System.out.println("Dime la marca de coche: ");
                    String marca = sc.nextLine();
                    
                    System.out.println("Cuantas puertas tiene: ");
                    int puertas = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Es automatico?");
                    String respuesta = sc.nextLine();
                    
                    boolean aut;
                    if (respuesta.equalsIgnoreCase("si")) {
                        aut = true;
                    }else {
                        aut = false;
                    }
                    
                    Coche cochemodificado = new Coche(matricula, marca, puertas, aut);
                     
                    int cochemod= modelo.modificarCar(cochemodificado);
                    if (cochemod ==1){
                           System.out.println(" Se ha modificado el coche correctamente."); 
                            }
                    else {
                    
                        System.out.println(" No se ha modificado el coche ");
                    }
                    
                    
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());                }
            
            }
            else {
                System.err.println("La matricula tiene que ser 7 ");
            }
            
            
            


    }

    private void VenderCoche(CocheDAODB modelo) {

        try {
            Scanner sc = new Scanner (System.in);
            System.out.println("INTRODUCE DATOS DE COCHE QUE QUEIERES VENDER  ");
            
            System.out.println("Cuantas puertas tiene: ");
            int puertas = sc.nextInt();
            
            Coche cochevendido = new Coche(" ", "", puertas, true);
            
            int coche_v = modelo.venderCoche(cochevendido);
            
            
            if (coche_v >0){
                System.out.println(" Se han vendidos coches  correctamente.");
            }
            else {
                
                System.out.println(" No se ha vendido  el coche ");
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
            System.out.println(ex.getMessage());

        }
         
         
         
            
          


    }
        
        

   
    }
            
            
            

