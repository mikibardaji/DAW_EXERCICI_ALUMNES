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
                    default:
                        if (opcion == menuConcesioanrio.getOpcioSalida()){
                        System.out.println("SALIR");
                        } else System.out.println("Opcion incorrecta");
                        break;
                  
                }
                
            } while (opcion != menuConcesioanrio.getOpcioSalida());
            
            System.out.println("? Saliendo del programa...");
            sc.close();
        } catch (ClassNotFoundException ex) {
               System.out.println(ex.getMessage());
        }
    }

    

    private void anyadirOpcionesMenu(Menu menuConcesioanrio) {
        menuConcesioanrio.afegirOpcio("Alta Coches");
        menuConcesioanrio.afegirOpcio("Listar todos Coches");
        menuConcesioanrio.afegirOpcio("Salir");
        menuConcesioanrio.setOpcioSalida(3); //salida
    }

    private void listarCoches(CocheDAODB modelo) {
        try { 
           List<Coche> all = modelo.getLista();
            for (Coche carro : all) {
                System.out.println(carro);
            }
        System.out.println("Coches encontrado " + all.size());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }


    private void altaCoches(CocheDAODB modelo) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Intgroduce la matricula del coche  ");
        String matricula = sc.nextLine();
        
        System.out.print("Ponme la marca del coche  ");
        String marca = sc.nextLine();
        
        System.out.print("Cuantas puertas tiene?  ");
        int puertas = sc.nextInt();
        sc.nextLine();
        
        System.out.print("1 si es automatico. 2 si es manual");
        int cajaCambio = sc.nextInt();
        
        if(cajaCambio == 1){
      //  return cajaCambio true;
        }
      
        
        
        
    }
    
    
    
}
