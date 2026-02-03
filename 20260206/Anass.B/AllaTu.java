package allatu;

import java.util.Random;
import java.util.Scanner;

public class AllaTu {

    public static void main(String[] args) {
        int[] listaPremios = {1, 5, 10, 20, 30, 40, 50, 60, 100, 400, 500, 800, 1000, 2000, 5000, 10000, 50000};
        

        Caja[] cajas = sortearCajas(listaPremios);
        
        int cajaJugador = escogerCaja(cajas.length, "Que caja quieres para ti (1-" + cajas.length + "): ");
        int cajaAbrir, turno = 0, ofertaBanquero = 0;
        boolean plantar = false;

        do {
            cajaAbrir = escogerCaja(cajas.length, "Que caja vas a abrir: ");
            

            if (cajas[cajaAbrir].isAbierta() || cajaAbrir == cajaJugador) {
                System.out.println("Esa caja no vale, elige otra.");
                continue; 
            }

            cajas[cajaAbrir].abrirCaja();
            System.out.println("Has perdido " + cajas[cajaAbrir].getPremio() + "€");

            turno = contarTurno(turno);
            mostrarCajasCerradas(cajas, cajaJugador);

            if (turno == 0) {
                ofertaBanquero = llamadaBanquero(cajas);
                System.out.println("Banquero: Mi oferta es " + ofertaBanquero + "€");
                plantar = tePlantas();
            }

        } while (!plantar && quedanCajasPorAbrir(cajas, cajaJugador));

        finalJuego(plantar, ofertaBanquero, cajaJugador, cajas);
    }



    public static Caja[] sortearCajas(int[] premios) {
        Caja[] cajas = new Caja[premios.length];
        Random rd = new Random();
        
        for (int i = 0; i < premios.length; i++) {
            int pos_azar;
            do {
                pos_azar = rd.nextInt(premios.length);
            } while (cajas[pos_azar] != null); 
            
            cajas[pos_azar] = new Caja(premios[i]);
        }
        return cajas;
    }

    public static int llamadaBanquero(Caja[] cajas) {
        int suma = 0;
        int cerradas = 0;
        for (Caja c : cajas) {
            if (!c.isAbierta()) {
                suma += c.getPremio();
                cerradas++;
            }
        }
        return (cerradas == 0) ? 0 : suma / cerradas;
    }

    public static void mostrarCajasCerradas(Caja[] cajas, int cajaJugador) {
        System.out.print("Cajas disponibles: ");
        for (int i = 0; i < cajas.length; i++) {

            if (!cajas[i].isAbierta() && i != cajaJugador) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println("");
    }

    public static boolean quedanCajasPorAbrir(Caja[] cajas, int cajaJugador) {
        int contador = 0;
        for (int i = 0; i < cajas.length; i++) {
            if (!cajas[i].isAbierta() && i != cajaJugador) {
                contador++;
            }
        }
        return contador > 0; 
    }


    public static int escogerCaja(int numCajas, String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int eleccion = sc.nextInt() - 1;
        while (eleccion < 0 || eleccion >= numCajas) {
            System.out.print("Número inválido. Prueba otra vez: ");
            eleccion = sc.nextInt() - 1;
        }
        return eleccion;
    }

    public static int contarTurno(int turno) {
        turno++;
        return (turno == 3) ? 0 : turno;
    }

    public static boolean tePlantas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Aceptas la oferta? (SI/NO): ");
        return sc.nextLine().equalsIgnoreCase("SI");
    }

    public static void finalJuego(boolean plantado, int oferta, int miCaja, Caja[] cajas) {
        if (plantado) {
            System.out.println("¡Te vas con " + oferta + "€!");
            System.out.println("Tu caja (" + (miCaja + 1) + ") tenía: " + cajas[miCaja].getPremio() + "€");
        } else {
            System.out.println("¡Final del juego! Tu caja tiene: " + cajas[miCaja].getPremio() + "€");
        }
    }
}
