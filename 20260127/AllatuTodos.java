
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AllatuTodos {

    public static void main(String[] args) {
        int[] premios = {10, 50, 100, 0, 1000, 5000, 0, 3, 1, 50000};
        int ContarTurnos = 0;
        int ElegirCaja = 5;

        

        MostrarValorCaja(ElegirCaja, premios, premios);
        MostrarCajasPorAbrir(premios);
        ContarTurno(ContarTurnos);

        //ANAS
        MostrarPremiosRestantes(premios);
        PreguntarAceptasOferta();
        LlamadaBanquero(premios);


        //marc
        //escogerCajaJugador();
       // crearCajas();
       //finalJuego();
       //pedirCajaAbrir();

    




    }

    /*MostrarCajasPorAbrir
    Muestra por pantalla las cajas que aún no han sido abiertas. Muestra por pantalla los números de las cajas cuyo valor no sea 0.
    Entrada:
    int[] cajasPremios
    Salida: nada 
     */
    public static void MostrarCajasPorAbrir(int[] cajasPremios) {
        System.out.println("CAJAS PENDIENTE POR ABRIR : ");
        int contador = 0;
        for (int i = 0; i < cajasPremios.length; i++) {
            if (cajasPremios[i] != 0) {
                System.out.print((i + 1) + " ");
                contador++;
            }
        }
        System.out.println(".......... = " + contador + " PENDIENTE");
    }


    /*ContarTurno
    Controla el número de turnos desde la última llamada del banquero.
    Descripción:
    Incrementa el contador de turnos para saber cuántas cajas se han abierto desde la última oferta.
    Entrada:
    int contador
    Salida:
    int contador → Contador incrementado en 1.
     */
    //UN CONTARDOR NORMAL BASICO.
    public static int ContarTurno(int contador) {
        contador++;
        return contador;
    }


    /*MostrarValorCaja
    Muestra el valor de la caja elegida y la marca como abierta.

int posicionCaja
int[] cajasPremios
int[] premiosOrdenados
Salida:
     */
    public static void MostrarValorCaja(int posicionCaja, int[] cajasPremios, int[] premiosOrdenados) {
        System.out.println("El valor de la caja " + (posicionCaja + 1) + " es: " + cajasPremios[posicionCaja]);
        int premioAbierto = cajasPremios[posicionCaja];
        cajasPremios[posicionCaja] = 0;
        for (int i = 0; i < premiosOrdenados.length; i++) {
            if (premiosOrdenados[i] == premioAbierto) {
                premiosOrdenados[i] = 0;
                break;
            }
        }
    }

    // escogerCajaJugador
    public static int escogerCajaJugador(int numeroCajas) {
        Scanner sc = new Scanner(System.in);

        int cajaElegida;
        do {
            System.out.print("Elige caja (1-" + numeroCajas + "): ");
            while (!sc.hasNextInt()) {
                System.out.print("Entrada no válida. Elige caja (1-" + numeroCajas + "): ");
                sc.next();
            }
            cajaElegida = sc.nextInt();
        } while (cajaElegida < 1 || cajaElegida > numeroCajas);
        return cajaElegida;
    }

    //crearCajas
    public static int[] crearCajas(int[] premiosOrdenados) {
        if (premiosOrdenados == null) {
            return new int[0];
        }
        int n = premiosOrdenados.length;
        int[] copia = Arrays.copyOf(premiosOrdenados, n);
        // Shuffle usando Fisher-Yates
        Random rnd = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int tmp = copia[i];
            copia[i] = copia[j];
            copia[j] = tmp;
        }
        return copia; // cajas con premios desordenados
    }

    //pedirCajaAbrir
    public static int pedirCajaAbrir(int numeroCajas) {
        return escogerCajaJugador(numeroCajas);
    }

    //finalJuego
    public static void finalJuego(boolean plantado, int dineroOferta, int cajaElegida, int[] cajasPremios) {
        if (plantado) {
            System.out.println("Has aceptado la oferta del banquero: " + dineroOferta + "€");
        } else {
            int valor = 0;
            if (cajasPremios != null && cajaElegida >= 1 && cajaElegida <= cajasPremios.length) {
                valor = cajasPremios[cajaElegida - 1];
            }
            System.out.println("No aceptaste la oferta. Tu caja final vale: " + valor + "€");
        }
    }

    //MostrarPremiosRestantes
    public static void MostrarPremiosRestantes(int[] premiosPosibles) {
        for (int i = 0; i < premiosPosibles.length; i++) {
            if (premiosPosibles[i] > 0) {
                System.out.print(premiosPosibles[i] + "-");
            }
        }
    }

    //PreguntarAceptasOferta
    public static boolean PreguntarAceptasOferta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aceptas la ofera del blanquero?");
        String decision = sc.nextLine();

        if (decision.equalsIgnoreCase("Si")) {
            return true;
        } else {
            return false;
        }
    }

    //LlamadaBanquero
    public static int LlamadaBanquero(int[] cajasPremios) {
        int suma = 0;
        int cajasAbrir = 0;
        for (int i = 0; i < cajasPremios.length; i++) {
            if (cajasPremios[i] > 0) {
                /*caja por abrir */
                cajasAbrir++;
                suma += cajasPremios[i];
            }
        }

        int oferta = suma / cajasAbrir;
        return oferta;
    }
}
