import java.util.Scanner;

public class horasTrabajadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TARIFA = 15;
        double dineroBase = 0;
        double dineroExtra = 0;

        System.out.print("Introduce el numero de horas trabajadas:");
        double horas = sc.nextDouble();

        if (horas >= 130) 
            {
             double extra = horas - 130;
             dineroExtra = extra*1.5*TARIFA;
             dineroBase = 130*TARIFA;
             double sueldo = dineroExtra + dineroBase;
             System.out.println("Tu sueldo final es " + sueldo + "euros");   
            }
        else
            {
             double total = dineroBase+horas*TARIFA;
             System.out.println("Tu sueldo final es " + total + "euros");   
            }
            
    }

}
