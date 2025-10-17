import java.util.Random;
import java.util.Scanner;

public class Clash {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int daño=0;
    System.out.println("Pon el nivel de tu leñador ");
    int nivel_leñador = sc.nextInt();
    if (nivel_leñador==9) 
    {
        daño = 220;    
    }
    else if (nivel_leñador == 10) 
    {
        daño = 242;    
    }
    else if (nivel_leñador == 11) 
    {
        daño = 266;    
    }
    else if (nivel_leñador == 12) 
    {
        daño = 292;    
    }
    System.out.println("Tu leñador tiene" + daño + " de ataque" );
    int vida=0;
    Random rd = new Random ();
    int nivel_torre = rd.nextInt(9,13);
    int vida_torre=0;

    if (vida_torre==9) 
    {
        vida=240;    
    }
    else if (vida_torre==10) 
    {
        vida=280;    
    }
    System.out.println("Tu torre tiene" + vida + " de vida" );
    sc.close();
}
}
