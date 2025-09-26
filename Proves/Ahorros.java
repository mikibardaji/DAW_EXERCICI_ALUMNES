package a1;

import java.util.Scanner;

public class Ahorros {
    public static void main(String[] args) {
        //Tiene que saber cuantas monedas tienes de 50 centimos y decirte cuanto has ahorrado
        //Scanner
        Scanner lectorTeclado = new Scanner(System.in);

        int monedas;
        final double VALOR_MONEDAS_50 = 0.50;
        //Contar monedas (usuario)
        System.out.println("Cantidad de monedas: ");
         monedas = lectorTeclado.nextInt();
        //Multiplicar monedas por 0,50 (ahorro)
        double ahorro = monedas *0.50;
        //Dar el resultado
        System.out.println("El dinero total es: " + ahorro);
    }

}
