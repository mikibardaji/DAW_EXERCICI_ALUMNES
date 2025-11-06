import java.util.Scanner;

public class FuncionsEx2 {
    public static int mayor(int a) {
    
        if (a >= 18) {
            return 1;
        } 
        
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce tu edad: ");
            int edad = sc.nextInt();


        if (mayor(edad) == 1) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}