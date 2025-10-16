/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rasu2
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int aleatorio, numero;
       
        aleatorio = rd.nextInt(1, 100);
        do{
            System.out.print("Intenta adivinar el numero que he pensado:");
            numero = sc.nextInt();
            if(numero>aleatorio){
                System.out.println("Menor");
            }else if(numero<aleatorio){
                System.out.println("Mayor");
            }
        }while(numero != aleatorio);
    }
    
}
