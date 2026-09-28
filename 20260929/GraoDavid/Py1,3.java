/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package py1.pkg3;

import java.util.Scanner;

/**
 *
 * @author dgrao
 */
public class Py13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner texto = new Scanner(System.in);
    double creditos_usuario, precio_servicio_hora, precio_total_servicio;
    int horas_servicio;
    boolean cred_suficientes;
    
        System.out.println("¿Cuantos creditos tienes actualmente?");
        creditos_usuario = texto.nextDouble();
        System.out.println("¿Cuantos creditos cuesta el servicio por hora?");
        precio_servicio_hora = texto.nextDouble();
        System.out.println("¿Cuantas horas quieres contratar el servicio?");
        horas_servicio = texto.nextInt();
        precio_total_servicio = precio_servicio_hora * horas_servicio;
        cred_suficientes = creditos_usuario >= precio_total_servicio;
        System.out.println("Resultado: " + cred_suficientes);
    }
    
}
