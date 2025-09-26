import java.util.Scanner;

public class CalcularMillas {


    public static void main(String[] args) {
        
final int CONSTANTE = 1609;        
//Pedir las millas al usuario
Scanner sc = new Scanner(System.in);
System.out.println(" Introduce las millas ");
double millas = sc.nextDouble();

//Cálculo metros (metros a millas) 

double metros = millas * CONSTANTE;


//Mostrar al usuario cuantos metros són
System.out.println("Són " + metros + " metros");

    }
}
