import java.util.Scanner;

public class Ahorros {
public static void main(String[] args) {
    
    /*ENUNCIADO: Tiene que saber cuantas monedas tienes de (50 centimos)
y decirte cuanto has ahorrado*/
Scanner lectorTeclado = new Scanner(System.in);
int monedas; 
// contar monedas (usuario)
System.out.println("  Cuantas monedas tienes?  ");
monedas = lectorTeclado.nextInt();
// multiplicar monedads por 0,50 (ahorro)
double ahorro = monedas * 0.50;
//dar el resultado
System.out.println("Tienes un total de  " + ahorro + " euros");

}
}
