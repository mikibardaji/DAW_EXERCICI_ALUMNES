import java.util.Scanner;

public class Ex3 {
   public static void main(String[] args) {
/*PROGRAMA QUE LLEIGEIX 2  NUM I EN MOSTRA EL MÉS GRAN */
Scanner sc= new Scanner(System.in);

System.out.println("¿Cuál es el primer valor?");
double valor1;
valor1= sc.nextDouble();

System.out.println("Cuál es el segundo valor?");
double valor2;
valor2= sc.nextDouble();

if (valor1 > valor2)
{
System.out.println(valor1 + " es mayor que" + valor2);
}

else if (valor2 > valor1)
{System.out.println(valor2 + "es mayor que " + valor2);}

//otro que sirve es else if (valor1 == valor2)
else {
   System.out.println("Los dsos valores son iguales.");
}
   }

}

