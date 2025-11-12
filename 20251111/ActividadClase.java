import java.util.Random;
import java.util.Scanner;

public class ActividadClase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int valor_aleatorio = rd.nextInt(0,37);
        int saldo = 0;
        saldo = AfegirPunts(saldo);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println(pintaAsterisc(saldo) + saldo);
        int apuesta = tipusAposta();
        int tipus = 0;
    
        System.out.print("Quants punts vols apostar? ");
        int aposta = sc.nextInt();
        int valid = apostaPunts(saldo, aposta);
    }
    public static int QuantitatAposta()
    {
        return 0;
    }

    public static int AfegirPunts(int saldo) 
    {
        int punts;
        do {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quants punts vols afegir al teu saldo? ");
        punts = sc.nextInt();
        return saldo + punts;
        }while (punts < 0);
    }

    public static String pintaAsterisc(int numero) 
    {
        String resultado = "";
        for (int i = 0; i < numero; i++) {
            resultado += "*";
        }
        return resultado;
    }

    public static int bola() 
    {
        Random rd = new Random();
        int valor_aleatorio = rd.nextInt(0,37);
        return 0;
    }

    public static int tipusAposta() 
    {
        Scanner sc = new Scanner(System.in);
        int apuesta;
        int num;
    
        System.out.println(" Que tipo de apuesta quieres hacer? ");
        System.out.println(" Apostar a un numero del 1 al 36 (1)");
        System.out.println(" Apostar a parell (2) ");
        System.out.println(" Apostar a senar (3)");
        apuesta = sc.nextInt();
        while (true)
        if (apuesta == 1) {
            System.out.print(" Introduce un numero entre (1-36): ");
            num = sc.nextInt();
            while (num < 1 || num > 36) {
                System.out.print(" Numero no valido, intentalo de nuevo: ");
                num = sc.nextInt();
            }
            return num;
        } 
        else if (apuesta == 2) 
        {
            return -2; 
        } 
        else if (apuesta == 3) 
        {
            return -1; 
        } 
        else 
        {
            System.out.println(" Opcion no valida. Se vuelve al menu ");
            return 0;
        }
    }

    public static int apostaPunts(int puntsTotal, int puntsAposta) {
        if (puntsAposta <= 0 || puntsAposta > puntsTotal) {
            System.out.println(" No se puede apostar esta cantidad.");
            return -1;
        } else {
            return puntsAposta;
        }
    }
}
