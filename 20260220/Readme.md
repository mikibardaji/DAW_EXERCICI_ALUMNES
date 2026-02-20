# Complimentar el codi a les linies de comentari que ficava TO DO

## Recordeu que la classe Jugadors,no esta en aquest codi, sino que es troba al Repositori DAW_M0485_2526, perque sino no us funcionarà.

```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teorialist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class TeoriaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creame un arraup ClubFutbol
        List<Jugadors> club;
        club = new ArrayList();
        //inserteis 4 jugadores
        //opcion correcta
        //crear variable con todos los atributos
        //y luego insertan
        Jugadors j1 = new Jugadors(1, "Ter Stegen");
        club.add(j1);
       
        club.add(new Jugadors(5, "Busquets"));
        club.add(new Jugadors(10, "Messi"));
        club.add(new Jugadors(12, "Villa"));
        club.add(new Jugadors(4,"Puyol"));
       
        for (Jugadors jugadors : club) {
//            System.out.println(jugadors.getDorsal()
//            + " - " + jugadors.getNom());
            System.out.println(jugadors); //toString
        }
        System.out.println("Jugadores equipo: " + club.size());
        //fore listaor
       
        System.out.println("Voy a preguntar"
                + "si tengo a 5 busquets");
       
        Jugadors existe = new Jugadors(5, "Busquets");
        System.out.println(club.contains(existe));
        existe = new Jugadors(1,"Courtois");
        System.out.println(club.contains(existe));
       
        //me pregunteis si existe el
        //segundo jugador que has insertado

```      
        **// TO DO borrad el jugador que esta en la posicion 3**
        **// TO DOborrad el jugador que tenga el dorsal que hayas**
        **//escrito en segunda posicion**
      
        **//TO DO LISTAR TODOS LOS JUGADORES.**
  //la clase jugadors esta en github en los codigos de profesor.
```java 
       
    }

```
