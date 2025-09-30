import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        //Introducció de dades
        Scanner sc = new Scanner(System.in);

        final int METRES_PER_VOLTA = 400;
//Preguntar al usuari quantes voltes ha fet
        System.out.print("Introdueix el nombre de voltes: ");
        int voltes = sc.nextInt();
//Càlcul per saber quants metres ha recorregut
        int distancia = voltes * METRES_PER_VOLTA;
//Mostrar al usuari quants metres a recorregut
        System.out.println("Has recorregut " + distancia + " metres.");
//Tancar 
        sc.close();
    }

}

