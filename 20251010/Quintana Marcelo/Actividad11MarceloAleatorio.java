
// Generar 10 numero 
// SUmar los pares 
// Sumar depseus los impares

import java.util.Random;

public class Actividad11MarceloAleatorio {
    
public static void main(String[] args) {
Random rd = new Random();
int acum_pares=0,acum_impares=0;
int valor_aleatori;
for ( int contador = 1; contador <=10; contador++)
{
    valor_aleatori =  rd.nextInt(100,201);
    System.out.println("->" + valor_aleatori);



if (valor_aleatori % 2 == 0)
{
    acum_pares = acum_pares + valor_aleatori;
    System.out.println("Par");
}
else 
{
    acum_impares = acum_impares + valor_aleatori;
    System.out.println("impar");
}

    }   
    
    System.out.println("pares -> " + acum_pares);
    System.out.println("impares -> " + acum_impares);
 }    
}

