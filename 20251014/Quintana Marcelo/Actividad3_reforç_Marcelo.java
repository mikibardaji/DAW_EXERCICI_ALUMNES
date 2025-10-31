// Escribe un programa que pida la edad y a partir del año que nos encontramos, nos muestre la edad que tenia el usuario en cada año hasta su nacimiento.
// Para saber el año que nos encontramos escribe estas dos lineas
// LocalDateTime hoy = LocalDateTime.now();  
// int anyo_actual = hoy.getYear();        

import java.util.Scanner;

public class Actividad3_reforç_Marcelo {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
int edad;
int anyo_actual = 2025;

System.out.println("Introduce tu edad: ");
edad = sc.nextInt();

 for (int i = 0; i <= edad; i++) {
    int anyo_nacimiento = anyo_actual - edad + i;
    int edad_en_anyo = i;
    System.out.println("En el año " + anyo_nacimiento + " tenías " + edad_en_anyo + " años.");
    
 }

 System.out.println("Tines " + edad + " años en " + anyo_actual);
}
 }   
