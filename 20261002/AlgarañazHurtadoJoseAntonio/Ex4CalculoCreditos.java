/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4calculocreditos;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex4CalculoCreditos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nombreServeis;
        Scanner scan=new Scanner (System.in);
        System.out.println("Cuantos servicios ofrecerás?: ");
        nombreServeis=scan.nextInt();
        if (nombreServeis>=3) {
            System.out.println("Bienvenido tienes 100 creditos de regalo.");            
        }else if (nombreServeis>=1&&nombreServeis<=2) {
            System.out.println("Bienvenido tienes 50 creditos de regalo.");
        }else{  
            System.out.println("Bienvenido tienes 10 creditos de regalo.");

        }
    }
    
}
