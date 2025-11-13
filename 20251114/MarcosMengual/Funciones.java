import java.util.Random;

public class Funciones {

    public static void main(String[] args) {

    }

    public static int numero_carta_aleatoria() {
        Random rd = new Random();
        int numero_aleatorio = rd.nextInt(1, 11);

        if (numero_aleatorio == 8) 
        {
            return 10;    
        }
        else if (numero_aleatorio == 9) 
        {
            return 11;    
        }
        else if (numero_aleatorio == 10) 
        {
            return 12;    
        }
        else 
        {
            return numero_aleatorio;
        }
    } 

    public static int carta_aleatoria() {
        Random rd = new Random();
        int valores = rd.nextInt(1, 5);
        return valores;       
    }

    public static void imprimir_cartas(int numero, int pal) {
        System.out.print(" Carta: ");
        if (numero >= 1 && numero <=7) 
        {
            System.out.println(numero);    
        }
        else if (numero == 10) 
        {
            System.out.println(" SOTA ");    
        }
        else if (numero == 11) 
        {
            System.out.println(" CABALLO ");    
        }
        else if (numero == 12) 
        {
            System.out.println(" REY ");    
        }

        System.out.print(" de: ");
        if (pal == 1) 
        {
            System.out.println(" OROS ");    
        }
        else if (pal == 2) 
        {
            System.out.println(" BASTOS ");    
        }
        else if (pal == 3) 
        {
            System.out.println(" ESPADAS ");    
        }
        else if (pal == 4) 
        {
            System.out.println(" COPAS ");    
        }
    }

    public static double puntos_cartas(int numero_carta) {
        if (numero_carta >= 1 && numero_carta <= 7) 
        {
            return numero_carta;
        }
        else if (numero_carta == 10 || numero_carta == 11 || numero_carta == 12) 
        {
            return 0.5;    
        }
        else 
        {
            return 0;
        }
    }

    public static boolean banco_pide_carta(double puntos_jugador, double puntos_banco) {
        if (puntos_jugador <= 7.5 && puntos_banco < puntos_jugador) 
        {
            return true;    
        }
        if (puntos_banco < 5) 
        {
            return true;    
        }
        else 
        {
            return false;
        }
    }

    public static boolean gana_jugador (double puntos_jugador, double puntos_banco) {
        if (puntos_jugador <= 7.5 && puntos_banco < puntos_jugador) 
        {
            System.out.println(" Ha ganado el jugador ");
            return true;    
        }
        else if (puntos_banco > 7.5) 
        {
            System.out.println(" Ha ganado el jugador ");    
            return true;
        }
        else 
        {
            System.out.println(" Gano el Banco ");
            return false;
        }
    }
}
