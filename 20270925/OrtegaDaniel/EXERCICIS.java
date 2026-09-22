/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicis;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EXERCICIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mida_del_costat;
        double area_del_quadrat;
        


//MOSTRAR: preguntar la “mida del costat”
        System.out.println("mida del costat?");
        mida_del_costat = teclado.nextDouble();
        area_del_quadrat=mida_del_costat*mida_del_costat;
        System.out.println("l' area es de "+ area_del_quadrat);
        
        double mida_de_la_base;
        double mida_de_alçada;
        double area_rectangle;
        System.out.println("mida de la base");
        mida_de_la_base=teclado.nextDouble();
        System.out.println("mida de l' alçada");
        mida_de_alçada=teclado.nextDouble();
        area_rectangle=mida_de_la_base*mida_de_alçada;
        System.out.println("area del rectangle es "+area_rectangle);
        
        double numero1;
        double numero2;
        double resultado_suma;
        double resultado_resta;
        double resultado_multiplicacio;
        double resultado_divisio;
        
        
        System.out.println("numero 1");
        numero1=teclado.nextDouble();
        System.out.println("numero 2");
        numero2=teclado.nextDouble();
        resultado_suma=numero1+numero2;
        resultado_resta=numero1-numero2;
        resultado_multiplicacio=numero1/numero2;
        resultado_divisio=numero1*numero2;
        System.out.println("resutado suma " + resultado_suma);
        System.out.println("resutado resta " + resultado_resta);
        System.out.println("resutado multiplicacio " + resultado_multiplicacio);
        System.out.println("resutado divisio " + resultado_divisio);
        
        
    }
    
}
