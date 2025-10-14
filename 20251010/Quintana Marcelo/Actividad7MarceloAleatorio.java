import java.util.Random;

public class Actividad7MarceloAleatorio {


public static void main(String[] args) {
Random rd = new Random();

 boolean negativo= false;
 int valor_aleatori;
 int num_negativo=0, num_positivo=0;
 for ( int contador = 1; contador <=10; contador++)
{
    valor_aleatori =  rd.nextInt(-3,11);
    System.out.println("->" + valor_aleatori);

     if ( num_positivo<0)
    {
     num_negativo ++;
    }
      else if (valor_aleatori > 0)
    {
        num_positivo++;
    }
    }
     

        System.out.println("Cantidad de números positivos: " + num_positivo);
        System.out.println("Cantidad de números negativos: " + num_negativo);
            

 }    
}
