import java.util.Scanner;

public class Ex10 {
public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    final double TARIFA = 15.00;
    double dinerobase, dineroextra=0;
    final double extra = 1.5;
    double sueldo, horasextra;
    System.out.println("Horas de trabajo: ");
    int Horas = lector.nextInt();
    if (Horas>=130) 
    {
        horasextra = Horas - 130;
        dineroextra= horasextra * extra * TARIFA;
        dinerobase = 130 * TARIFA;  
    }
    else 
    {
        dinerobase = Horas * TARIFA;
    }
         sueldo = dinerobase + dineroextra;
        System.out.println("vas a combrar con horas extras " + sueldo + " euros");


    }
}
