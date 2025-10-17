import java.util.Scanner;

public class pinBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin;
        int contador = 0;

        do {
            System.out.println("Que numero crees que he pensado");
            pin = sc.nextInt();
            if (pin == 1234 ) {
                System.out.println("Puedes sacar dinero");
            } else {
                System.out.println("Pin incorecto, vuelvelo a intentar");
            }
            contador++;
        } while (pin != 1234 && contador < 2);
    }
}