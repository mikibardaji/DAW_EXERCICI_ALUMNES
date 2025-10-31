
// Pedir color del semáforo al usuario

// Si color == "V"
//     Mostrar "Puedes pasar"
// Si color == "N"
//     Mostrar "Debes esperar"
// Si color == "R"
//     Mostrar "Detente"



import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    char colorsemaforo;
    System.out.println("Introduce el color del semaforo (R-Rojo, N-Naranja, V-verde): ");
    colorsemaforo= sc.next().charAt(0);

    if (colorsemaforo == 'V' || colorsemaforo =='v') {

            System.out.println("Puedes pasar");

        } else if (colorsemaforo == 'N') {

            System.out.println("Debes esperar");

        } else if (colorsemaforo == 'R') {

            System.out.println("Detente");
        } else {
            
            System.out.println("Valor incorrecto, introduce V, N o R");
        }

}
}

