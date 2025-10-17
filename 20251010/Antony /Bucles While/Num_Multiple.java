import java.util.Scanner;

public class Num_Multiple {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador=0;
System.out.println("Dime un numero: ");
int num_usuario=sc.nextInt();
do  
{
    if (num_usuario % 7 == 0) 
    {   
        contador++;//es el que cuenta y el que decir cuando parar
        System.out.println("El "+ num_usuario +" Es un multiplo de 7");
    }
    num_usuario++;
} while (contador < 10);
sc.close();
}
}
