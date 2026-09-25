/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicicreditsproven;
import java.util.Scanner;
/**
 *
 * @author cdi1866
 */
public class ExerciciCreditsProven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Inicio
        //2. Declaracion variable y Scanner
        Scanner sc = new Scanner(System.in);
        int creditosServ,creditosAntesCompra, creditosFinal, creditosLibro;
                final int CREDITOSINICIAL = 300;
        //3. Mostrar “Tienes 300 creditos de bienvenida”
        System.out.println("Tienes 300 creditos de bienvenida! :)");              
        //4 Mostrar “Cuantos creditos has ganado en tu primer servicio?”
        System.out.println("Cuantos creditos has ganado en tu primer servicio?");
        //5. Esperar creditosServ
        creditosServ= sc.nextInt ();
        //6. Calcular creditosAntesCompra = CREDITOSINICIAL + creditosServ
        creditosAntesCompra = CREDITOSINICIAL + creditosServ;
        //7. Mostrar “Tienes  “ + creditosAntesCompra
        System.out.println("Tienes " + creditosAntesCompra);
        //7. Mostrar: Cuantos creditos vale el libro?
        System.out.println("Cuantos creditos vale el libro?");
        //8. Esperar creditosLibro
        creditosLibro = sc.nextInt ();
        //9. Calcular creditosFinal = creditosAntesCompra - creditosLibro
        creditosFinal = creditosAntesCompra - creditosLibro;
        //10. Mostrar “Tienes” + creditosFinal
        System.out.println("Tienes " + creditosFinal);

    }
    
}
