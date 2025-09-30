import java.util.Scanner;

public class Ex4 {
 
   public static void main(String[] args) {
/*PROGRAMA QUE LLEIGEIX 2  NUM I EN MOSTRA EL MÉS GRAN */
Scanner sc= new Scanner(System.in);

System.out.println("Introduce el número: ");
int valor1= sc.nextInt();

if (valor1 > 0)
{
System.out.println(valor1 + "El número es positivo");
}else if (valor1 < 0)
{
    System.out.println(valor1+ "El número es negativo");
}else {
   System.out.println("El número es zero");
}
}
}

