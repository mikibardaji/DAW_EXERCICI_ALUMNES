import java.util.Scanner;

public class FuncionsEx2 {
    public static boolean mayor(int a) {
        return a >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    do{
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
    }while( edad<=0 );
        if (mayor(edad)) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}

