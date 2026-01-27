
import java.util.Scanner;

public class ARRAYS {

    public static void main(String[] args) throws Exception {
        int[] notasModulo485;
        notasModulo485 = new int[6];
        ponerNotas(notasModulo485);
        mostrarArray(notasModulo485);
        calcularMedia(notasModulo485);

        System.out.println("Hay " + detectarCuantasRasSuspendidas(notasModulo485) + " RAS suspendidas");
        System.out.println("Hay " + detectarNotasExcelente(notasModulo485) + " notas excelente ");

        recuperacionJunio(notasModulo485);

        if (recuperacionJunio(notasModulo485)) {
            System.out.println("Te toca que ir a recuperacion en junio");
        } else {
            System.out.println("No tienes que ir a recuperacion en junio");
        }
        

        ConsultarNotaRa(notasModulo485);


    }//end of main

    private static void ponerNotas(int[] notasModulo485) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notasModulo485.length; i++) {
            System.out.println("Pon la nota " + (i + 1) + ":");
            notasModulo485[i] = sc.nextInt();
        }

        /*
         * notasModulo485[0] = 4;
         * notasModulo485[1] = 10;
         * notasModulo485[2] = 6;
         * notasModulo485[3] = 8;
         * notasModulo485[4] = 2;
         * notasModulo485[5] = 9;
         */
    }

    private static void mostrarArray(int[] notas) {

        for (int i = 0; i < notas.length; i++) {
            System.out.println("EN LA POSICION " + i + " tienes un " + notas[i]);
        }
    }

    private static void calcularMedia(int[] notas) {
        int notas_acum = 0;
        for (int i = 0; i < notas.length; i++) {
            notas_acum += notas[i];

        }

        System.out.println("total: " + notas_acum);
        double media = (double) notas_acum / notas.length;

        System.out.println("Promedio: " + media);

    }

    public static int detectarCuantasRasSuspendidas(int[] notasModulo485) {
        int contaRasSuspendidas = 0;
        for (int indice = 0; indice < notasModulo485.length; indice++) {
            if (notasModulo485[indice] < 5) {
                contaRasSuspendidas++;
            }
        }
        return contaRasSuspendidas;
    }

    public static int detectarNotasExcelente(int[] notasModulo485) {
        int ontarNotasExelente = 0;
        for (int indice = 0; indice < notasModulo485.length; indice++) {
            if (notasModulo485[indice] >= 9) {
                ontarNotasExelente++;
            }
        }
        return ontarNotasExelente;
    }

    public static boolean recuperacionJunio(int[] notasModulo485) {
        boolean tieneRecuperacion;
        if (detectarCuantasRasSuspendidas(notasModulo485) > 0) {
            tieneRecuperacion = true;
            System.out.println(".......");
        } else {
            tieneRecuperacion = false;
            System.out.println("....... ");
        }
        return tieneRecuperacion;
    }

    public static int ConsultarNotaRa(int[] notasModulo485) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que RA quieres consultar de 1 a 6 ?");
        int user = sc.nextInt();
        return notasModulo485[user - 1];
    }

}//end of class
