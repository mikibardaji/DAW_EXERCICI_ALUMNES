import java.util.Scanner;

public class FiguereoDanielEx9 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Pedir hora
    int hora;
    System.out.println("Ingrese la hora: ");
    hora = sc.nextInt();
    //Pedir minutos 
    int minutos;
    System.out.println("Ingrese los minutos: ");
    minutos = sc.nextInt();
    //Pedir segundos
    int segundos;
    System.out.println("Ingrese los segundos: ");
    segundos = sc.nextInt();
    //sumar 1 segundo
    segundos = segundos + 1;
    //Si segundos >= 60
    if (segundos >= 60)
    {
        segundos = 0;
        minutos = minutos + 1;
    }
    //Si minutos >= 60
    if (minutos >= 60)
    {
        minutos = 0;
        hora = hora + 1;
    }
    //Si hora >= 24
    if (hora >= 24)
    {
        hora = 0;
    }
    //Mostrar hora, minutos, segundos
    System.out.println("La hora es: " + hora + ":" + minutos + ":" + segundos);

    //Daniel Figuereo
}
}
