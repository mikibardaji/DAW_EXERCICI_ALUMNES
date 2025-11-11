import java.util.Random;
import java.util.Scanner;

public class ruleta {
    public static void main(String[] args) {
        System.out.println("=== TEST DE FUNCIONES DE RULETA ===");

        // System.out.println(" Probando afegirPunts()");
        // int saldo = afegirPunts(0);
        // System.out.println("Saldo actual: " + saldo + " punts.");

        // System.out.println(" Probando apostaPunts()");
        // int puntsTotal = 10;
        // int puntsAposta = 0;
        // int aposta = apostaPunts(puntsTotal, puntsAposta);
        // if (aposta == -1) {
        // System.out.println("No puedes apostar más de lo que tienes.");
        // } else {
        // System.out.println("Has apostado: " + aposta + " punts.");
        // }

        // System.out.println(" Probando bola()");
        // int resultatBola = bola();
        // System.out.println("La bola ha caído en el número: " + resultatBola);

        // System.out.println(" Probando pintaAsterisc()");
        // pintaAsterisc(5);

        // System.out.println(" Probando QuantitatAposta()");
        // int quantitat = QuantitatAposta();
        // System.out.println("Has apostado: " + quantitat + " punts.");

        // System.out.println("Probando tipoApuesta()");
        // int tipo = tipoApuesta();
        // System.out.println("Tipo de apuesta seleccionado: " + tipo);



    }

    public static int afegirPunts(int saldo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos puntos quieres añadir?");
        saldo = sc.nextInt();
        return saldo;
    }

    public static int apostaPunts(int puntsTotal, int puntsAposta) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantitat total de punts disponibles ?");
        puntsTotal = sc.nextInt();
        System.out.println("Quantitat de punts que vol apostar ?");
        puntsAposta = sc.nextInt();

        if (puntsTotal < puntsAposta) {
            return -1;
        } else {
            return puntsAposta;
        }
    }

    public static int bola() {
        Random rd = new Random();
        int bola = rd.nextInt(0, 37);
        return bola;
    }

    public static int pintaAsterisc(int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.println("-" + numero);
        return numero;
    }

    public static int QuantitatAposta() {
        Scanner sc = new Scanner(System.in);
        int quantitataposta;

        do {
            System.out.println("Quina quantitat vols apostar?");
            quantitataposta = sc.nextInt();

            if (quantitataposta < 0) {
                System.out.println("Numero no valido ");
            } else if (quantitataposta == 0) {
                System.out.println("Has salido del juego");
            }
        } while (quantitataposta < 0 || quantitataposta != 0);
        return quantitataposta;
    }

    public static int resultadoJugada(int tipoApuesta, int saldo, int puntos, int puntosApuesta, int bola) {
        if (tipoApuesta == bola) {
            System.out.println("Has ganado " + saldo);
            saldo += puntosApuesta * 36;
        } else if (tipoApuesta == -1 && bola % 2 == 0) {
            System.out.println("Has adivinado en num par" + saldo);
            saldo += puntosApuesta * 2;
        } else if (tipoApuesta == -2 && bola % 2 != 0) {
            System.out.println("Has adivinado en num impar" + saldo);
            saldo += puntosApuesta * 2;
        } else {
            System.out.println("Has fallado");
        }
        return saldo;

    }

  
    public static int tipoApuesta() {
        Scanner sc = new Scanner(System.in);
        int apuesta;

        do{
        System.out.println("Que tipo de apuesta haras?");
        apuesta = sc.nextInt();
        } while (!(apuesta ==-2 || apuesta ==-1 || (apuesta >=1 && apuesta <=36)));
        return apuesta;
    }

}



