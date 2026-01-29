import java.util.Scanner;

public class TeoriaArrays {

    public static void main(String[] args) {

        int[] notasModulo485 = new int[6];

        ponerNotas(notasModulo485);
        mostrarArray(notasModulo485);
        calcularMedia(notasModulo485);
        detectarCuantasRasSuspendidas(notasModulo485);
    }

    /* Pregunta las notas al usuario y las introduce en el array */
    private static void ponerNotas(int[] notasModulo485) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notasModulo485.length; i++) {
            System.out.print("Pon la nota " + (i + 1) + ": ");
            notasModulo485[i] = sc.nextInt();
        }
    }

    /* Muestra el contenido del array */
    private static void mostrarArray(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("En la posición " + i + " tienes un " + notas[i]);
        }
    }

    /* Calcula y muestra la media */
    private static void calcularMedia(int[] notas) {
        int notasAcum = 0;

        for (int i = 0; i < notas.length; i++) {
            notasAcum += notas[i];
        }

        double media = (double) notasAcum / notas.length;
        System.out.println("La media es: " + media);
    }

    /* Detecta cuántas asignaturas están suspendidas */
    private static void detectarCuantasRasSuspendidas(int[] notas) {
        int suspendidas = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                suspendidas++;
            }
        }

        System.out.println("Tienes " + suspendidas + " asignaturas suspendidas");
    }
}
