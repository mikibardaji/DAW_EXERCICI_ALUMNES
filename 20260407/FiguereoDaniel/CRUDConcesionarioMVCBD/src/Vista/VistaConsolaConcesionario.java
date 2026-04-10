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
        menuLuchador.afegirOpcio("Salir");
        menuLuchador.setOpcioSalida(3); //salida
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
        System.out.println("Dime la matricula del coche: ");
        String matricula = sc.nextLine();
        System.out.println("Dime la marca de coche: ");
        String marca = sc.nextLine();
        System.out.println("Cuantas puertas tiene: ");
        int puertas = sc.nextInt();
        System.out.println("Es automatico?");
        String respuesta = sc.nextLine();
        boolean aut;
        if (respuesta.equalsIgnoreCase("si")) {
            aut = true;      
        }else {
            aut = false;
        }
        Coche nuevo = new Coche(matricula, marca, puertas, aut);
        modelo.addCoche(nuevo);
    }
    
}
