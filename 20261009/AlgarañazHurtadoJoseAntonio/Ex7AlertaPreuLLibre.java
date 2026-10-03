/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7alertapreullibre;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex7AlertaPreuLLibre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preullibre;
        String texto=null;
        Scanner scan=new Scanner (System.in);
        System.out.println("Cual es el precio del libroo en creditos?: ");
        preullibre=scan.nextDouble();
        if (preullibre>35) {
            texto="Atencion: Este libro tiene un precio superior a la media.";           
            
        }else if (preullibre>=15&&preullibre<35) {
            texto="Precio estandar y correcto para un libro";
            
        }else if (preullibre<15) {
            texto="Precio excelente!! es una ganga.";
        }else if (preullibre<0) {        
       
            texto="Error precio no valido";
        
        }
        
        System.out.println(""+texto);
    }
    
}
