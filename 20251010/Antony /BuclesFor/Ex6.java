import java.util.Random;

public class Ex6 {
public static void main(String[] args) {
    Random rd = new Random();

    int valor = 0;
    //int negativo = 0
    boolean negativo = false;
    for (int n=0; n<4;n++)
    {
    valor = rd.nextInt(-5, 6);
    System.out.println(valor);
    
    if  (valor<0  && negativo==false)
    //if (valor<0)
        {
    negativo = true;//detecta nummero negativo
        }
    }
    if (negativo==true) //dos condiiones
        {
        System.out.println("hay un negativo");
        }
    else    
    {
        System.out.println("No hay negativos");
    }
    }
}


