import java.util.Scanner;

public class TeoriaCondicionales {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in); 
       //Programa que te dice si has aprobado
       double nota;
       System.out.println("Que nota has sacado?");
       nota = sc.nextDouble();
        if(nota<5){
            System.out.println("Suspendido");

        }
        else if (nota>=5 && nota<7) {
            System.out.println("Aprobado");
        }
        else if (nota>=7 && nota<9) {
            System.out.println("Notable");
        }
        else if (nota>=9 && nota<=10) {
            System.out.println("Excelente");
        }
    }
}
