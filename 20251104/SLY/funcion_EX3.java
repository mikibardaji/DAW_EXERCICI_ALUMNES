
import java.util.Scanner;

public class funcion_EX3 {

    public static void main(String[] args) {

        int El_minimo_numero;

        System.out.println("tell me your first number:");
        int primer_numero = pedirDosNumeros();
        System.out.println("tell me your segund number:");
        int segundo_numero = pedirDosNumeros();
          
        El_minimo_numero = elNumeroMinimo(primer_numero, segundo_numero);
       
    }

   /** public static boolean esMayorDeEdadç(int age) {
        if (age >= 18) {
            System.out.println("You are an adult");
            return true;
        } else {
            System.out.println("You are a minor");
            return false;
        }


    }*/ 

     /**public static int preguntarEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("how old are you?");
        int user_age = sc.nextInt();
        sc.close();
        return user_age;
    }}*/ 

    public static int pedirDosNumeros() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
        
    }

    public static int elNumeroMinimo(int a, int b) {
         int minimo;
        if (a < b) {
            minimo = a;
            System.out.println(+minimo +" is the minimum number");
        } else {
            minimo = b;    
            System.out.println(+minimo +" is the minimum number");   
        }
        return minimo;
    }

}
