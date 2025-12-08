package objetos;

import java.util.Random;

public class Joc {
    Jugador jugador;
    String nivellDificultat;

    public Joc(String nom, String nivell) {
        this.jugador = new Jugador(nom);
        if (nivell.equalsIgnoreCase("facil") || nivell.equalsIgnoreCase("dificil")) {
            this.nivellDificultat = nivell.toLowerCase();
        } else {
            this.nivellDificultat = "facil";
        }
        System.out.println("Joc: Iniciat amb el jugador " + nom + " en mode " + nivellDificultat);
    }

    public void jugar() {
        Random rand = new Random();
        System.out.println("Joc: Comença la partida!");

        while (jugador.getEnergia() > 0) {
            System.out.println("--- Nou Torn ---");

            jugador.correr();

            int event = rand.nextInt(2) + 1;

            Obstacle obstacle = null;
            if (event == 1) {
                obstacle = new Obstacle();
                obstacle.tipus = "barrera";
                obstacle.dificultat = rand.nextInt(5) + 1;
                System.out.println("Joc: Ha aparegut una barrera.");
            } else if (event == 2) {
                obstacle = new Obstacle();
                obstacle.tipus = "tren";
                obstacle.dificultat = rand.nextInt(6) + 5;
                System.out.println("Joc: Ha aparegut un tren.");
            }

            if (obstacle != null) {
                jugador.xocar(obstacle);
            }

            Moneda moneda = new Moneda();
            jugador.recollirMoneda(moneda);
        }

        System.out.println("--- Fi de la Partida ---");
        System.out.println("Joc: El jugador " + jugador.nom + " s'ha quedat sense energia.");
        System.out.println("Resultat Final:");
        System.out.println("Metres recorreguts: " + jugador.getDistanciaAcumulada());
        System.out.println("Puntuació (Monedes): " + jugador.getPuntuacio());
    }
}
