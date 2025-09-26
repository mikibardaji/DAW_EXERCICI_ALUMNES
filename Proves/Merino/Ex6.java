import java.util.Scanner;

public class Ex6 {

        public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

System.out.println("¿Cuál es el primer valor?");
double valor1;
valor1= sc.nextDouble();

System.out.println("¿Cuál es el segundo valor?");
double valor2;
valor2= sc.nextDouble();

System.out.println("¿Cuál es el tercer valor?");
double valor3;
valor3= sc.nextDouble();

if (valor1 >= valor2 && valor1 >= valor3)
{
System.out.println(valor1);
}

else if (valor2 >= valor1 && valor2 >= valor3)
{System.out.println(valor2);}

else if (valor3 >= valor1 && valor3 >= valor2)
{System.out.println(valor3);}

//otro que sirve es else if (valor1 == valor2)
else {
   System.out.println(valor1);

}
        }

    }
