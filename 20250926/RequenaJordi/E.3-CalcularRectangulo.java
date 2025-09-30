import java.util.Scanner;

public class CalcularRectangulo {

public static void main(String[] args) {
    //Preguntar datos al usuario (base y altura del rectángulo) 
     Scanner sc = new Scanner(System.in);
 System.out.print("Introduce la base del rectángulo: ");
int base = sc.nextInt();

//Preguntar altura del rectángulo al usuario
System.out.print("Introduce la altura del rectángulo: ");
int altura = sc.nextInt();

//Cálculo 

int area = base * altura;

//Mostrar al usuario la medida del rectángulo
System.out.print("La medida del rectángulo es " + area + " metros");


}
}
