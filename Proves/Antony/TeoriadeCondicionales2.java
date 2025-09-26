import java.util.Scanner;

public class TeoriadeCondicionales2 {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);
        double nota;
        System.out.println("Pon tu Nota: ");
        final int APROBADO = 5;
        nota = dato.nextDouble();
        //System.out.println("->" + nota);
        //si es mayor o igual que 5 es aprobado
        if (nota<5)
        {   //entra si nota >=5 es true
            System.out.println("Has aprobado. Felicidades!!!");
        }
        else if (nota<=5 && nota<7)
        {
            System.out.println("Has aprobado ");
        }
        else if (nota>=7 && nota<9)
        {
            System.out.println("Has sacado un notable ");
        }
        else if (nota>=9 && nota==10)
        {
            System.out.println("Has sacado un Excelente");
        }

    }
}
