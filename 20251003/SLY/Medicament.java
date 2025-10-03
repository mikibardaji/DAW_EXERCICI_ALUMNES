/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.esportives;

import java.util.Scanner;

/**
 *
 * @author sta4501
 */
public class Medicament {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;
        char opcion;

        System.out.println("Dime tu peso actual ");
        peso = sc.nextDouble();

        System.out.println("Elije un tu medicamento "
                + "|| I = Ibuprofeno"
                + "|| X = Xarelto"
                + "|| A = Amoxicilina"
                + "|| F = Fluoxetina");

        opcion = sc.next().charAt(0);

        System.out.print("Has elegido ");
        switch (opcion) {

            case 'i':
            case 'I':
                System.out.println("Ibuprofeno");
                if (peso < 70) {
                    System.out.println("Tienes que tomar dosis de 500mg");
                } else {
                    System.out.println("Tienes que tomar dosis de 1g");
                }
                break;

            case 'x':
            case 'X':
                System.out.println("Xarelto");
                if (peso < 60) {
                    System.out.println("Tienes que tomar dosis de 10mg");
                } else if (peso <= 80) {
                    System.out.println("Tienes que tomar dosis de 15 mg");
                } else {
                    System.out.println("Tienes que tomar dosis de 20 mg");
                }

                break;
            //*****************************************************************///     
            case 'a':
            case 'A':
                System.out.println("Amoxicilina");

                if (peso < 65) {
                    System.out.println("Tienes que tomar dosis de 500mg");
                } else {
                    System.out.println("Tienes que tomar dosis de 1g");
                }

                break;
            //*******************************************************************//    

            case 'f':
            case 'F':
                System.out.println("Fluoxetina");
                if (peso < 80) {
                    System.out.println("Tienes que tomar dosis de 20mg");

                } else {
                    System.out.println("Tienes que tomar dosis de 40 mg");
                }
                break;
            //*********************************************************************///    
            default:
                System.out.println(" una opcion no valida");
                break;
        }

    }
}
