
package Joc;
import java.util.Random;

public class Joc {
    
    private Jugador jugador;
    private String nivel;

    public Joc(String nom, String nivell) {
    
       if (nivell.equals("facil") || nivell.equals("dificil ")){
       
       this.nivel = nivel;
       
       } 
       else{
       
       this.nivel = "facil";
       
       } 
       
       this.jugador = new Jugador (nom, 0);
       
       
        
    }
    
    
public void jugar() {

        System.out.println("----- COMENÇA EL JOC -----");
        System.out.println("Jugador: " + jugador.getNom());
        System.out.println("Nivell: " + nivel);
        System.out.println("---------------------------");

        
        while (jugador.getEnergia() > 0) {

        
            jugador.correr();

       
            int dificultat = (int)(Math.random() * 5) + 1;
            Obstacle ob = new Obstacle("barrera", dificultat);

           
            ob.interactuar(jugador);

        
            Moneda coin = new Moneda();
            jugador.recollirMoneda(coin);

           
            if (jugador.isPower_up()) {
                System.out.println("Power-Up ACTIVAT: corres el triple!");
            } else {
                System.out.println("Power-Up DESACTIVAT");
            }

       
            System.out.println("Distància: " + jugador.getDistancia_acumulada() +
                               " | Energia: " + jugador.getEnergia() +
                               " | Punts: " + jugador.getPuntuacio());
            System.out.println("---------------------------------------");
        }

    
        System.out.println("===== FI DE LA PARTIDA =====");
        System.out.println("Metres recorreguts: " + jugador.getDistancia_acumulada());
        System.out.println("Monedes aconseguides: " + jugador.getPuntuacio());
    }
    
    
    
    
    
    
  
    
}
