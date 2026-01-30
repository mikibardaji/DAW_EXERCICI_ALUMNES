import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int[] premis = {10,50,0,500,0,10000,50000,100000};


        //System.out.println(pedirCajaAbrir(premis.length));
        //System.out.println(preguntarAceptasOferta());
        mostrarCajasPorAbrir(premis);
    }
     public static int pedirCajaAbrir(int numeroCajas){

        int numCaja;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Elige un número de caja:  1-" + numeroCajas);
            numCaja =sc.nextInt();
        } while ( !(numCaja>= 1 && numCaja <=numeroCajas)); 
            return numCaja;
    }

    public static boolean preguntarAceptasOferta(){

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Aceptas la oferta del banquero? S/N");
        char respuestaOferta = sc.nextLine().charAt(0);

        if (respuestaOferta == 'S') {
            System.out.println("El jugador acepta la oferta.");
            return true;
        } else {
            System.out.println("El jugador sigue jugando.");
            return false;
        }
    } 

    public static void mostrarCajasPorAbrir(int [] cajasPremios){
        for (int i = 0; i < cajasPremios.length; i++) {
            if (cajasPremios[i] !=0) {
                System.out.print(" Caja " + (i+1)); 
            }
           
        }
    }


}
