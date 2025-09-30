import java.util.Scanner;

public class Distancia2 {
     public static void main(String[] args) {
        //Introducció de les dades
        Scanner sc = new Scanner(System.in);

        final int METRES_PER_VOLTA = 400;
//Preguntar al usuaris quantes voltes ha fet
        System.out.print("Introdueix el nombre de voltes: ");
        int voltes = sc.nextInt();
//Càlcul de les voltes multiplicat per els metres que hi ha en cada volta i els km
        int distancia = voltes * METRES_PER_VOLTA;
        double km = distancia / 1000; 
//Mostrar al usuari quants metres ha recorregut i el cambi a km
        System.out.println("Has recorregut " + distancia + " metres.");
        System.out.println("Això són " + km + " km.");
//Tancar
        sc.close();
    }


}
