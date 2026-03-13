
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuConsola {

    private String titulo;
    private List<String> opciones;
    private int opcionSalida;

    public MenuConsola(String titulo) {
        this.titulo = titulo;
        this.opciones = new ArrayList<>();
        this.opcionSalida = 0;
    }

    public int getOpcionSalida() {
        return opcionSalida;
    }

    public void setOpcionSalida(int opcionSalida) {
        this.opcionSalida = opcionSalida;
    }

    public void añadirOpcion(String texto) {
        if (!opciones.contains(texto)) {
            opciones.add(texto);
        }
    }

    public void mostrarMenu() {
        System.out.println(titulo);

        for (int i = 0; i < opciones.size(); i++) {
            System.out.println(i + ". " + opciones.get(i));
        }
    }

    public int elegirOpcionValida() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("Ingresa una opcion: ");

        try {
            numero = sc.nextInt();
            sc.nextLine();

            if (numero < 0 || numero >= opciones.size()) {
                System.out.println("La opcion esta fuera de rango.");
                numero = opcionSalida;
            }

        } catch (InputMismatchException e) {
            System.out.println(" Debes ingresar un numero ");
            sc.nextLine();
            numero = opcionSalida;
        }

        return numero;
    }
}