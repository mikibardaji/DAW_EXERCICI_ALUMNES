import java.util.Scanner;

public class TeoriaCondicionales {
    public static void main(String[] args) throws Exception {
        //programa que te dice si has aprobado
        Scanner sc = new Scanner(System.in);
        final int APROBADO = 5;
        double nota;
        System.out.println("Pedir nota? ");
        nota = sc.nextDouble();
        //System.out.println("->" + nota);
        //si es mayor o igual que 5 es aprobado
        if (nota<APROBADO) 
            { //entra si  es true
             System.out.println("Has suspes, torna l'any que ve.");     
            }
        else if (nota>=5 && nota<7)
            {
                System.out.println("Has aprobado");
            }
        else if (nota>=7 && nota<9)
            {
             System.out.println("Has sacado un notable");   
            }
        else if (nota>=9 && nota <=10)
            {
             System.out.println("Has sacado un excelente");
            }

    }
}
