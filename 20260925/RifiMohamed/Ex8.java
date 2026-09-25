import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8;

/**
 *
 * @author mri7869
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double preu_nominal, preu_real, diners_descomptats, percentatge_descompte;

        System.out.println("Quin és el preu nominal (original) de l'article?");
        preu_nominal = entrada.nextDouble();

        System.out.println("Quin és el preu de venda real?");
        preu_real = entrada.nextDouble();

        diners_descomptats = preu_nominal - preu_real;
        percentatge_descompte = (diners_descomptats / preu_nominal) * 100;

        System.out.println("El percentatge de descompte aplicat és del: " + percentatge_descompte );
    }
    
}
