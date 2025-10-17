// Pide un programa que pida introducir Pin hasta 3 veces: Simularemos la entrada de un portal de un banco donde te pide un pin (el pin sera 1234), te ha de pedir el pin hasta que adivinar el pin, o al tercer golpe tiene terminar diciendo que se ha sobrepasado el número máximo de intentos.

import java.util.Scanner;

public class Actividad2_reforç_Marcelo {
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
int pinCorrecto = 1234;
int intentosMaximos = 3;
int intentos = 0;
boolean pinAdivinado = false;

while (intentos < intentosMaximos && !pinAdivinado) {
    System.out.print("Introduce el PIN: ");
    int pinIntroducido = sc.nextInt();
    intentos++;

    if (pinIntroducido == pinCorrecto) {
        pinAdivinado = true;
        System.out.println("PIN correcto");
    } else {
        System.out.println("PIN incorrecto.");
    }

}if (!pinAdivinado) {
    System.out.println("Se ha sobrepasado el número máximo de intentos.");


}

}
}
