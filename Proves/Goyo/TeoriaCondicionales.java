import java.util.Scanner;

public class TeoriaCondicionales{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final double nota;

        System.out.println("Que nota has sacado? ");
        nota = sc.nextDouble();

        if (nota<5)
            {
             System.out.println("Has suspendido, vuelve el año que viene");
            }
        else if (nota>=5 && nota<7) 
            {
             System.out.println("Has aprobado");
            }
        else if (nota>=7 && nota<9) 
            {
             System.out.println("Has sacado un notable");
            }
        else if (nota>=9 && nota==10) 
            {
             System.out.println("Has sacado un excelente");
            }
        else
            {
             System.out.println("Nota incorrecta");
            }

    }
}
