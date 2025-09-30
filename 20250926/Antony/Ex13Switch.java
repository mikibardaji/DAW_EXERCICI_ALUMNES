import java.util.Scanner;

public class Ex13Switch {
public static void main(String[] args) {
    
     Scanner dato = new Scanner(System.in);
    final double Euro_Dolares = 1.17; 
    final double Euro_Yenes = 163.89;
    final double Euro_Dirham = 10.63;
    int Menu;
    double cambio;
     System.out.println("Cantidad de Euros: " );
    double Euro = dato.nextDouble();
    System.out.println("1- Dolar (D)");
    System.out.println("2- Yene (Y)");
    System.out.println("3- Dirham (H)");
    System.out.println("A que moneda quieres cambiar?");
    char moneda = dato.next().charAt(0);

    if (moneda ==1) //Dolares 
    { 
        cambio = Euro * Euro_Dolares;
        System.out.println(Euro + "Euros son" + cambio + "Dolares" );
    }
    else if (moneda ==2) 
    {
     cambio = Euro * Euro_Yenes;
     System.out.println(Euro + "Euros son" + cambio +"Yenes"); 

    }
    else if (moneda ==3)
    {
    cambio  = Euro * Euro_Dirham;
    System.out.println(Euro + "Euros son" + cambio + "Dirham");
    }
    else
    {
        System.out.println("Opcion incorrecta");
    }
    
    switch (moneda) {
    cambio = Euro * Euro_Dolares
        case 'd':
        case 'D':
            System.out.println("El cambio es de Dolares");
            break;
    cambio = Euro * Euro_Yenes
        case 'y':
        case 'Y':
            System.out.println("El cambio es de Yenes");
            break;
        cambio = Euro * Euro_Dirham
        case 'h':
        case 'H':
            System.out.println("El cambio es de Dirham");
            break;
        default:
            System.out.println("Error de cambio");
            break;
        }
}
}
