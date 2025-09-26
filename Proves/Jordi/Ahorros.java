import java.util.Scanner;

public class Ahorros {

public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    
//Tiene que saber cuantas monedas tienes de 50 centimos y decirte cuanto has ahorrado

int monedas;
double ahorro;
//Contar monedas (usuario)
 System.out.println("Pon las monedas que tienes: ");
 monedas = sc.nextInt();
//Multiplicar mondedas 0,50 (ahorro)
ahorro = monedas * 0.50;
//Dar el resultado
 System.out.println("Has ahorrado un total de " + ahorro + " euros");


}
}
