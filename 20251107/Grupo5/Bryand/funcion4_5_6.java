/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego_funciones;

/**
 *
 * @author alumne
 */
public class Juego_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imp_ganador(1);
        marcador(3,5);
        System.out.println(aumentar_punto(3) + " Puntos");
    }
    
    public static void imp_ganador(int ganador){
        if(ganador == 0){
            System.out.println("Hay empate");
        }else if(ganador == 1){
            System.out.println("Has ganado");
        }else if(ganador == 2){
            System.out.println("Ha ganado el ordenador");
        }
    }
    
    public static void marcador(int point_player1, int point_player2){
        System.out.println("Usuario " + point_player1 + " | " + point_player2 + " Ordenador");
    }
    
    public static int aumentar_punto(int score){
        score++;
        return score;
    }
}
