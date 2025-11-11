/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rca4813
 */
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       QuantitatAposta();
       AfegirPunts(50);
       pintaAsterisc(5);
       tipusAposta();
       bola();
       apostaPunts(50, 10);
       resultatJugada(2, 50, 10, 31);
       
    }
    
    public static int QuantitatAposta() {
        Scanner sc = new Scanner(System.in);
        int aposta;
        
        do{
            System.out.print("Quina quantitat vols apostar? (0 per acabar): ");
            aposta = sc.nextInt();
            if(aposta<0){
                System.out.println("No puedes poner un numero en negativo");
            }
        }while(aposta > 0 && aposta != 0);
        return aposta;
    }
    
    public static int AfegirPunts(int saldo){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix quants punts vols afegir al saldo: ");
        int afegir = sc.nextInt();
        saldo = saldo + afegir;
        return saldo;
    }
    
    public static int bola() {
        Random rand = new Random();
        int resultat = rand.nextInt(1, 37);
        System.out.println("La bola ha caigut al numero: " + resultat);
        return resultat;
    }
    
    public static int tipusAposta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escull el tipus d'aposta:");
        System.out.println("1. PARELL");
        System.out.println("2. SENAR");
        System.out.println("3. Número concret (0-36)");
        int opcio = sc.nextInt();
        
        if (opcio == 1) {
            return 2;  
        } else if (opcio == 2) {
            return 1;  
        } else {
            System.out.print("Introdueix el número al qual vols apostar: ");
            int numero = sc.nextInt();
            return numero;
        }
    }
    
    public static int apostaPunts(int puntsTotal, int puntsAposta) {
        if (puntsAposta <= 0 || puntsAposta > puntsTotal) {
            System.out.println("Aposta no valida!");
        }
        return puntsAposta;
    }
    
    public static int resultatJugada(int tipusAposta, int saldo, int puntsAposta, int bola) {
        if (tipusAposta == 2) { 
            if (bola != 0 && bola % 2 == 0) {
                saldo = saldo + puntsAposta;
                System.out.println("Has guanyat! +" + puntsAposta + " punts.");
            } else {
                saldo = saldo - puntsAposta;
                System.out.println("Has perdut " + puntsAposta + " punts.");
            }
        } else if (tipusAposta == 1) { 
            if (bola % 2 != 0) {
                saldo = saldo + puntsAposta;
                System.out.println("Has guanyat! +" + puntsAposta + " punts.");
            } else {
                saldo = saldo - puntsAposta;
                System.out.println("Has perdut " + puntsAposta + " punts.");
            }
        } else { 
            if (bola == tipusAposta) {
                saldo = saldo + puntsAposta * 36;
                System.out.println("Has encertat el número! +" + (puntsAposta * 36) + " punts.");
            } else {
                saldo = saldo - puntsAposta;
                System.out.println("No has encertat el número.");
            }
        }
        return saldo;
    }
    
    public static void pintaAsterisc(int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.println(" " + numero);
    }
    }
    

