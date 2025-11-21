/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriapoo;

import Objectes.Botella;

/**
 *
 * @author mabardaji
 */
public class TeoriaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Botella bottle;
        bottle = new Botella();
        System.out.println("capacida botella " + bottle.getCapacidad());
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        System.out.println("Material: " + bottle.getMaterial());
        System.out.println("tapon " + bottle.estaCerrada());
        
        System.out.println("Intento poner 70");
        bottle.setLiquido(70);
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        
        System.out.println("Intento poner 10");
        bottle.setLiquido(10);
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        System.out.println("Intento poner 5");
        bottle.setLiquido(5);
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        System.out.println("relleno con 5");
        bottle.rellenar(5);
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        
    }
    
}
