import java.util.Scanner;

public class gogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que nota has sacado en el examen? ");
        double nota = sc.nextDouble();
        if (nota <= 5) {
            System.out.println("Has suspendido con un " );


            
        }else if (nota >= 5 && nota < 7) {
            System.out.println("Has aprobado con un suficiente ");


            
        }else if (nota >= 7 && nota < 9) {
            System.out.println("Has aprobado con un notable");

        }else if (nota >=9 && nota <= 10 ) {
            System.out.println("Has aprobado con un excelente ");

            
        }
        
        




        sc.close();
    }
    

}
