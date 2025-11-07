/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaperparts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ProgramaPerParts_JEREMYPANCHANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //jugada();
    
       // System.out.println(jugada_ordenador());
       
        //imp_jugada("hello", 1);
      //  imp_ganador(0);
      //  marcador(2, 5);
      
      //puntosPartida();
    
    
    }
    
    
    public static int jugada (){
    
        int valor;
       do {
         Scanner sc = new Scanner (System.in);
        System.out.println(" Que sacas (0 piedra , 1 papel , 2 tijera )");
         valor = sc.nextInt();   
           
       }while (valor>2);
        
        
    return valor;
            
            
            
    }
    
    
    
    public static int jugada_ordenador (){
    
    Random rd = new Random();
    int valor_ordenador = rd.nextInt(0, 3);
    
    
    
    return valor_ordenador;
    
    }
    
    
    public static void imp_jugada (String quien_juega, int choose){
    
       if (choose==0){
           System.out.println(quien_juega);
           System.out.println("Piedra ");
            //  quien_juega = "Piedra";
          
       }
       else if (choose==1){
           System.out.println(quien_juega);
           System.out.println("Papel ");
           //quien_juega = "Papel";
       
       }
           else if (choose==2){
               System.out.println(quien_juega);
           System.out.println("TIjera ");
           //quien_juega = "Tijera";
       
       }
    
    
    
    }
    
    
    
    /**
     * xxx imp_ganador(int ganador):
imprime el ganador de la tirada siguiendo esta regla,
si ganador vale 0 imprimir "hay empate", si es un 1 imprimir "has
ganado", si es 2 debe imprimi que ha ganado el ordenador 0,5 ptos
     */
    
     public static void imp_ganador(int ganador){
    
       if (ganador==0){
        
           System.out.println("Hay empate ");
      
          
       }
       else if (ganador==1){
         
           System.out.println("Has ganado ");
         
       
       }
           else if (ganador==2){
        
           System.out.println("ha ganado el ordenador  ");
          
       
       }}
     
     
     public static void marcador (int point_player1, int point_player2){
     
         System.out.println("Point player 1 : " + point_player1);
              System.out.println("Point player 2 : " + point_player2);
     
     
     }
     

       public static int puntosPartida (){
    
        int valor;
       do {
         Scanner sc = new Scanner (System.in);
        System.out.println(" Cuantos puntos quiere que sea una partida");
         valor = sc.nextInt();   
           
       }while (valor>20);
        
        
    return valor;
            
            
            
    }
     
     
     
     
     
     
    
    
}

