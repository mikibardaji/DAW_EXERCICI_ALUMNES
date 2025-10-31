import java.util.Random;

public class Detectarprimernegativo {
public static void main(String[] args) {
    Random rd = new Random();

    int valor = 0;
    //int negativo = 0
    boolean negativo = false;
    do
    {
    valor = rd.nextInt(-5, 6);
    System.out.println(valor);
    
    if  (valor<0  && negativo==false)
    //if (valor<0)
        {
    negativo = true;//detecta nummero negativo
        }
        valor++;
    } while(valor<4 && negativo==false);

    if (negativo=true) //dos condiiones
        {
        System.out.println("hay un negativo");
        }
    else    
    {
        System.out.println("No hay negativos");
    }
    }
}
