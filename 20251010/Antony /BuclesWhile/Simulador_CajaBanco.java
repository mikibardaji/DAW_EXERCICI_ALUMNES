import java.util.Scanner;

public class Simulador_CajaBanco {
public static void main(String[] args) {
    final int pin = 9227;
    Scanner sc = new Scanner(System.in);
    int contador=3;
    System.out.println("Añade el PIN");
    int pin_usuario=sc.nextInt();
    do
    {
    if (pin_usuario==pin) 
    {
        System.out.println("Correcto ");   
    }
    else
    {
        System.out.println("Incorrecto");
        contador--;
        
    } 
    
    } while (contador>0 && pin_usuario!= pin); 
    sc.close();
}
}
