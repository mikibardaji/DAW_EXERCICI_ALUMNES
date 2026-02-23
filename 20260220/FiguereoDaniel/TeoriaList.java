package Objetos;

import java.util.ArrayList;
import java.util.List;

public class TeoriaList {
    public static void main(String[] args) {
        // TODO code application logic here
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
        Jugadors segundojugador = club.get(1);
        System.out.println("Existe el segundo jugador ?" + club.contains(segundojugador));
        
        
        //borrad el jugador que esta en la posicion 3
        
        Jugadors eliminado = club.remove(3);
        System.out.println("Eliminado: " + eliminado);
        
        for (Jugadors jugadors : club) {
            System.out.println(jugadors);
            
        }

        //borrad el jugador que tenga el dorsal que hayas 
        //escrito en segunda posicion
        
        int dorsalTercero = club.get(2).getDorsal();
        club.remove(new Jugadors (dorsalTercero,""));
        
        System.out.println("Borrado tras indicar posicion ");
         for (Jugadors jugadors : club) {
            System.out.println(jugadors);
            
        }
        
        
        
    }
}
