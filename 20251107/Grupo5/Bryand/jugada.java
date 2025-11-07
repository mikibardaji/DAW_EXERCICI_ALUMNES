import java.util.Scanner;

public class jugada {
       public static void main(String[] args)
       {
        int jugar = asignaEnteroJugador();
       }

    public static int asignaEnteroJugador()
        {
        Scanner sc = new Scanner(System.in); 
        int  jugada;
        do
        {
        System.out.println("Que sacas? pierda (0), papel (1), tijera (2)");
        jugada = sc.nextInt();            
        }while (jugada>2 || jugada< 0);
        return jugada; 
    
    }
}
