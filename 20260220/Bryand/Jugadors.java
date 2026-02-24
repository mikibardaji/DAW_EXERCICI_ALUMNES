import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeoriaList {
    public static void main(String[] args) throws Exception {

    }
        //creame un arraup ClubFutbol
        private static void clubFutbol() {
            List<Jugadors> club;
            club = new ArrayList<>();
        //inserteis 4 jugadores
        //opcion correcta
        //crear variable con todos los atributos
        //y luego insertan
            Jugadors j1 = new Jugadors(1, "Courtois");
            Jugadors j2 = new Jugadors(10, "Messi");
            Jugadors j3 = new Jugadors(2, "Balde");
            Jugadors j4 = new Jugadors(7, "Cristiano");

            for (Jugadors jugadors : club) {
                System.out.println(jugadors.getDorsal()
                + " - " + jugadors.getNom());
            }
            
            club.add(j1);
            club.add(j2);
            club.add(j3);
            club.add(j4);

        //fore listaor
        System.out.println("Jugadores en plantilla: "
               + club.size());
        //me pregunteis si existe el
        //segundo jugador que has insertado
        System.out.println("Dentro de la plantilla esta Cristiano? " 
                + club.contains(new Jugadors(7, "Cristiano")));
        //borrad el jugador que esta en la posicion 3
        System.out.println("Borro al tercer jugador " 
                + club.remove(2));
        //borrad el jugador que tenga el dorsal que hayas
        //escrito en segunda posicion.
        System.out.println("Borro al jugador del dorsal 10 (en segunda posicion)"
                + club.remove(10));
        /* System.out.println("Borro al jugador de segunda posición")
                + club.remove(1); */
        
        
        //crearAgenda();
        }

    

        private static void crearAgenda() {
        List<String> agenda; //para poder aceptar polimorfismo
        //podria ser ArrayList o LinkedList
        agenda = new ArrayList<>(); //deja de ser null para ser 
        // un array List.
        //agenda = new LinkedList<>();

        //List<int> pepe; //No porque no es un objeto

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
            System.out.println(agenda.get(i)); //agenda [i]
        }
        System.out.println("Nombres en agenda: " + agenda.size());


        System.out.println("Iterador recorre mas rapido");
        Iterator<String> iterador = agenda.iterator();
        while (iterador.hasNext()) {
            String nombre = iterador.next();
            System.out.println(nombre);
        }

        //saber si esta un elemento (String)
        System.out.println("Esta Messi? " 
                + agenda.contains("Messi"));
        System.out.println("Esta Florentino? " 
                + agenda.contains("Florentino"));

                System.out.println("En que posicion esta Messi"
                       + agenda.indexOf("Messi")); //La posicion que se
                       // encuentra el objeto dentro del array

                System.out.println("En que posicion esta Florentino"
                        + agenda.indexOf("Florentino"));


                System.out.println("Borro a Trump" + agenda.remove("Trump"));
                System.out.println("Borro la posicion 0 " + agenda.remove(0));
                System.out.println("Agenda despues de borrar");
                for (String nombre : agenda) {
                    System.out.println(nombre);
                }

                agenda.add(0,"Oscar");
                System.out.println("Agenda despues de añadir a Oscar");
                for (String nombre : agenda){
                    System.out.println(nombre);
                    }
    }

}

