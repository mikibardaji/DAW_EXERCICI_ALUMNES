import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de horas trabajadas: ");
        double horas = sc.nextDouble();

        double salarioBruto;
        if (horas <= 130) {
            salarioBruto = horas * 15.0;
        } else {
            salarioBruto = (130 * 15.0) + ((horas - 130) * 22.5);
        }

        double impuestos;
        if (salarioBruto <= 500) {
            impuestos = 0;
        } else if (salarioBruto <= 900) {
            impuestos = (salarioBruto - 500) * 0.25;
        } else {
            impuestos = (400 * 0.25) + ((salarioBruto - 900) * 0.45);
        }

        double salarioNeto = salarioBruto - impuestos;

        System.out.printf("Salari brut: " + salarioBruto  ); 
        System.out.printf("Taxes:" + impuestos  ); 
        System.out.printf("Salari net: " + salarioNeto);

        sc.close();

    }

}
