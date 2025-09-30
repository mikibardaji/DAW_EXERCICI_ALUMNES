import java.util.Scanner;

public class Ejercicio_13_teorias_condicionales {
    public static void main(String[] args) throws Exception {
        
    //Preguntar al usuario el dinero en euros

    //Mostrar menu

    //Preguntar moneda

    //Hacer el cambio a la moneda escojida

    //Ensenyar al usuario el cambio a la moneda escojida

        double euros, dolares, dirham, libras, equivalencia;
        int cambio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto dinero tienes? ");
        euros = sc.nextDouble();

        dolares = 1.17;
        libras = 0.87;
        dirham = 10.64;

        System.out.println("A que moneda quieres hacer el cambio? D-Dolares, L-Libras, H-Dirham");
        cambio = sc.next().charAt(0);

        switch (cambio) {
            case 'D':
                equivalencia = euros * dolares;
                System.out.println("Estos son los Dolares que tendras: " + equivalencia);
                break;
            case 'L':
                equivalencia = euros * libras;
                System.out.println("Estos son las Libras que tendras: " + equivalencia);
                break;
            case 'H':
                equivalencia = euros * dirham;
                System.out.println("Estos son los Dirham que tendras: " + equivalencia);
                break;
            default:
            System.out.println("Escribe un valor correcto");
                break;
        }
    }
        
}


