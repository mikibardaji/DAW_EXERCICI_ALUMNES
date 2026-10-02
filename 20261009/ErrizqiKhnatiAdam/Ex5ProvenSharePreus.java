/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5provensharepreus;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex5ProvenSharePreus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preuOriginal, descompte, preuFinal;
        String estatProducte, missatge;
        
        Scanner txt = new Scanner(System.in);
        
        System.out.println("Quin es el preu original?");
        preuOriginal = txt.nextDouble();
        
        System.out.println("Quin es l'estat del producte?");
        estatProducte = txt.next();
        
        if (estatProducte.equalsIgnoreCase("Nou")) {
            preuFinal = preuOriginal;
            missatge = "El preu final es de " + preuFinal + "€";
        } else if (estatProducte.equalsIgnoreCase("Bo")){
            descompte = preuOriginal * 0.2;
            preuFinal = preuOriginal - descompte;
            missatge = "El preu final es de " + preuFinal + "€";
        }  else if (estatProducte.equalsIgnoreCase("Acceptable")){
            descompte = preuOriginal * 0.5;
            preuFinal = preuOriginal - descompte;
            missatge = "El preu final es de " + preuFinal + "€";
        } else {
            missatge = "Error";
        }
        
        System.out.println(missatge);
    }
    
}
