import java.util.Random;

public class Sumas_Inpar_Par {
public static void main(String[] args) {
    Random rd = new Random();
    int inpares = 0,pares = 0, valor;
    for (int generar = 0; generar<10; generar++)
    {
        valor=rd.nextInt(100, 201);
        System.out.println(valor);
    
    if (valor % 2 == 0) 
    {
        pares=pares+valor;
        System.out.println("Pares camulados: " + pares);
    }
    else if (valor % 2 !=0)
    {
        inpares=inpares+valor;
        System.out.println("Inpares camulados: " + inpares);
    }
    }
    System.out.println("Pares: " + pares);
    System.out.println("Inpares: " + inpares);
}
}
