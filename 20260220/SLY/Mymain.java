/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teorialist;

import java.util.ArrayList;

/**
 *
 * @author sta4501
 */
public class Mymain {

    public static void main(String[] args) {

        //crear un array club de football
        ArrayList<Jugadors> football;
        football = new ArrayList<>();
        //inserta 4 jugadores pori codigo
        Jugadors j1 = new Jugadors(7, "Cristiano");
        Jugadors j2 = new Jugadors(10, "Messi");
        Jugadors j3 = new Jugadors(8, "Sylvester");
        Jugadors j4 = new Jugadors(11, "Neymar");

        football.add(j1);
        football.add(j2);
        football.add(j3);
        football.add(j4);

        //mostrar arraylist
        for (Jugadors datos : football) {
            System.out.println(datos);
        }
        System.out.println("JUGADORES EQUIPOS");
        
        //preguntar si existe el segundo jugador insertado
        System.out.println("Esta Cristiano? " + football.contains(j2));
        
        //borrar el jugador que esta en posicion 3
         System.out.println("Borro a trump " + football.remove(j4));
         
         System.out.println("=================== NEW LIST ======================");
         
          for (Jugadors datos : football) {
            System.out.println(datos);
        }
        
        
        //borrar el jugador que tenga el dorsal que hayas escrito en 2 posicion s
         System.out.println("Borro a Neymar " + football.remove("Neymar"));
        
        
        
    }

}
