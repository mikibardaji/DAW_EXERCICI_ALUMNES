//Pedir euros
//Mostrar menu "diferentes monedas"
//Si mo moneda= 1 euros * cambio dolares(1,17)
//sino si 1 euro por yenes   173,75
//sino si 1 euro por lempira   30,77



import java.util.Scanner;

public class Actividad13 {

    public static void main(String[] args) {
       
        Scanner src = new Scanner(System.in);
        double euros;
        final double cambio_dolares = 1.17;
        final double cambio_yenes = 173.88;
        final double cambio_Lempiras = 30.77;
        char moneda = 0;
        System.out.println(" Cuantos euros vas a importar ");
        euros = src.nextDouble();
        System.out.println(" A que moneda deseas cambiarlo? (1-Dolares 2-Yenes 3-Lempiras) ");
        moneda = src.next().charAt(moneda);

        switch (moneda) 
        {
            case '1':
            case 'D':
            euros = euros * 1.17;
                System.out.println("El cambio a dolares es de " + euros);
                break;
            case '2':
            case 'Y':
            euros = euros * 173.88;
                System.out.println("Tu cambio a yenes es de " + euros);
                break;
            case '3':
            case 'L':
            euros = euros * 10.64;
                System.out.println("Tu cambio a dirhams es de " + euros);
                break;
                default:
        }


    }
}
