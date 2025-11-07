import java.util.Scanner;

public class FuncionsEx2 {
    public static boolean mayor(int a) {
        return a >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad_usuario;

        do {
            System.out.print("Introduce tu edad: ");
            edad_usuario = sc.nextInt();
        } while (edad_usuario <= 0);

        if (mayor(edad_usuario)) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
