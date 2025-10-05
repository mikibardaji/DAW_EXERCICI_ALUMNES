import java.util.Scanner;

public class FiguereoDanielPGLibreEx1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        //Programa que te pregunte cuantas horas has estudiado para el examen de conducir
        //Y te diga si has estudiado mucho o poco
        //Pseudocodigo 
        //Establecer variable horas
        //Preguntar al usuario cuantas horas a estudiado
        //Establecer condicion
        // si horas < 1 falta mucho por estudiar
        //si horas < 2 has estudiado bien pero falta un poco
        //Si horas < 4 has estudiado suficiente
        int horas;
        System.out.println("¿Cuantas horas has estudiado?");
        horas = sc.nextInt();
        if (horas < 1) {
            System.out.println("Tienes que estudiar bastante más. Animo!!!");
        
        }
        else if (horas < 2) {
            System.out.println("Has estudiado bien, pero estudia un poco mas!!");
            
        }
        else if (horas <= 5) { 
            System.out.println("Has estudiado suficiente. Felicidades!!");
            
        }

    }
}
