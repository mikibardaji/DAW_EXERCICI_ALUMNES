import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        int resultado = numero(numero);
        System.out.println(resultado);
        sc.close();
        
    }

    public static int numero(int a) {
        if (a>0){
            return 1;
        } else if (a<0){
            return -1;
        } else {
            return 0;
        }
        
    }

}
