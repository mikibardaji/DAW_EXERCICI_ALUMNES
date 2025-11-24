/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import Objetos.Botella;

/**
 *
 * @author rasu2
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Botella bottle = new Botella();
        System.out.println("Capacidad botella: " + bottle.getCapacidad());
        System.out.println("ml liquido: " + bottle.getMlLiquido());
        System.out.println("Material: " + bottle.getMaterial());
        System.out.println("Tapon: " + bottle.estaCerrada());

        System.out.println(" Intentamos verter estando cerrada ");
        int vertido = bottle.verter();
        System.out.println("ml vertidos: " + vertido);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());

        System.out.println(" Abrimos la botella ");
        bottle.abrirBotella();
        System.out.println("Tapon: " + bottle.estaCerrada());

        System.out.println(" Intentamos verter con botella vacía ");
        vertido = bottle.verter();
        System.out.println("ml vertidos: " + vertido);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());

        System.out.println(" Rellenamos 3 ml y vertemos ");
        bottle.rellenar(3);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());
        vertido = bottle.verter();
        System.out.println("ml vertidos: " + vertido);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());

        System.out.println(" Rellenamos 10 ml y vertemos ");
        bottle.rellenar(10);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());
        vertido = bottle.verter();
        System.out.println("ml vertidos: " + vertido);
        System.out.println("ml liquido actual: " + bottle.getMlLiquido());
    }
    }
    

