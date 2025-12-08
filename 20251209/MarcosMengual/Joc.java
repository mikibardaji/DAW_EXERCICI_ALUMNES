package Joc;

import java.util.Random;

public class Joc {
    
    private Jugador jugador;
    private String nivel;

    public void Joc(String nombre, String nivel) {
    
       if (nivel.equals("facil") || nivel.equals("dificil ")){
       
       this.nivel = nivel;
       
       } 
       else{
       
       this.nivel = "facil";
       
       } 
       
       this.jugador = new Jugador (nombre, 0);
           
    }
    
    
public void jugar() {

        System.out.println("----- COMIENZA EL JUEGO -----");
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Nivel: " + nivel);
        System.out.println("---------------------------");

        
        while (jugador.getEnergia() > 0) {

        
            jugador.correr();

       
            int dificultat = (int)(Math.random() * 5) + 1;
            Obstaculo ob = new Obstaculo("barrera", dificultat);

           
            ob.interactuar(jugador);

        
            Moneda coin = new Moneda();
            jugador.recogerMoneda(coin);

           
            if (jugador.isPower_up()) {
                System.out.println("Power-Up ACTIVADO: corres el triple!");
            } else {
                System.out.println("Power-Up DESACTIVADO");
            }

       
            System.out.println("Distància: " + jugador.getDistancia_acumulada() +
            " | Energia: " + jugador.getEnergia() +
            " | Puntos: " + jugador.getPuntuacion());
            System.out.println("---------------------------------------");
        }

    
        System.out.println("===== FIN DE LA PARTIDA =====");
        System.out.println("Metros recorridos: " + jugador.getDistancia_acumulada());
        System.out.println("Monedas conseguidas: " + jugador.getPuntuacion());
    }    
}

