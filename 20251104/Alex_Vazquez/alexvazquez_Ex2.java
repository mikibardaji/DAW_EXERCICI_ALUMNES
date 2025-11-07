import java.util.Scanner;

public class Ex2 {




    public static void main(String[] args) {
        
         Scanner sc = new Scanner (System.in);
        System.out.println("Cuantos años tienes?");

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
