import java.util.Random;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num_pensado_maquina = rd.nextInt(1, 101);
        int usuario;
        int contador = 0;

        do {
            System.out.println("Que numero crees que he pensado");
            contador++;
            usuario = sc.nextInt();
            if (usuario == num_pensado_maquina) {
                System.out.println("Acertaste");
            } else if (usuario < num_pensado_maquina) {
                System.out.println("El numero es mayor");
            } else if (usuario > num_pensado_maquina) {
                System.out.println("El numero es menor");
            }
        } while (usuario != num_pensado_maquina && contador <= 6);

        if (usuario != num_pensado_maquina) {
            System.out.println("Has perdido");
        }

        sc.close();
    }
}