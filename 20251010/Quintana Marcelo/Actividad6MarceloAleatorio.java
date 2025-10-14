import java.util.Random;

public class Actividad6MarceloAleatorio {

public static void main(String[] args) {
Random rd = new Random();
boolean negativo= false;

int valor_aleatori;
for ( int contador = 0; contador < 4; contador++)
{
    valor_aleatori =  rd.nextInt(-5,6);

    if (valor_aleatori < 0)
    {
        negativo=true;
    }
}
    
    if (negativo==true)

    {
        System.out.println(" Alguno era negativo ");
    }
    else
    {
       System.out.println("Todos eran negativos");
    }

    }
}