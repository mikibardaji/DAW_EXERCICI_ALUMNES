import java.util.Scanner;

public class Ex10 {
public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    final double TARIFA = 15.00;
    final double extra = 1.5;
    final double sin_impuestos = 1000;
    final double porcentaje_impuestos = 25%;
    double dinerobase, dineroextra= 0;
    double sueldo, horasextra, Horas;
    System.out.println("Horas de trabajo: ");
    Horas = lector.nextDouble();
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
        System.out.println("Vas a cobrar normal "+ dinerobase + " euros ");
        System.out.println("vas a combrar con horas extras " + sueldo + " euros");
        System.out.println("Vas a cobrar sin impuestos " + sueldo_final+ "euros");
    Double impuestos = 0 , sueldo_superior;
    if (sueldo > sin_impuestos)
        {
            sueldo_superior = sueldo - sin_impuestos;
            impuestos = sueldo * porcentaje_impuestos;
        }
        sueldo = sueldo - impuestos;
        System.out.println("Impuestos");
    }
}
