import java.util.Scanner;

public class CondicionalDotze {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
    char colorsemaforo;
    System.out.println("Introduce el color del semaforo (R-Rojo, N-Naranja, V-verde): ");
    colorsemaforo= sc.next().charAt(0);

    if (colorsemaforo == 'V' || colorsemaforo == 'v') {

            System.out.println("Puedes pasar");

        } else if (colorsemaforo == 'N'|| colorsemaforo == 'n') {

            System.out.println("Debes esperar");

        } else if (colorsemaforo == 'R' || colorsemaforo == 'r') {

            System.out.println("Detente");
        } else {
            
            System.out.println("Valor incorrecto, introduce V, N o R");
        }
        sc.close();

    }

}
