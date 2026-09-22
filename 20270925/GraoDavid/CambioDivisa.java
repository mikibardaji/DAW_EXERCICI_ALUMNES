/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambio.divisa;

import java.util.Scanner;

/**
 *
 * @author dgr4354
 */
public class CambioDivisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dinero;
        double cambio_divisa;
        double dinero_cambiado;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cuanto dinero tienes?");
        dinero = teclado.nextDouble();
        System.out.println("¿Y cuanto es el cambio de divisa?");
        cambio_divisa = teclado.nextDouble();
        dinero_cambiado = dinero * cambio_divisa;
        System.out.println("Tienes " + dinero_cambiado + " en la otra moneda");
        
    }
    
}
