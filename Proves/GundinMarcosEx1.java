import java.util.Scanner;

public class teoriaCondicionales {
    public static void main(String[] args) throws Exception {
        //Programa que te dice si has aprobado

        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Que nota has sacado? ");

        nota = sc.nextDouble();

        //Condicion, si la nota es mayor que 5 esta aprobado, sino esta suspendido.
        if (nota >= 0) {
            if (nota<5) {
                System.out.println("Estas suspendido");
            }
            else if (nota >= 5 && nota<7) {
                System.out.println("Estas aprobado con un suficiente");
            }
            else if (nota >= 7 && nota<9) {
                System.out.println("Estas aprobado con un notable");
            }
            else if (nota >= 9 && nota <= 10) {
                System.out.println("Estas aprobado con un excelente");
            }
        }
        else{
            System.out.println("el valor de tu nota no es valido, vuelva a insertarlo porfavor");
        }
    }   
}

