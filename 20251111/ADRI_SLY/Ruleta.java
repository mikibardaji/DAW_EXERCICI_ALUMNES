import java.util.Random;
import java.util.Scanner;

public class Ruleta {
    public static void main(String[] args) throws Exception {

        int num = 5;
        pintaAsterisc(num);
        System.out.println();

        System.out.println("voy a imprimir un numero aleatorio entre 0 y 36");
        System.out.println(bola());

        int quentidad_apostar = QuantitatAposta(0);

        System.out.println("Has apostado: " + quentidad_apostar + "quantidad.");

    }
    /*
     * Funció pintaAsterisc: rep un número enter i imprimeix per
     * pantalla tants asteriscs com indiqui el número rebut.
     * Els asteriscs s'han de pintar amb linea (com es va demanar al examen)
     * Al final dels asterisc pintar el numero.
     */

    public static void pintaAsterisc(int numero) {

        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.print(" = " + numero);
    }

    public static int bola() {
        Random rand = new Random();
        return rand.nextInt(0, 37);
    }

    public static int QuantitatAposta(int cantidad){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce la cantidad a apostar: ");
        cantidad = sc.nextInt();
        return cantidad;

    }

    public static int resultatJugada (int tipusAposta,int saldo,int puntsAposta,int bola){
        int guany = 0;
        if (tipusAposta == bola){
            guany = puntsAposta * 36;
        } else {
            guany = puntsAposta;
        }if (tipusAposta == -1 || tipusAposta == -2){
            guany = puntsAposta * 2;
        }
        return guany;
    }

}
