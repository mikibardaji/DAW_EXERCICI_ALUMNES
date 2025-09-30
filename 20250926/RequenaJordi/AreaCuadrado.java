import java.util.Scanner;

public class AreaCuadrado {


    public static void main(String[] args) {
//Preguntar datos al usuario        
 Scanner sc = new Scanner(System.in);

  System.out.print("Introduce la medida de un lado del cuadrado: ");
  int lado = sc.nextInt();
//Cálculo de la medida de la medida del cuadrado
     int AreaCuadrado = lado * lado;
//Mostrar la medida al usuario
System.out.print("El area del cuadrado es de " + AreaCuadrado + " metros. ");


    }
}
