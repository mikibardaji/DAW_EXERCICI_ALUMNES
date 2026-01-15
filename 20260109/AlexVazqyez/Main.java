import java.util.Scanner;
import Objectes.Agua;
import Objectes.Electrico;
import Objectes.LlistaNoms;
import Objectes.Pokemon;
import Objectes.Veneno;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pokemon p1 = crearPokemon(sc, 1);
        Pokemon p2 = crearPokemon(sc, 2);

        while(p1.isVivo() && p2.isVivo()){
            p2.recibirImpacto(p1);
            if(p2.isVivo())
                p1.recibirImpacto(p2);
        }

        System.out.println("Combat finalitzat.");
    }

    private static Pokemon crearPokemon(Scanner sc, int num){
        System.out.println("Nom Pokemon " + num + ":");
        LlistaNoms nom = LlistaNoms.valueOf(sc.nextLine());

        System.out.println("Tipus (aigua/electric/veri):");
        String tipus = sc.nextLine();

        if(tipus.equalsIgnoreCase("aigua")) return new Agua(nom);
        if(tipus.equalsIgnoreCase("electric")) return new Electrico(nom);
        return new Veneno(nom);
    }

    
}
