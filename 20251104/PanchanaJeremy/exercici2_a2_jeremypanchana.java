import java.util.Scanner;

public class exercici2_a2_jeremypanchana {




    public static void main(String[] args) {
        
         Scanner sc = new Scanner (System.in);
        System.out.println("Eres mayor de edad ?");

        int edad = sc.nextInt();
        
        esMayorEdad(edad);
        
         if (esMayorEdad(edad)) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
    

    }

    public static boolean esMayorEdad(int a) {
        
        
       

        if (a >=18 ){

            return true ; 
        }
        
        
        return false;




    }

}
