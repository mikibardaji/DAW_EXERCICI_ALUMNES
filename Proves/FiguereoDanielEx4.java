import java.util.Scanner;

public class FiguereoDanielEx4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Pedir un numero
    int numero;
    System.out.println("Introduce un numero: ");
    numero = sc.nextInt();
    //Si el numero es >=0
    //Mostrar positivo
    if (numero>0)
    {
        System.out.println("El numero es positivo ");
    }  
    //Sino mostrar negativo 
    else if (numero<0)
    {
        System.out.println("El numero es negativo");
    }
    //Si es 0 mostrar cero
    else 
    {
        System.out.println("El numero es cero");
    }
   
    
    //Si es 0 mostrar cero
}
}
