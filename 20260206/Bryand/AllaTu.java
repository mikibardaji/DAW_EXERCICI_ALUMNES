import java.util.Random;
import java.util.Scanner;

public class AllaTu {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] premios = {
            1, 5, 10, 20, 30, 40, 50, 60, 100, 400, 500, 800, 1000, 2000, 5000, 10000, 50000
        };

        Caja[] cajas = repartirPremios(premios);

        int miCaja = pedirCaja("Elige tu caja (1-" + cajas.length + "): ", cajas.length);
        int ronda = 0;
        int oferta = 0;
        boolean aceptarOferta = false;

        while (!aceptarOferta && hayCajasDisponibles(cajas, miCaja)) {

            int cajaElegida;

            do {
                cajaElegida = pedirCaja("Elige una caja para abrir: ", cajas.length);
                if (cajaElegida == miCaja) {
                    System.out.println("No puedes abrir tu propia caja.");
                } else if (cajas[cajaElegida].isAbierta()) {
                    System.out.println("Esa caja ya está abierta.");
                }
            } while (cajaElegida == miCaja || cajas[cajaElegida].isAbierta());

            cajas[cajaElegida].abrirCaja();
            System.out.println("Caja abierta → premio eliminado: "
                    + cajas[cajaElegida].getPremio() + "€");

            ronda++;
            mostrarOpciones(cajas, miCaja);

            if (ronda == 3) {
                ronda = 0;
                oferta = calcularOferta(cajas);
                System.out.println("Banquero: Te ofrezco " + oferta + "€");
                aceptarOferta = decidir();
            }
        }

        mostrarResultadoFinal(aceptarOferta, oferta, miCaja, cajas);
    }

    private static Caja[] repartirPremios(int[] premios) {
        Caja[] cajas = new Caja[premios.length];
        Random random = new Random();

        for (int premio : premios) {
            int posicion;
            do {
                posicion = random.nextInt(premios.length);
            } while (cajas[posicion] != null);

            cajas[posicion] = new Caja(premio);
        }
        return cajas;
    }

    private static int pedirCaja(String texto, int total) {
        int opcion;
        do {
            System.out.print(texto);
            while (!sc.hasNextInt()) {
                sc.next();
            }
            opcion = sc.nextInt() - 1;
        } while (opcion < 0 || opcion >= total);
        return opcion;
    }

    private static int calcularOferta(Caja[] cajas) {
        int suma = 0;
        int cerradas = 0;

        for (Caja c : cajas) {
            if (!c.isAbierta()) {
                suma += c.getPremio();
                cerradas++;
            }
        }
        return cerradas == 0 ? 0 : suma / cerradas;
    }

    private static void mostrarOpciones(Caja[] cajas, int miCaja) {
        System.out.print("Cajas sin abrir: ");
        for (int i = 0; i < cajas.length; i++) {
            if (!cajas[i].isAbierta() && i != miCaja) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }

    private static boolean hayCajasDisponibles(Caja[] cajas, int miCaja) {
        for (int i = 0; i < cajas.length; i++) {
            if (!cajas[i].isAbierta() && i != miCaja) {
                return true;
            }
        }
        return false;
    }

    private static boolean decidir() {
        sc.nextLine(); // limpiar buffer
        System.out.print("¿Aceptas la oferta? (SI / NO): ");
        return sc.nextLine().equalsIgnoreCase("SI");
    }

    private static void mostrarResultadoFinal(boolean aceptada, int oferta, int miCaja, Caja[] cajas) {
        if (aceptada) {
            System.out.println("Has aceptado " + oferta + "€");
            System.out.println("Tu caja tenía: " + cajas[miCaja].getPremio() + "€");
        } else {
            System.out.println("Has llegado al final");
            System.out.println("Tu premio es: " + cajas[miCaja].getPremio() + "€");
        }
    }
}
