import java.util.Scanner;

public class exercici5_a2_jeremypanchana {


/**
 * Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
 Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
 double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
 * @param args
 */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe un valor y te lo paso a millas");

        int valor = sc.nextInt();


      double valorfinal =   millas_a_kilometros(valor);

        System.out.println("El equivalente a kilometros es " + valorfinal) ;

        
 
    }



    public static double millas_a_kilometros(int millas){

        double calculo = millas * 1.60934;


        return calculo;






    }
}
