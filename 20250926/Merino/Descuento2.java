    import java.util.Scanner;

public class Descuento2 {
    public static void main(String[] args) {
        System.out.println("Hola, soy el nuevo archivo :)");

        Scanner sc =new Scanner (System.in);
        //Pedir precio original
        System.out.println("¿Cuál es el precio original?");
        double PrecioOriginal;
        PrecioOriginal =sc.nextDouble();
        //Pedir precio final
        System.out.println("¿Cuál es el precio final?");
        double PrecioFinal;
        PrecioFinal =sc.nextDouble();
        //Calcular el descuento aplicado
        //Restar del precio original, el precio final
        double PrecioRestado= PrecioOriginal - PrecioFinal;
        //Del resultado de la resta, dividimos entre el precio inicial
        double PrecioDividido= PrecioRestado / PrecioOriginal;
        //Del resultado de la división, multiplicamos por 100
        double PorcentajeDescontado= PrecioDividido * 100;

        //Mostrar resultado
        System.out.println("El descuento aplicado es de un: " + PorcentajeDescontado + "%");
    }

}
