import java.time.LocalDateTime;
import java.util.Scanner;

public class Fecha_Nacimiento {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuantos años tienes ");
    int usuario_edad = sc.nextInt();
    LocalDateTime hoy = LocalDateTime.now();  
    int anyo_actual = hoy.getYear();
    System.out.println("tienes " + usuario_edad + " Este " + anyo_actual);
    do 
    {
    anyo_actual--;
    usuario_edad--;
    System.out.println("En " +anyo_actual+" Tenias " + usuario_edad);
    }while (usuario_edad != 0);
    
    sc.close();
}
}
