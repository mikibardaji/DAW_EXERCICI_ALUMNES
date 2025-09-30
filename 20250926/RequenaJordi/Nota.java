import java.util.Scanner;

public class Nota {
public static void main(String[] args) {
    
    //Pedir nota 
    Scanner sc = new Scanner(System.in);

System.out.println(" Dime la nota que has sacado ");
double nota = sc.nextDouble();

    //Si nota>=5 entonces Aprobado
if (nota<5)

{
    System.out.println(" Has suspendido.Felicidades!!!");
}
else if (nota>=5 && nota<7)
{
    System.out.println("Has aprobado");
}
else if (nota>=7 && nota<9)
{
    System.out.println("Has sacado un notable");
}
else if (nota>=9 && nota ==10)
{
    System.out.println("Has sacado un excelente");
}

}
}
 
