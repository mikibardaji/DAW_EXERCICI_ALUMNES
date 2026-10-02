/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11provenshare;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex11ProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horaInici, duradaEstimada;
        boolean horari, duradaFinal;
        String missatge;
        
        Scanner txt = new Scanner(System.in);
        
        System.out.println("Introdueix l'hora d'inici:");
        horaInici = txt.nextInt();
        
        System.out.println("Introdueix la durada estimada del servei (en minuts):");
        duradaEstimada = txt.nextInt();
        
        horari = horaInici >= 8 && horaInici <= 20;
        duradaFinal = duradaEstimada <= 120;
        
        if (horari && duradaFinal) {
            missatge = "Servei acceptat. S'ha publicat correctament al catàleg.";
        } else if (!horari && duradaFinal) {
            missatge = "Error: L'hora d'inici ha d'estar entre les 8h i les 20h.";
        } else if (horari && !duradaFinal) {
            missatge = "Error: La durada del servei no pot superar els 120 minuts.";
        } else {
            missatge = "Error: L'hora i la durada introduïdes no són vàlides.";
        }
        
        System.out.println(missatge);
    }
    
}
