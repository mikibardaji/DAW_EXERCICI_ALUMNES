import java.util.Scanner;

public class MengualMarcosEx7 {

    public static void main(String[] args) {
        
        //Pedir valor1
        //Pedir valor2
        //Pedir valor3
        //Valor1 > Valor2 && Valor1 > Valor3
        //Valor2 > Valor1 && Valor2 > Valor3
        //Valor3 > Valor1 && Valor3 > Valor2

        Scanner src = new Scanner(System.in);
        int valor1;
        System.out.println(" Dime un numero ");
        valor1 = src.nextInt();
        int valor2;
        System.out.println(" Dime otro numero ");
        valor2 = src.nextInt();
        int valor3;
        System.out.println(" Dime otro numero ");
        valor3 = src.nextInt();

        if (valor1>=valor2 && valor1>=valor3) 
        {
            System.out.println(" El numero mas grande es " + valor1);    
        }
        else if (valor2>=valor1 && valor2>=valor3) 
        {
            System.out.println(" El numero mas grande es " + valor2);    
        }
        else if (valor3>=valor1 && valor3>=valor2) 
        {
            System.out.println("El numero mas grande es " + valor3);    
        }
    }
}
