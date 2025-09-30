import java.util.Scanner;

public class MengualMarcosEx13 {

    public static void main(String[] args) {
        //Pedir el importe en euros
        //Mostrar menu
        //Preguntar moneda
        //si monede= 1  euros por dolares
        //si moneda= 1 euros por yenes
        //si moneda= 1 euros por dirhams
        
        Scanner src = new Scanner(System.in);
        double euros;
        final double cambio_dolares = 1.17;
        final double cambio_yenes = 173.88;
        final double cambio_dirhams = 10.64;
        char moneda = 0;
        System.out.println(" Cuantos euros vas a importar ");
        euros = src.nextDouble();
        System.out.println(" A que moneda deseas cambiarlo? (1 o D =Dolares 2 o Y =Yenes 3 o H =Dirhams) ");
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
            case 'H':
            euros = euros * 10.64;
                System.out.println("Tu cambio a dirhams es de " + euros);
                break;
                default:
                System.out.println(" Oprcion incorrecta ");
        }


    }
}


