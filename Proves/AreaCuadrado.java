import java.util.Scanner;

public class AreaCuadrado {



public static void main(String[] args) {
 
    //Preguntar lado
    Scanner sc =new Scanner (System.in);
    double lado;
    System.out.println("Qué mide el lado?");
    lado =sc.nextDouble();

    //Calcular área: multiplicar lado * lado
    double area = lado * lado;
    //Mostrar el área
    System.out.println("El área final del cuadrado es" + area);

    
}


}
