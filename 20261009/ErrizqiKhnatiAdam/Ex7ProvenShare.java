/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7provenshare;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex7ProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preuLlibre;
        String missatge;
        
        Scanner txt = new Scanner(System.in);
        
        System.out.println("Introdueix el preu d'un llibre en credits:");
        preuLlibre = txt.nextDouble();
        
        missatge ="";
        if (preuLlibre <= 0){
            missatge = "Error preu no vàlid";
        }
        else if (preuLlibre < 15) {
            missatge = "Preu excel·lent! Es una ganga.";

        } else if (preuLlibre >= 15 && preuLlibre <= 35) {
            missatge = "Preu estandard i correcte per a un llibre.";
            
        } else if (preuLlibre > 35) {
            missatge = "Atencio: Aquest llibre te un preu superior a la mitjana.";
        } else {
            missatge = "Introdueix un numero";
        }
        
        System.out.println(missatge);
    }
    
}
