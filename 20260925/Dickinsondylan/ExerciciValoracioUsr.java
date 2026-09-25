/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicivaloraciouser;
import java.util.Scanner;

/**
 *
 * @author cdi1866
 */
public class ExerciciValoracioUser {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.Inicio
    //2.Declaración variables y Scanner
        int valUser1, valUser2, valUser3;
        double valTotal;
            Scanner sc = new Scanner(System.in);
    // 3.Mostrar “Que valoracion te ha puesto el primer usuario?”
        System.out.print("Que valoracion te ha puesto el primer usuario?  ");
    //4.Esperar valUser1
        valUser1 = sc.nextInt();
    // 5.Mostrar “Que valoracion te ha puesto el segundo usuario?”
         System.out.print("Que valoracion te ha puesto el segundo usuario?  ");
         //6.Esperar valUser2
         valUser2= sc.nextInt();
    //7.Mostrar “Que valoracion te ha puesto el tercer ususario?
        System.out.print("Que valoracion te ha puesto el tercer usuario?  ");
    //8.Esperar valUser3
        valUser3= sc.nextInt();
    //9. Calcular valTotal =(valUser1 + valUser2 + valUser3) / 3
        valTotal =(valUser1 + valUser2 + valUser3) / 3;
    //10. Mostrar “Tu valoración media es de  “ + valTotal :)
        System.out.print("Tu valoracion media es de  " + valTotal);
        //11. Fin

    }
    
}
