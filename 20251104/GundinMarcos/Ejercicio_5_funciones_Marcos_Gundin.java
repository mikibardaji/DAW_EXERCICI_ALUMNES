import java.util.Scanner;

public class Ejercicio_5_funciones_Marcos_Gundin {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
     System.out.print("Escribe. tu distancia en millas: ");
     int millas =  sc.nextInt();


    double kilometros = millas_a_kilometros(millas);
    System.out.println(millas + " millas equivalen a " + kilometros + " kilometros.");
    }
  
       public static double millas_a_kilometros(int millas) {
      
         return  millas * 1.60934;
    }
}
