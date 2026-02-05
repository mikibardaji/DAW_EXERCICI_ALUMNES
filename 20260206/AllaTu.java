package allatu;

import java.util.Random;
import java.util.Scanner;

public class AllaTu {

    private static Caja[] cajas;

    public static void main(String[] args) {

        inicializarCajas();
        mostrarCajasCerradas();

        final int cajaJugador = escogerCajaJugador(
                cajas.length, "Que caja quieres para ti");

        int cajaAbrir;
        int turno = 0;
        int ofertaBanquero = 0;
        boolean plantar = false;

        do {
            cajaAbrir = escogerCajaJugador(cajas.length,"Que caja vas a abrir ");

            mostrarValorCaja(cajaAbrir);
            turno = contarTurno(turno);

            mostrarCajasCerradas();

            if (turno == 0) {
                ofertaBanquero = llamadaBanquero();
                System.out.println("Mi oferta es " + ofertaBanquero);
                plantar = tePlantas();
            }

        } while (!plantar && quedanCajasCerradas());

        finalJuego(plantar, ofertaBanquero, cajaJugador);
    }

    public static int escogerCajaJugador(int numCajas, String fraseInicial) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fraseInicial + " 1- " + numCajas + " ?");
        return sc.nextInt();
    }

    public static int contarTurno(int turno) {
        turno++;
        if (turno == 3) {
            turno = 0;
        }
        return turno;
    }

    public static int llamadaBanquero() {
        Random r = new Random();
        return r.nextInt(10000);
    }

    public static boolean tePlantas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Te plantas? (true / false)");
        return sc.nextBoolean();
    }

    public static void inicializarCajas() {
    cajas = new Caja[22];

    for (int i = 0; i < cajas.length; i++) {
        cajas[i] = new Caja(i + 1, i + 1);
    }
}

public static void mostrarCajasCerradas() {
    for (Caja c : cajas) {
        if (!c.isAbierta()) {
            System.out.print(c.getNumeroCaja() + " ");
        }
    }
}

public static void abrirCaja(int numeroCaja) {
    Caja c = cajas[numeroCaja - 1];
    c.abrir();
    System.out.println("La caja contiene: " + c.getPremio());
}

}