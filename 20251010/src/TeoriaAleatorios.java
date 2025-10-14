import java.util.Random;

public class TeoriaAleatorios {
public static void main(String[] args) {
    //exmeple 1 generar aleatoris del 1 al 10
    Random rd = new Random();
    int aleatorio = 0;
    for (int i = 0; i < 10; i++) 
    {
     aleatorio = rd.nextInt(1,11);
    System.out.println(aleatorio);
    }
    System.out.println(aleatorio);
    for(int i = 0 ; i < 10; i++) {
        aleatorio = rd.nextInt(15, 36);
        System.out.println(aleatorio);
    }
    for(int i = 0 ; i < 10; i++) {
        aleatorio = rd.nextInt(-10,1);
        System.out.println(aleatorio);
    }
    System.out.println("generar 15 aleatoriso con decimales del 1 al 10");
    double aleatorio_double;
    //example generar 15 aleatorios con decimales del 1 al 10                                                             
    for(int i = 0 ; i < 15; i++) 
    {
        aleatorio_double = rd.nextDouble(1, 10);
        System.out.println(aleatorio_double);
    }

}
}
