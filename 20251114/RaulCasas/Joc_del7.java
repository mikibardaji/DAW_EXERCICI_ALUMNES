/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joc_del7;

import java.util.Random;

/**
 *
 * @author rasu2
 */
public class Joc_del7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int numero_carta_aleatori(){
        Random rd = new Random();
        int carta = rd.nextInt(1, 11);
        if(carta == 8){
            carta = 10;
        }else if(carta == 9){
            carta = 11;
        }else if(carta == 10){
            carta = 12;
        }
        return carta;
    }
    
    public static int pal_carta_aleatori(){
        Random rd = new Random();
        int pal = rd.nextInt(1, 5);
        return pal;
    }
    
    public static void imprimir_carta(int carta, int pal){
        if(pal == 1){
            System.out.println("Carta: " + carta + " de OROS");
        }else if(pal == 2){
            System.out.println("Carta: " + carta + " de BASTOS");
        }else if(pal == 3){
            System.out.println("Carta: " + carta + " de ESPADAS");
        }else if(pal == 4){
            System.out.println("Carta: " + carta + " de COPAS");
        }
    }
    
    public static double punts_carta(int carta){
        double punts = 0;
        if (carta == 1){
            punts = punts + 1;
        }else if(carta == 2){
            punts = punts + 2;
        }else if(carta == 3){
            punts = punts + 3;
        }else if(carta == 4){
            punts = punts + 4;
        }else if(carta == 5){
            punts = punts + 5;
        }else if(carta == 6){
            punts = punts + 6;
        }else if(carta == 7){
            punts = punts + 7;
        }else if(carta == 10 || carta == 11 || carta == 12){
            punts = punts + 0.5;
        }
        return punts;
    }
    
    public static int banca_demana_carta(double punts_banca, double punts_jugador){
        if(punts_jugador <= 7.5 && punts_banca < punts_jugador || punts_banca < 5){
            return 1;
        }else{
            return 0;
        }
    }
    
    public static int guanya_jugador(double punts_jugador, double punts_banca){
        if(punts_jugador <= 7.5 && punts_jugador > punts_banca || punts_banca > 7.5){
            return 1;
        }else{
            return 0;
        }
    }
}
