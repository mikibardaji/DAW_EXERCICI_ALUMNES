/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaarrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class TeoriaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 
   
        int[] notasModulo485; //[] las llaves indican que esto sera un array
        int notasModulo485_1; //un entero . no es array 
        notasModulo485 = new int[6]; 
        ponerNotas(notasModulo485);

        //System.out.println(notasModulo485.toString());
        mostrarArray(notasModulo485);
        //calcular la media de mis notas
        
        calcularMedia(notasModulo485);
        detectarCuantasRasSuspendidas(notasModulo485);
    }

    /* pregunte las notas al usuario y las introduzca*/
    private static void ponerNotas(int[] notasModulo485) {
        //tengo que preguntar al usuario
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //y cada nota ponerla en una nueva posicion del array
        //empezare por la posición 0
        for (int i = 0; i < notasModulo485.length; i++) {
            //System.out.print("Pon la nota " + (i+1) + " : ");
            //notasModulo485[i] = sc.nextInt();
            notasModulo485[i] = rd.nextInt(0, 11);
        }
        /*notasModulo485[0] = 4;
        notasModulo485[1] = 10;
        notasModulo485[2] = 6;
        notasModulo485[3] = 8;
        notasModulo485[4] = 2;
        notasModulo485[5] = 9;*/
    }
    
    private static void mostrarArray(int[] notas)
    {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("En la posicion " + i
            + " tienes un " + notas[i]);
        }
    }

    /*
    recorrer todo el array y guardar la psoicon en una acumulativa
    y al final dividirla
    */
    private static void calcularMedia(int[] notas) {
        int notas_acum=0;
        for (int i = 0; i < notas.length; i++) {
            //notas[i]
            notas_acum += notas[i]; //notas_acum = notas_acum + notas[i] 
        }
        System.out.println("Total " + notas_acum);
        double media = (double) notas_acum / notas.length;
        System.out.println("tu media es " + media);
    }

    /**
     * recorrer todas las notas y detectar cuantas
     * has suspendido y decir cuantas ra's tienes suspendidas
     * @param notasModulo485 
     */
    private static void detectarCuantasRasSuspendidas(int[] notasModulo485) {
    int contadorSuspensos = 0;

    for (int i = 0; i < notasModulo485.length; i++) {
        if (notasModulo485[i] < 5) {
            contadorSuspensos++;
        }
    }

    System.out.println("Has suspendido " + contadorSuspensos + " RAS");
    }
    
    
    
    
    }
    

