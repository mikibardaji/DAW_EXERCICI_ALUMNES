import java.time.LocalDateTime;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();  
        int año_actual = hoy.getYear();
        int edad;     

        System.out.println("Introduce tu edad");
        edad = sc.nextInt();

        int año_nacimiento = año_actual - edad; 
        
        // Bucle de mayor a menor
        for (int año = año_actual; año >= año_nacimiento; año--) {
            int edad_ese_año = año - año_nacimiento;
            System.out.println("En el " + año + " tenías " + edad_ese_año + " años.");  
        }
        sc.close();
    }
}