
import java.util.Random;
import java.util.Scanner;

public class GrupoDanielMohamedRULETA {
    public static void main(String[] args) {
        
    }
    public static int Afegir(int saldo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos puntos quiere añadir?");
        saldo = sc.nextInt();
        return saldo;
    } 
    public static int Apostar(int puntsTotal, int puntsAposta){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantitat total de punts disponibles?");
        puntsTotal = sc.nextInt();
        System.out.println("Quantitat de punts que vol apostar?");
        puntsAposta = sc.nextInt();
        if(puntsTotal < puntsAposta){
            return -1 ;
        }
        else{
            return puntsAposta;
        }
    }
    public static int bola(){
        Random rd = new Random();
        int bola = rd.nextInt(0,37);
        return bola;
    }   
    public static void pintaAsterisc(int numero){
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
         System.out.println("-" + numero);
    }
    public static int QuantitatAposta(){
        Scanner sc = new Scanner(System.in);
        int quantitataposta;
        do { 
            System.out.println("Quina quantitat vols apostar? ");
            quantitataposta = sc.nextInt();

            if (quantitataposta < 0){
                System.out.println("Numero no valido");
            }
            else if (quantitataposta == 0){
                System.out.println("Has salido del juego");
            }
        } while (quantitataposta < 0);
        return quantitataposta;
    }
    public static int tipusAposta(){
        Scanner sc = new Scanner(System.in);
        int aposta;
        do{
        System.out.println("quin tipus d’aposta vol fer? (-2 Parell | -1 Senar | 1-36 numero)");
        aposta = sc.nextInt();
        }while (!(aposta == -2 || aposta ==-1 || (aposta>=1 && aposta<=36)));
        return aposta;
    }
    public static int resultatJugada(int tipusAposta, int saldo, int puntsAposta, int bola) {
    if (tipusAposta == bola) {
        System.out.println("Has ganado: " + (puntsAposta * 36));
        saldo += puntsAposta * 36;
    }
    else if (tipusAposta == -1 && bola % 2 == 0) {
        System.out.println("Has ganado: " + (puntsAposta * 2));
        saldo += puntsAposta * 2;
    }
    else if (tipusAposta == -2 && bola % 2 != 0) {
        System.out.println("Has ganado: " + (puntsAposta * 2));
        saldo += puntsAposta * 2;
    }
    else{
        System.out.println("Has perdido");
    }

    return saldo;
    }

}


    

    



