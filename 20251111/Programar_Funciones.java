import java.util.Random;
import java.util.Scanner;

public class Programar_Funciones {
    public static void main(String[] args) {
        int importe, tipo_apuesta;
        importe = AfegirPunts(0);
        
        pintaAsterisc(8);
        tipo_apuesta = tipusAposta();
    }
    public static int AfegirPunts(int saldo)
    {
        Scanner sc = new Scanner(System.in); 
        int saldo_actual = 0, puntos;
        System.out.println("Cuanto es tu importe ");
        puntos = sc.nextInt();
        saldo_actual = puntos + saldo_actual;
        System.out.println("tu saldo actual es de " + saldo_actual);
        return puntos;
    }
    public static void pintaAsterisc(int numero) {
        for (int i = 1; i <= numero; i++) {
                System.out.print("*");
            }
        }
    public static int bola() {
        Random rd = new Random();
        int Numero;
        Numero = rd.nextInt(0,37);
        return Numero;
    }
    public static int tipusAposta()
    {
    Scanner sc = new Scanner(System.in);
    int Valor;
    System.out.println(" Que apuesta haras (del 1 al 36)");
    Valor = sc.nextInt();
    if (Valor%2 !=0) {
        System.out.println("Impar");
    }
    else {
        System.out.println("Par");
    }
    return Valor;
    }

}