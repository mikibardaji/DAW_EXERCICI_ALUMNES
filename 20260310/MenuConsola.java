package Utilidades;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuConsola {

    private String titulo;
    private List<String> opciones;
    private int opcionSalida;

    public MenuConsola(String titulo) {
        this.titulo = titulo;
        this.opciones = new ArrayList<>();
        this.opcionSalida = 0;
    }


    public int getOpcionSalida() {
        return opcionSalida;
    }

    public void setOpcionSalida(int opcionSalida) {
        this.opcionSalida = opcionSalida;
    }

    public void añadirOpcion(String opcion){
        if (opcion == null) {
            System.out.println("Opción no válida");
        } 
        else if (opciones.contains(opcion)) {
            System.out.println("La opción ya existe.");
        } 
        else {
            opciones.add(opcion);
        }       
    }

    public void mostrarMenu(){
        System.out.println(titulo);
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println(i + " - " + opciones.get(i));
        }
    }

    // public int elegirOpcionValida(){
    //     Scanner sc = new Scanner(System.in);
    //     int numero = -1;
    //     boolean valido = false;
    //     do {
    //         System.out.println("Dame un número.");
    //         try {
    //             if (numero > 0 && numero < opciones.size()) {
    //                 numero = sc.nextInt();
    //                 valido = true;
    //             }
    //         } catch (InputMismatchException e) {
    //             System.out.println("Debes introducir un número.");
    //             sc.nextLine();
    //         }
    //     } while (!valido);
        
    // }

    public int elegirOpcionValida() {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Introduce una opción: ");

    try {
        numero = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        if (numero < 0 || numero >= opciones.size()) {
            System.out.println("Opción fuera de rango. Se asigna la opción de salida.");
            numero = opcionSalida;
        }

    } catch (InputMismatchException e) {
        System.out.println("Error: Debes introducir un número.");
        sc.nextLine(); // limpiar buffer
        numero = opcionSalida;
    }

    return numero;
}

}
