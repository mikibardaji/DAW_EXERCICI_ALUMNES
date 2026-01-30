import java.util.Random;
import java.util.Scanner;

public class Ejercicio_programa_television {
private static Scanner sc;
public static void main(String[] args) {
    
    PremiosPosibles();
    System.out.println(escogerCajaJugador(4));
    System.out.println(llamadaBanquero(PremiosPosibles()));;
    mostrarCajasPorAbrir(PremiosPosibles());
    int[] cajas = {1,0,2,3,4,6};
    mostrarCajasPorAbrir(cajas);
    mostrarPremiosRestantes(cajas);
    }

    public static int[] PremiosPosibles() {
        int[] premios = {10,50,100,500,1000,50000};
        System.out.println("--- ESTOS SON LOS PREMIOS RESTANTES ---");
        for(int i = 0; i < premios.length; i++){
            System.out.print(premios[i] + "-");
        }
        return premios;
    }
    public static int escogerCajaJugador(int numeroCajas) {
        Scanner sc = new Scanner(System.in);

        int caja;

        do {
            System.out.print("Elige tu caja (1-" + numeroCajas + "): ");
            caja = sc.nextInt();
        } while (caja < 1 || caja > numeroCajas);

        return caja - 1;
    }    
    public static int llamadaBanquero(int[] cajasPremios) {

    int suma = 0;
    int contador = 0;

    for (int i = 0; i < cajasPremios.length; i++) {

        if (cajasPremios[i] != 0) {

            suma += cajasPremios[i];
            contador++;
        }
    }

    if (contador == 0) return 0;

    return suma / contador;
    
}
    public static void mostrarCajasPorAbrir(int[] cajas) {

        System.out.print("Cajas disponibles: ");

        for (int i = 0; i < cajas.length; i++) {

            if (cajas[i] != 0) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println();
    }
    public static void mostrarPremiosRestantes(int[] premios) {

        System.out.print("Premios restantes: ");

        for (int i =0; i< premios.length; i++) {


            if (premios[i] != 0) {
                System.out.print(premios[i] + "€ ");
            }
        }

        System.out.println();
    }
    public static boolean preguntarAceptasOferta() {
        System.out.println("Aceptas oferta? (s/n)?");
        char respuesta = sc.nextLine().charAt(0);
        boolean siono= false;
        switch (respuesta) {
            case 'S':
            case 's':
                siono = true;

                
                
                break;
            
        
           
        }
        return siono;
    }    
    public static int contarTurno(int contador) {

        return contador + 1;
    }
     public static int pedirCajaAbrir(int numeroCajas) {

        int caja;

        do {
            System.out.print("¿Qué caja quieres abrir? (1-" + numeroCajas + "): ");
            caja = sc.nextInt();
        } while (caja < 1 || caja > numeroCajas);

        return caja - 1;
    }
    public static int[] crearCajas(int[] premios) {

        Random r = new Random();

        int[] cajas = new int[premios.length];
        boolean[] usadas = new boolean[premios.length];

        for (int i = 0; i < premios.length; i++) {

            int pos;

            do {
                pos = r.nextInt(premios.length);
            } while (usadas[pos]);

            usadas[pos] = true;

            cajas[pos] = premios[i];
        }

        return cajas;
    }
    
    public static void finalJuego(boolean plantado,
                                  int oferta,
                                  int cajaJugador,
                                  int[] cajas) {

        System.out.println("\n=== FINAL ===");

        if (plantado) {

            System.out.println("Has ganado: " + oferta + "€");

        } else {

            System.out.println("Tu caja tenía: " +
                    cajas[cajaJugador] + "€");
        }
    }


        
}




