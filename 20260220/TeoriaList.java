/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teorialist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class TeoriaList {

    /**
     * @param args the command line arguments
     */
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
        
        club.remove(3);
        
        for (Jugadors jugadors : club) {
            System.out.println(jugadors);
            
        }
        //borrad el jugador que tenga el dorsal que hayas 
        //escrito en segunda posicion
        
        int dorsalSegundopos = club.get(1).getDorsal();
        club.remove(new Jugadors (dorsalSegundopos,""));
        System.out.println("Borrado tras indicar posicion ");
         for (Jugadors jugadors : club) {
            System.out.println(jugadors);
            
        }
        
        
        
    }

    private static void crearAgenda() {
        List<String> agenda; //para poder aceptar polimorfismo 
        //podria ser ArrayList o LinkedList
        agenda = new ArrayList<>(); //deja de ser null para ser
        //un array List
        //agenda = new LinkedList<>();
        
        //List<int> pepe; //no porque no es un objeto
        
        System.out.println("Nombres en agenda: " + agenda.size());
        //
        agenda.add("MrBeast");
        agenda.add("Trump");
        agenda.add("Messi");
        
        //fore+Tabulador
        System.out.println("For each");
        for (String nombre : agenda) {
            System.out.println(nombre);
        }
        System.out.println("Nombres en agenda: " + agenda.size());
        System.out.println("For normal");
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i)); //agenda[i]
        }
        System.out.println("Nombres en agenda: " + agenda.size());
        
        
        System.out.println("Iterador recorre mas rapido");
        Iterator<String> iterador = agenda.iterator();
        while(iterador.hasNext())
        {
            String nombre = iterador.next();
            System.out.println(nombre);
        }
        
        //saber si esta un elemento (String)
        System.out.println("Esta Messi? " 
                + agenda.contains("Messi")); //true o false
        System.out.println("Esta Florentino? " 
                + agenda.contains("Florentino"));
        
        System.out.println("En que posicion esta MEssi" 
        + agenda.indexOf("Messi")); //la posicion que se
        //encuentra el objeto dentro del array
        System.out.println("En que posicion esta messi" 
        + agenda.indexOf("messi")); //la posicion que se
        
        System.out.println("Borro a trump " + agenda.remove("Trump"));
        System.out.println("Borro la posicion 0" + agenda.remove(0));
        System.out.println("agenda despues de borrar");
        for (String nombre : agenda) {
            System.out.println(nombre);
        }
        
        agenda.add(0,"Oscar");
        System.out.println("agenda despues de añadir a Oscar");
        for (String nombre : agenda) {
            System.out.println(nombre);
        }
    }
    
}
