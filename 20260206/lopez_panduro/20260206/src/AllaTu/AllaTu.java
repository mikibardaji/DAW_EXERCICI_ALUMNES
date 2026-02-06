package src.AllaTu;

import src.Objetos.Caja;

public class AllaTu {

    public static void main(String[] args) {
        Caja[] cajas = crearCajas();
        mostrarEstado(cajas);

        abrirCaja(cajas, 0);
        abrirCaja(cajas, 2);

        mostrarEstado(cajas);
    }

    public static Caja[] crearCajas() {
        Caja[] cajas = new Caja[3];
        cajas[0] = new Caja(100);
        cajas[1] = new Caja(50);
        cajas[2] = new Caja(200);
        return cajas;
    }

    public static void abrirCaja(Caja[] cajas, int pos) {
        cajas[pos].abrir();
        System.out.println("He abierto la caja " + (pos + 1)
                + " con premio " + cajas[pos].getPremio());
    }

    public static void mostrarEstado(Caja[] cajas) {
        System.out.println("Estado de cajas:");
        for (int i = 0; i < cajas.length; i++) {
            System.out.println((i + 1) + " -> premio: "
                    + cajas[i].getPremio()
                    + " | abierta: " + cajas[i].isAbierta());
        }
        System.out.println();
    }
}
