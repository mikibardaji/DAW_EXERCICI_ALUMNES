import java.util.Scanner;
public class tellezmarkEx4 {
public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el numero");
    

    int num1 = sc.nextInt();
    if (num1 > 0) {
        System.out.println( num1 +"es positivo");
        
    } else if (num1 < 0) {
        System.out.println( num1 +"es negativo");
        
    } else if (num1 == 0) {
        System.out.println("El numero es cero");
    } 
        
    }   
}


    

