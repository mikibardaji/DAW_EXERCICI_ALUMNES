import java.util.Scanner;

public class Actividad5_Marcelo_Quintana {
    
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
     System.out.print(" Dime tu distancia en millas: ");
     int millas =  sc.nextInt();


    double kilometros = millas_a_kilometros(millas);
    System.out.println(millas + " millas equivalen a " + kilometros + " kilometros.");
    }
  
     return  millas * 1.60934;
    }
}


