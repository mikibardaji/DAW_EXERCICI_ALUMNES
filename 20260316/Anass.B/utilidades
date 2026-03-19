package utilidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuConsola {
    private String titulo;
    private List<String> opciones;
    private int opcionSalida;

public MenuConsola(String titulo) {
        this.titulo = titulo;
        this.opciones =  new ArrayList<>();
        this.opcionSalida = 0;
    }

public void anyadirOpcion(String text){
    // Comprobamos si NO está en la lista antes de añadirlo
    if (!opciones.contains(text)) {
        opciones.add(text);
    }
}


public void mostrarMenu() {
    System.out.println("===== " + this.titulo + " =====");

    for (int i = 0; i < opciones.size(); i++) {
        System.out.println(i + ".- " + opciones.get(i));
    }
    System.out.print("Escull una opcio: ");
}

public int llegirOpcioValida() {
    Scanner sc = new Scanner(System.in);
    int opcio;

    try {
        opcio = sc.nextInt();
        sc.nextLine();
        if (opcio >= 0 && opcio < opciones.size()) {
            return opcio;
        } else {
            return opcionSalida; // Si no es válida, devolvemos salida
        }
    } catch (Exception e) { 
        System.out.println("Error! No has introducido un numero.");
        return opcionSalida; 
    }
}

public int getOpcionSalida() {
    return opcionSalida;
}

public void setOpcionSalida(int opcionSalida) {
    this.opcionSalida = opcionSalida;
}

}
