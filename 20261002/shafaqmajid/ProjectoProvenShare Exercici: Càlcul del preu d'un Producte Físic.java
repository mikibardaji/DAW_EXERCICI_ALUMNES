/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Càlcul del preu d'un Producte Físic;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProjectoProvenShareCàlcul del preu d'un Producte Físic {

    /**
     * Exercici: Càlcul del preu d'un Producte Físic
     * A ProvenShare, un estudiant pot vendre un producte físic. El preu final depèn de l'estat de conservació del producte.
 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double preuInicial;
        double preuFinal;
        double descompte;
        String estatConservacio;

        System.out.print("Introdueix el preu inicial: ");
        preuInicial = entrada.nextDouble();

        entrada.nextLine();

        System.out.print("Introdueix l'estat de conservació: ");
        estatConservacio = entrada.nextLine();

        if (estatConservacio.equalsIgnoreCase("Nou")) {
            descompte = 0;
        } else if (estatConservacio.equalsIgnoreCase("Com nou")) {
            descompte = 0.10;
        } else if (estatConservacio.equalsIgnoreCase("Bo")) {
            descompte = 0.20;
        } else if (estatConservacio.equalsIgnoreCase("Acceptable")) {
            descompte = 0.40;
        } else {
            System.out.println("Estat no vàlid.");
            return;
        }

        preuFinal = preuInicial - (preuInicial * descompte);

        System.out.println("Preu inicial: " + preuInicial + " €");
        System.out.println("Descompte: " + (descompte * 100) + "%");
        System.out.println("Preu final: " + preuFinal + " €");
    }
}

