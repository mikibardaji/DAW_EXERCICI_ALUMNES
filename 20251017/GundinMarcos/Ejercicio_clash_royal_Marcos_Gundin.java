import java.util.Random;
import java.util.Scanner;

public class Ejercicio_clash_royal_Marcos_Gundin {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int nivel_lenyador;
        int nivel_torre;
        int golpe_lenyador = 0;
        int vida_lenyador = 0;
        int golpe_torre = 0;
        int vida_torre = 0;
        int ataque = 1;

        do {
            System.out.println("¿A qué nivel tienes el leñador? (11-13)");
            nivel_lenyador = sc.nextInt();

            if (nivel_lenyador < 11 || nivel_lenyador > 13) {
                System.out.println("Nivel incorrecte, torna a intentarlo. ");
            }

        } while (nivel_lenyador < 11 || nivel_lenyador > 13);

        nivel_torre = rd.nextInt(11, 14);

        if (nivel_lenyador == 11) {
            golpe_lenyador = 242;
            vida_lenyador = 1282;
        } else if (nivel_lenyador == 12) {
            golpe_lenyador = 266;
            vida_lenyador = 1409;
        } else if (nivel_lenyador == 13) {
            golpe_lenyador = 292;
            vida_lenyador = 1547;
        } else {
            System.out.println("Este nivel del leñador no es válido, vuelve a insertarlo");
        }

        if (nivel_torre == 11) {
            golpe_torre = 109;
            vida_torre = 3052;
        } else if (nivel_torre == 12) {
            golpe_torre = 119;
            vida_torre = 3346;
        } else if (nivel_torre == 13) {
            golpe_torre = 131;
            vida_torre = 3668;
        } else {
            System.out.println("Error, vuelve a ejecutar el programa");
        }

        System.out.println("Daño del leñador por cada golpe: " + golpe_lenyador +
                " y esta es la vida que tiene: " + vida_lenyador);
        System.out.println("Daño de la torre por cada golpe: " + golpe_torre +
                " y esta es la vida que tiene: " + vida_torre);

        do {
            System.out.println(ataque + " ataque -> ");
            ataque++;
            System.out.println("El leñador ataca a la torre");
            System.out.println("Valor del ataque del leñador: " + golpe_lenyador);
            vida_torre = vida_torre - golpe_lenyador;
            System.out.println("Vida de la torre: " + vida_torre);

            System.out.println("La torre ataca al leñador");
            System.out.println("Valor del ataque de la torre: " + (golpe_torre * 2));
            vida_lenyador = vida_lenyador - (golpe_torre * 2);
            System.out.println("Vida del leñador: " + vida_lenyador);
        } while (vida_torre >= 0 && vida_lenyador >= 0);

        if (vida_lenyador <= 0) {
            System.out.println("¡Ha ganado la torre!");
        } else if (vida_torre <= 0) {
            System.out.println("¡Ha ganado el leñador!");
        }
    }
}
