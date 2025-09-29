import java.util.Scanner;

public class tellezmarkEx12 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   
    System.out.println("color de semaforo");
    String color = scanner.nextLine();
    if (color.equalsIgnoreCase("verde")) {
        System.out.println("puedes avanzar");
    } else if (color.equalsIgnoreCase("amarillo")) {
        System.out.println("debes detenerte");
    } else if (color.equalsIgnoreCase("rojo")) {
        System.out.println("no puedes avanzar");
    } else {
        System.out.println("color no valido");
    }
}
}
/*
Preguntar al niño: "¿De qué color está el semáforo? (verde/naranja/rojo)"

Si la respuesta es "verde"
    Decir: "Puedes pasar"
Si la respuesta es "naranja"
    Decir: "Espera"
Si la respuesta es "rojo"
    Decir: "Tienes que parar"
Si no es ninguno de esos colores
    Decir: "Ese color no es válido"

 */