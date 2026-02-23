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
        List<Jugadors> ClubFutbol;
        ClubFutbol = new ArrayList();
        //inserteis 4 jugadores
        //opcion correcta
        //crear variable con todos los atributos
        //y luego insertan
        Jugadors j1 = new Jugadors(13, "Baru");
        ClubFutbol.add(j1);
        Jugadors j2 = new Jugadors(11, "Isagi");
        ClubFutbol.add(j2);
        Jugadors j3 = new Jugadors(7, "Nagi");
        ClubFutbol.add(j3);
        Jugadors j4 = new Jugadors(8, "Bachira");
        ClubFutbol.add(j4);
        Jugadors j5 = new Jugadors(10,"Rin");
        ClubFutbol.add(j5);

        ClubFutbol.add(new Jugadors(4,"Chigiri"));

        


        for (Jugadors jugadors : ClubFutbol) {
//            System.out.println(jugadors.getDorsal()
//            + " - " + jugadors.getNom());
            System.out.println(jugadors); //toString
        }
        System.out.println("Jugadores equipo: " + ClubFutbol.size());
        //fore listaor
       
        System.out.println("Voy a preguntar"
                + "si tengo a 11 Isagi");

        //BORRA EL JUGADOR Nº 3

        System.out.println("Borro al jugador nº 3: " + ClubFutbol.remove(2));

        //BORRA EL JUGADOR QUE TENGA EL DORSAL QUE HAYAS PUESTO EN SEGUNDA POSICIÓN

        int dorsalSegundaPos = ClubFutbol.get(1).getDorsal();
        ClubFutbol.remove(new Jugadors(dorsalSegundaPos, ""));

        for (Jugadors j : ClubFutbol) {
        System.out.println(j);
        }
        Jugadors existe = new Jugadors(11, "Isagi");
        System.out.println(ClubFutbol.contains(existe));
        existe = new Jugadors(14,"Reo");
        System.out.println(ClubFutbol.contains(existe));
       
        //me pregunteis si existe el
        //segundo jugador que has insertado
    }
}
