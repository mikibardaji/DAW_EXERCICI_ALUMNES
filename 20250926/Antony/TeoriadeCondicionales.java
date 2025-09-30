import java.util.Scanner;

public class TeoriadeCondicionales {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);
        double nota;
        System.out.println("Pon tu Nota: ");
        final int APROBADO = 5;
        nota = dato.nextDouble();
        //System.out.println("->" + nota);
        //si es mayor o igual que 5 es aprobado
        if (nota>=APROBADO)
        {   //entra si nota >=5 es true
            System.out.println("Has aprobado. Felicidades!!!");
        }
        else //si no se cumple el if, el else no es obligatorio
        {
            System.out.println("Has suSspendido, vuelve el año siguiente.");
        };



    }
}
