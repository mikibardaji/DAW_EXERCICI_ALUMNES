import java.util.Scanner;


public class MengualMarcosEx11 {


    public static void main(String[] args) {
       
        //Pedir al usuario un precio
        //Pedir al usuario lo que paga
        //Si el precio es > paga imprimira "sobran tantos euros"
        //Si la paga es < que el precio imprimira "faltan tantos euros"
        //Si la paga y el precio es igual imprimir "El pago esta exacto"
        //Mostrar al usuario


        Scanner src = new Scanner(System.in);
        double precio;
        System.out.println(" Dime el precio ");
        precio = src.nextDouble();
        double paga;
        System.out.println(" Cuanto vas a pagar ");
        paga = src.nextDouble();


        if (paga>precio)
        {
            paga = paga - precio;
            System.out.println(" Sobran " + paga + "euros");    
        }
        else if (precio>paga)
        {
            precio = precio - paga;
            System.out.println(" Faltan " + precio + "euros");    
        }
        else if (paga==precio)
        {
            System.out.println(" El pago esta exacto ");    
        }
    }
}

