import java.util.Scanner;

public class TeoriaCondicionales {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try (//Pedir nota
        Scanner sc = new Scanner(System.in)) {
            double nota;
            System.out.println("pedir nota?");
            nota = sc.nextDouble();
            //Si nota >= 5
            if (nota < 5)
                {
                  System.out.println("Has suspendido, nos vemos el año que viene."); 
                }
            else if (nota>=5 && nota <7) //si no se cumple el if, no es obligatorio
                {
                  System.out.println("Has aprobado.");  
                }
            else if (nota>7 && nota <9) //si no se cumple el if, no es obligatorio
                {
                  System.out.println("Has sacado notable.");  
                }
            else if (nota >=9 && nota <=10)
                {
                    System.out.println("Has sacado un excelente.");  
                }
            //Entonces mostrar Aprobado
            //Sino
            //Entonces mostrar Suspendido
        }
    }
}
