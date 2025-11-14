package Tarjetas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double puntsJugador = 0;
        double puntsBanca = 0;
        String resposta;

        do {
            int numero = NumeroCartaAleatori.numeroCartaAleatori();
            int pal = PalCartaAleatori.palCartaAleatori();
            ImprimirCarta.imprimirCarta(numero, pal);
            puntsJugador += PuntsCarta.puntsCarta(numero);
            System.out.println("Punts jugador: " + puntsJugador);

            if (puntsJugador > 7.5) {
                System.out.println("T'has passat! La banca guanya.");
                return;
            }

            System.out.print("Vols una altra carta? (s/n): ");
            resposta = sc.nextLine().trim().toLowerCase();
        } while (resposta.equals("s"));

        
        while (BancaDemanaCarta.bancaDemanaCarta(puntsJugador, puntsBanca)) {
            int numero = NumeroCartaAleatori.numeroCartaAleatori();
            int pal = PalCartaAleatori.palCartaAleatori();
            ImprimirCarta.imprimirCarta(numero, pal);
            puntsBanca += PuntsCarta.puntsCarta(numero);
            System.out.println("Punts banca: " + puntsBanca);
        }

        
        if (GuanyaJugador.guanyaJugador(puntsJugador, puntsBanca)) {
            System.out.println("El jugador guanya!");
        } else {
            System.out.println("La banca guanya!");
        }
        sc.close();
    }
}
