import java.util.Random;
import java.util.Scanner;

public class Ruleta {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el saldo inicial:");
        int saldo = sc.nextInt();

        int total = AfegirPunts(saldo);
        System.out.println(total);

        int quentidad_apostar = QuantitatAposta(0);
        System.out.println("Has apostado: " + quentidad_apostar + " quantidad.");

        System.out.println("voy a imprimir un numero aleatorio entre 0 y 36");
        System.out.println(bola());

        int num = 5;
        pintaAsterisc(num);
        System.out.println();

        int puntos = 700;
        int aposta = apostaPunts(saldo, puntos);
        System.out.println(aposta);
        int tipus = tipusAposta();
        System.out.println(tipus);
    }

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

    public static int QuantitatAposta(int cantidad) {

        
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println(" Introduce la cantidad a apostar: ");
        cantidad = sc.nextInt();
        }while(cantidad < 0);
        
        return cantidad;

    }

    public static int resultatJugada(int tipusAposta, int saldo, int puntsAposta, int bola) {
        int guany = 0;
        if (tipusAposta == bola) {
            guany = puntsAposta * 36;
        } else {
            guany = puntsAposta;
        }
        if (tipusAposta == -1 || tipusAposta == -2) {
            guany = puntsAposta * 2;
        }
        return guany;
    }

    public static int AfegirPunts(int saldo) {
        Scanner sc = new Scanner(System.in);
        int punt;
        do {
            System.out.println("Quants punts vols afegir al saldo?");
            punt = sc.nextInt();
        } while (punt < 0);

        return saldo + punt;
    }

    public static int apostaPunts(int puntsTotal, int puntsAposta) {
        Scanner sc = new Scanner(System.in);
        int punt_apostar;
        System.out.println("Quants punts vols apostar?");
        puntsAposta = sc.nextInt();
        if (puntsAposta <= puntsTotal) {
            punt_apostar = puntsAposta;
        } else {
            punt_apostar = -1;
        }
        return punt_apostar;
    }

    public static int tipusAposta() {
        Scanner sc = new Scanner(System.in);
        int tipo_aposta;
        System.out.println("Quin tipus d'aposta vols fer? 1/36 Numero concret, -1 SENAR, -2 PARELL");
        tipo_aposta = sc.nextInt();
        return tipo_aposta;
    }

}
